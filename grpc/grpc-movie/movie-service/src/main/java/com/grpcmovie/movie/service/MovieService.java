package com.grpcmovie.movie.service;


import com.dk.grpcmovie.common.Genre;
import com.dk.grpcmovie.common.Status;
import com.dk.grpcmovie.movie.*;


import com.dk.grpcmovie.user.GetUserResponse;
import com.dk.grpcmovie.user.UserResponse;
import com.grpcmovie.movie.entity.CommentDto;
import com.grpcmovie.movie.entity.Favorite;
import com.grpcmovie.movie.entity.Movie;
import com.grpcmovie.movie.repository.MovieRepository;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class MovieService extends MovieServiceGrpc.MovieServiceImplBase {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public void getCommentsForMovie(GetCommentsRequest request, StreamObserver<AllCommentResponse> responseObserver) {

        List<Comment> commentDtoList = movieRepository.findByMovieId(request.getMovieId())
                .stream()
                .map(movie -> Comment.newBuilder()
                        .setUserId(movie.getUserId())
                        .setMovieId(movie.getMovieId())
                        .setMessage(movie.getMessage())
                        .setDate(movie.getDate())
                        .build())
                .collect(Collectors.toList());
        responseObserver.onNext(AllCommentResponse.newBuilder().addAllComment(commentDtoList).build());
        responseObserver.onCompleted();



    }

    @Override
    public void addComment(AddCommentRequest request, StreamObserver<CommentResponse> responseObserver) {



        CommentDto commentDto = new CommentDto(

        request.getUserId(),
        request.getMovieId(),
        request.getMessage(),request.getDate()
                );


        CommentResponse commentResponse;

        int a =   movieRepository.insertComment(commentDto);

        if(a>0){
            Status status =
                    Status.newBuilder().setCode(200).setMessage("Comment Added")
                            .build();
            commentResponse = CommentResponse.newBuilder().setStatus(status).build();
        }else{
            Status status =
                    Status.newBuilder().setCode(403).setMessage("Failed")
                            .build();
            commentResponse = CommentResponse.newBuilder().setStatus(status).build();
        }


        responseObserver.onNext(commentResponse);
        responseObserver.onCompleted();

    }

    public MovieService(MovieRepository repository) {

        this.movieRepository = repository;
    }
    @Override
    public void saveMovie(SaveMovieRequest request, StreamObserver<GetMovieResponse> responseObserver) {

        Movie movie = new Movie(request.getId(),
                request.getTitle(),
                request.getRelYear(),
                request.getRating(),
                request.getGenre().toString(),
                request.getImageUrl(),
                request.getSummary());
        GetMovieResponse getMovieResponse;

        if(movieRepository.findByIdBoolean(request.getId())==false) {
            movieRepository.insert(movie);

            var MovieResponse =
                    MovieDto.newBuilder()
                            .setId(movie.getId())
                            .setTitle(movie.getTitle())
                            .setRelYear(movie.getRel_year())
                            .setRating(movie.getRating())
                            .setGenre(Genre.valueOf(movie.getGenre()))
                            .setImageUrl(movie.getImage_url())
                            .setSummary(movie.getSummary())
                            .build();
            getMovieResponse = GetMovieResponse.newBuilder().setMovie(MovieResponse).build();


        }else{
            movie = movieRepository.findById(request.getId());
            Status status =
                    Status.newBuilder().setCode(403).setMessage("Movie Id Not Available")
                            .build();
            getMovieResponse = GetMovieResponse.newBuilder().setStatus(status).build();

        }

        responseObserver.onNext(getMovieResponse);
        responseObserver.onCompleted();

    }

    @Override
    public void deleteFavMovie(FavMovieDeleteRequest request, StreamObserver<GetFavResponse> responseObserver) {
        Favorite favorite;
        GetFavResponse getFavResponse;


       int numb= movieRepository.deleteFavMovie(request.getUserId(),request.getMovieId());
        System.out.println("numb:"+numb);
if(numb ==1){

            Status status =
                    Status.newBuilder().setCode(200).setMessage("User Deleted Successfully")
                            .build();
            getFavResponse = GetFavResponse.newBuilder().setStatus(status).build();

        }else {
            Status status =
                    Status.newBuilder().setCode(404).setMessage("No User With Given Id")
                            .build();
            getFavResponse = GetFavResponse.newBuilder().setStatus(status).build();

        }





        responseObserver.onNext(getFavResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getMovies(MovieSearchRequest request, StreamObserver<AllMovieResponse> responseObserver) {
        List<MovieDto> movieDtoList = movieRepository.findByGenre(request.getGenre().toString())
                .stream()
                .map(movie -> MovieDto.newBuilder()
                        .setId(movie.getId())
                        .setTitle(movie.getTitle())
                        .setRelYear(movie.getRel_year())
                        .setRating(movie.getRating())
                        .setGenre(Genre.valueOf(movie.getGenre()))
                        .setImageUrl(movie.getImage_url())
                        .setSummary(movie.getSummary())
                        .build())
                .collect(Collectors.toList());
        responseObserver.onNext(AllMovieResponse.newBuilder().addAllMovie(movieDtoList).build());
        responseObserver.onCompleted();


    }

    @Override
    public void getAllMovies(Empty request, StreamObserver<AllMovieResponse> responseObserver) {
        List<MovieDto> movieDtoList = movieRepository.findAll()
                .stream()
                .map(movie -> MovieDto.newBuilder()
                        .setId(movie.getId())
                        .setTitle(movie.getTitle())
                        .setRelYear(movie.getRel_year())
                        .setRating(movie.getRating())
                        .setGenre(Genre.valueOf(movie.getGenre()))
                        .setImageUrl(movie.getImage_url())
                        .setSummary(movie.getSummary())
                        .build())
                .collect(Collectors.toList());
        responseObserver.onNext(AllMovieResponse.newBuilder().addAllMovie(movieDtoList).build());
        responseObserver.onCompleted();
    }

    @Override
    public void saveFavorite(FavSaveRequest request, StreamObserver<GetFavResponse> responseObserver) {
        Favorite favorite = new Favorite(
                request.getId(),
                request.getUserId(),
                request.getMovieId());
        GetFavResponse getFavResponse;

        if(movieRepository.findByIdBooleanFav(request.getId())==false) {
            movieRepository.insertFav(favorite);

            var FavoriteResponse =
                    FavoriteDto.newBuilder()
                            .setId(favorite.getId())
                            .setUserId(favorite.getUserId())
                            .setMovieId(favorite.getMovieId())
                            .build();
            getFavResponse = GetFavResponse.newBuilder().setFavorite(FavoriteResponse).build();


        }else{
            favorite = movieRepository.findByIdFav(request.getId());
            Status status =
                    Status.newBuilder().setCode(403).setMessage("Favorite Id Not Available")
                            .build();
            getFavResponse = GetFavResponse.newBuilder().setStatus(status).build();

        }
        responseObserver.onNext(getFavResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getALLFavMovies(FavSearchRequest request, StreamObserver<AllMovieResponse> responseObserver) {
        List<MovieDto> movieDtoList = movieRepository.findFavMoviesByUserId(request.getUserId())
                .stream()
                .map(movie -> MovieDto.newBuilder()
                        .setId(movie.getId())
                        .setTitle(movie.getTitle())
                        .setRelYear(movie.getRel_year())
                        .setRating(movie.getRating())
                        .setGenre(Genre.valueOf(movie.getGenre()))
                        .setImageUrl(movie.getImage_url())
                        .setSummary(movie.getSummary())
                        .build())
                .collect(Collectors.toList());
        responseObserver.onNext(AllMovieResponse.newBuilder().addAllMovie(movieDtoList).build());
        responseObserver.onCompleted();

    }

    @Override
    public void deleteFavorite(FavDeleteRequest request, StreamObserver<GetFavResponse> responseObserver) {
        Favorite favorite;
        GetFavResponse getFavResponse;

        if(movieRepository.findByIdBooleanFav(request.getId())==true) {

            movieRepository.deleteFav(request.getId());

            Status status =
                    Status.newBuilder().setCode(200).setMessage("User Deleted Successfully")
                            .build();
            getFavResponse = GetFavResponse.newBuilder().setStatus(status).build();


        }else{
            Status status =
                    Status.newBuilder().setCode(404).setMessage("No User With Given Id")
                            .build();
            getFavResponse = GetFavResponse.newBuilder().setStatus(status).build();

        }

        responseObserver.onNext(getFavResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getFavMovie(SingleFavSearchRequest request, StreamObserver<GetFavResponse> responseObserver) {
        GetFavResponse getFavResponse;
        Favorite favorite ;

    favorite = movieRepository.findByUserIdMovieIdFav(request.getUserId(),request.getMovieId());
    if(favorite!=null){
        System.out.println("null değil");

        getFavResponse =
                GetFavResponse.newBuilder()
                        .setFavorite(FavoriteDto.newBuilder().setId(favorite.getId()).setUserId(favorite.getUserId()).setMovieId(favorite.getMovieId()).build())
                        .build();
    }else{
        System.out.println("null ");

        Status status =
                Status.newBuilder().setCode(404).setMessage("No Favorite Founded With Given UserId & MovieId")
                        .build();
        getFavResponse = GetFavResponse.newBuilder().setStatus(status).build();

    }





        responseObserver.onNext(getFavResponse);
        responseObserver.onCompleted();

    }

    @Override
    public void getAllFavorite(FavSearchRequest request, StreamObserver<AllFavResponse> responseObserver) {
        List<FavoriteDto> favoriteDtoList = movieRepository.findByUserIdFavList(request.getUserId())
                .stream()
                .map(favorite -> FavoriteDto.newBuilder()
                        .setId(favorite.getId())
                        .setUserId(favorite.getUserId())
                        .setMovieId(favorite.getMovieId())
                        .build())
                .collect(Collectors.toList());
        System.out.println("first fav movie: "+favoriteDtoList.get(0));
        responseObserver.onNext(AllFavResponse.newBuilder().addAllFavori(favoriteDtoList).build());
        responseObserver.onCompleted();

    }

}
