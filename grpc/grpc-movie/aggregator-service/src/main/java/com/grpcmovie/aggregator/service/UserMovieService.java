package com.grpcmovie.aggregator.service;

import com.dk.grpcmovie.common.Genre;
import com.dk.grpcmovie.movie.*;
import com.dk.grpcmovie.user.*;
import com.grpcmovie.aggregator.dto.RecommendedMovie;
import com.grpcmovie.aggregator.dto.UserGenre;
import com.grpcmovie.aggregator.exception.BadGenreUpdateRequestException;
import com.grpcmovie.aggregator.exception.MovieNotSavedException;
import com.grpcmovie.aggregator.exception.UserNotFoundException;
import com.grpcmovie.aggregator.exception.UserNotSavedException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserMovieService {

    @GrpcClient("user-service")
    public UserServiceGrpc.UserServiceBlockingStub userStub;

    @GrpcClient("movie-service")
    public MovieServiceGrpc.MovieServiceBlockingStub movieStub;

    public List<RecommendedMovie> getUserMovieSuggestions(int loginId){
        UserSearchRequest userSearchRequest = UserSearchRequest.newBuilder().setLoginId(loginId).build();
        GetUserResponse getUserResponse = userStub.getUserGenre(userSearchRequest);


        MovieSearchRequest movieSearchRequest = MovieSearchRequest.newBuilder().setGenre(getUserResponse.getUser().getGenre()).build();
        AllMovieResponse allMovieResponse = movieStub.getMovies(movieSearchRequest);
        return allMovieResponse.getMovieList()
                .stream()
                .map(movieDto -> new RecommendedMovie(movieDto.getId(),movieDto.getTitle(), movieDto.getRelYear(), movieDto.getRating(),movieDto.getGenre().toString()))
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
                .setRelYear(recommendedMovie.getYear())
                .setRating(recommendedMovie.getRating())
                .setGenre(Genre.valueOf(recommendedMovie.getGenre()))
                .build();


        System.out.println(saveMovieRequest.toString());
        GetMovieResponse getMovieResponse = movieStub.saveMovie(saveMovieRequest);
        System.out.println(getMovieResponse.getMovieResponseCase().toString());

        RecommendedMovie recommendedMovie1;
        if(getMovieResponse.getMovieResponseCase().toString()=="STATUS"){

            throw new MovieNotSavedException(getMovieResponse.getStatus().getMessage());
        }else{
             recommendedMovie1 = new RecommendedMovie(getMovieResponse.getMovie().getId(),getMovieResponse.getMovie().getTitle(),getMovieResponse.getMovie().getRelYear(),getMovieResponse.getMovie().getRating(),getMovieResponse.getMovie().getGenre().toString());

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


}
