package com.grpcmovie.aggregator.service;

import com.dk.grpcmovie.common.Genre;
import com.dk.grpcmovie.movie.AllMovieResponse;
import com.dk.grpcmovie.movie.MovieSearchRequest;
import com.dk.grpcmovie.movie.MovieServiceGrpc;
import com.dk.grpcmovie.user.*;
import com.grpcmovie.aggregator.dto.RecommendedMovie;
import com.grpcmovie.aggregator.dto.UserGenre;
import com.grpcmovie.aggregator.exception.BadGenreUpdateRequestException;
import com.grpcmovie.aggregator.exception.UserNotFoundException;
import net.devh.boot.grpc.client.inject.GrpcClient;
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
                ug = new UserGenre(getUserResponse.getUser().getLoginId(),getUserResponse.getUser().getGenre().toString());
            }

            return ug;
        }else{
            throw new BadGenreUpdateRequestException();
        }





    }



}
