package com.grpcmovie.aggregator.service;

import com.dk.grpcmovie.common.Genre;
import com.dk.grpcmovie.movie.*;
import com.dk.grpcmovie.user.*;
import com.grpcmovie.aggregator.dto.CommentDto;
import com.grpcmovie.aggregator.dto.Favorite;
import com.grpcmovie.aggregator.dto.RecommendedMovie;
import com.grpcmovie.aggregator.dto.UserGenre;
import com.grpcmovie.aggregator.exception.BadGenreUpdateRequestException;
import com.grpcmovie.aggregator.exception.MovieNotSavedException;
import com.grpcmovie.aggregator.exception.UserNotFoundException;
import com.grpcmovie.aggregator.exception.UserNotSavedException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserMovieService {

    @GrpcClient("user-service")
    public UserServiceGrpc.UserServiceBlockingStub userStub;

    @GrpcClient("movie-service")
    public MovieServiceGrpc.MovieServiceBlockingStub movieStub;

    //comment
    public List<CommentDto> getMovieComments(int movieId){

        AllCommentResponse allCommentResponse = movieStub.getCommentsForMovie(GetCommentsRequest.newBuilder().setMovieId(movieId).build());
        return allCommentResponse.getCommentList()
                .stream()
                .map(commentDto ->
                        new CommentDto(
                                commentDto.getUserId(),
                                commentDto.getMovieId(),
                                commentDto.getMessage(),
                                commentDto.getDate()

                               ))
                .collect(Collectors.toList());
    }
    public ResponseEntity<String> saveComment(CommentDto commentDto) throws UserNotSavedException{
        AddCommentRequest addCommentRequest = AddCommentRequest.newBuilder()
                .setUserId(commentDto.getUserId())
                .setMovieId(commentDto.getMovieId())
                .setMessage(commentDto.getMessage())
                .setDate(commentDto.getDate())
                .build();


        CommentResponse commentResponse = movieStub.addComment(addCommentRequest);
        ResponseEntity responseEntity;

        System.out.println(commentResponse.toString());
        if(commentResponse.getStatus().getCode()==200)
        {
            responseEntity = new ResponseEntity(HttpStatus.OK);

        }else{
            responseEntity = new ResponseEntity(HttpStatus.CONFLICT);

        }

        return responseEntity;
    }





    //user-service
    public List<RecommendedMovie> getUserMovieSuggestions(int loginId){
        UserSearchRequest userSearchRequest = UserSearchRequest.newBuilder().setLoginId(loginId).build();
        GetUserResponse getUserResponse = userStub.getUserGenre(userSearchRequest);



        MovieSearchRequest movieSearchRequest = MovieSearchRequest.newBuilder().setGenre(getUserResponse.getUser().getGenre()).build();
        AllMovieResponse allMovieResponse = movieStub.getMovies(movieSearchRequest);
        return allMovieResponse.getMovieList()
                .stream()
                .map(movieDto -> new RecommendedMovie(movieDto.getId(),movieDto.getTitle(), movieDto.getRelYear(), movieDto.getRating(),movieDto.getGenre().toString(),movieDto.getImageUrl(), movieDto.getSummary() ))
                .collect(Collectors.toList());
    }
    public List<RecommendedMovie> getUserMovies(){

        AllMovieResponse allMovieResponse = movieStub.getAllMovies(Empty.newBuilder().build());
        return allMovieResponse.getMovieList()
                .stream()
                .map(movieDto -> new RecommendedMovie(movieDto.getId(),movieDto.getTitle(), movieDto.getRelYear(), movieDto.getRating(),movieDto.getGenre().toString(),movieDto.getImageUrl(), movieDto.getSummary() ))
                .collect(Collectors.toList());
    }
    public  UserGenre setUserGenre(UserGenre userGenre){
        GetUserResponse getUserResponse;

        System.out.println("------->"+userGenre.getGenre()+userGenre.getLoginId());

        if(userGenre.getLoginId()>0 && userGenre.getGenre()!=null)
        {
            UserGenreUpdateRequest userGenreUpdateRequest = UserGenreUpdateRequest.newBuilder()
                    .setLoginId(userGenre.getLoginId())
                    .setGenre(Genre.valueOf(userGenre.getGenre().toUpperCase()))
                    .build();
             getUserResponse = userStub.updateUserGenre(userGenreUpdateRequest);

            UserGenre ug;
            if(getUserResponse.getUserResponseCase().toString()=="STATUS")
            {
                throw new UserNotFoundException(getUserResponse.getStatus().getMessage().toString());
            }else{
                ug = new UserGenre(getUserResponse.getUser().getLoginId(),getUserResponse.getUser().getGenre().toString(),getUserResponse.getUser().getName());
            }

            return ug;
        }else{
            throw new BadGenreUpdateRequestException();
        }

    }
    public RecommendedMovie SaveMovie(RecommendedMovie recommendedMovie) throws MovieNotSavedException{
        SaveMovieRequest saveMovieRequest = SaveMovieRequest.newBuilder()
                .setId(recommendedMovie.getId())
                .setTitle(recommendedMovie.getTitle())
                .setRelYear(recommendedMovie.getRel_year())
                .setRating(recommendedMovie.getRating())
                .setGenre(Genre.valueOf(recommendedMovie.getGenre()))
                .setImageUrl(recommendedMovie.getImage_url())
                .setSummary(recommendedMovie.getSummary())
                .build();


        System.out.println(saveMovieRequest.toString());
        GetMovieResponse getMovieResponse = movieStub.saveMovie(saveMovieRequest);
        System.out.println(getMovieResponse.getMovieResponseCase().toString());

        RecommendedMovie recommendedMovie1;
        if(getMovieResponse.getMovieResponseCase().toString()=="STATUS"){

            throw new MovieNotSavedException(getMovieResponse.getStatus().getMessage());
        }else{
             recommendedMovie1 =
                     new RecommendedMovie(getMovieResponse.getMovie().getId(),
                             getMovieResponse.getMovie().getTitle(),
                             getMovieResponse.getMovie().getRelYear(),
                             getMovieResponse.getMovie().getRating(),
                             getMovieResponse.getMovie().getGenre().toString(),
                             getMovieResponse.getMovie().getImageUrl(),
                             getMovieResponse.getMovie().getSummary()
                             );

        }

        return recommendedMovie1;
    }
    public UserGenre SaveUser(UserGenre userGenre) throws UserNotSavedException{
        SaveUserRequest saveUserRequest = SaveUserRequest.newBuilder()
                .setLoginId(userGenre.getLoginId())
                .setName(userGenre.getName())
                .setGenre(Genre.valueOf(userGenre.getGenre()))
                .build();


        System.out.println(saveUserRequest.toString());
        GetUserResponse getUserResponse = userStub.saveUser(saveUserRequest);
        System.out.println(getUserResponse.getUserResponseCase().toString());

        UserGenre userGenre1;
        if(getUserResponse.getUserResponseCase().toString()=="STATUS"){

            throw new UserNotSavedException(getUserResponse.getStatus().getMessage());
        }else{
            userGenre1 = new UserGenre(getUserResponse.getUser().getLoginId(),getUserResponse.getUser().getGenre().toString(),getUserResponse.getUser().getName());

        }

        return userGenre1;
    }
    public boolean checkUser(int loginId){

       GetUserResponse getUserResponse= userStub.getUserGenre(UserSearchRequest.newBuilder().setLoginId(loginId).build());

       if(loginId>0&&getUserResponse.getUser().getLoginId()==loginId){
           return true;
       }else{
           return false;}
    }

    //favorite-service
    public Favorite saveFavorite(Favorite favorite) throws UserNotSavedException{
        FavSaveRequest favSaveRequest = FavSaveRequest.newBuilder()
                .setId(favorite.getId())
                .setUserId(favorite.getUserId())
                .setMovieId(favorite.getMovieId())
                .build();


        GetFavResponse getFavResponse = movieStub.saveFavorite(favSaveRequest);

        Favorite favorite1;
        if(getFavResponse.getMovieResponseCase().toString()=="STATUS"){

            throw new UserNotSavedException(getFavResponse.getStatus().getMessage());
        }else{
            favorite1 = new Favorite(getFavResponse.getFavorite().getId(),getFavResponse.getFavorite().getUserId(),getFavResponse.getFavorite().getMovieId());

        }

        return favorite1;
    }
    public ResponseEntity<String> deleteFavorite(int id) throws UserNotSavedException{

        FavDeleteRequest favDeleteRequest = FavDeleteRequest.newBuilder().setId(id).build();

        GetFavResponse getFavResponse =  movieStub.deleteFavorite(favDeleteRequest);
        ResponseEntity responseEntity;

        System.out.println(getFavResponse.toString());
        if(getFavResponse.getStatus().getCode()==200)
        {
            responseEntity = new ResponseEntity(HttpStatus.OK);

        }else{
            responseEntity = new ResponseEntity(HttpStatus.CONFLICT);

        }


        return responseEntity;

    }
    public List<Favorite> getFavs(int userId){

        AllFavResponse allFavResponse = movieStub.getAllFavorite(FavSearchRequest.newBuilder().setUserId(userId).build());
        return allFavResponse.getFavoriList()
                .stream()
                .map(favoriteDto -> new Favorite( favoriteDto.getId(),favoriteDto.getUserId(),favoriteDto.getMovieId() ))
                .collect(Collectors.toList());
    }
    public List<RecommendedMovie> getFavMovies(int userId){

        AllMovieResponse allMovieResponse = movieStub.getALLFavMovies(FavSearchRequest.newBuilder().setUserId(userId).build());
        return allMovieResponse.getMovieList()
                .stream()
                .map(movieDto -> new RecommendedMovie(movieDto.getId(),movieDto.getTitle(), movieDto.getRelYear(), movieDto.getRating(),movieDto.getGenre().toString(),movieDto.getImageUrl(), movieDto.getSummary() ))
                .collect(Collectors.toList());
    }
    public ResponseEntity<Favorite>  checkIsFav(int userId,int movieId){
        ResponseEntity responseEntity;

        GetFavResponse getFavResponse= movieStub.getFavMovie(SingleFavSearchRequest.newBuilder().setUserId(userId).setMovieId(movieId).build());

        if(userId == getFavResponse.getFavorite().getUserId()){
            Favorite favorite = new Favorite(getFavResponse.getFavorite().getId(),getFavResponse.getFavorite().getUserId(),getFavResponse.getFavorite().getMovieId());

            responseEntity =  ResponseEntity.ok(favorite);
        }else{
            Favorite favorite = new Favorite(0,0,0);

            responseEntity =  ResponseEntity.ok(favorite);

        }
        return responseEntity;

    }
    public ResponseEntity<String> deleteFavMovie(int userId, int movieId) throws UserNotSavedException{

        FavMovieDeleteRequest favMovieDeleteRequest = FavMovieDeleteRequest.newBuilder().setUserId(userId).setMovieId(movieId).build();

        GetFavResponse getFavResponse =  movieStub.deleteFavMovie(favMovieDeleteRequest);
        ResponseEntity responseEntity;

        System.out.println(getFavResponse.toString());
        if(getFavResponse.getStatus().getCode()==200)
        {
            responseEntity = new ResponseEntity(HttpStatus.OK);

        }else{
            responseEntity = new ResponseEntity(HttpStatus.CONFLICT);

        }


        return responseEntity;

    }

}
