package com.grpcmovie.movie.service;


import com.dk.grpcmovie.common.Genre;
import com.dk.grpcmovie.common.Status;
import com.dk.grpcmovie.movie.*;


import com.grpcmovie.movie.entity.Movie;
import com.grpcmovie.movie.repository.MovieRepository;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class MovieService extends MovieServiceGrpc.MovieServiceImplBase {

    @Autowired
    MovieRepository movieRepository;


    public MovieService(MovieRepository repository) {

        this.movieRepository = repository;
    }
    @Override
    public void saveMovie(SaveMovieRequest request, StreamObserver<GetMovieResponse> responseObserver) {

        Movie movie = new Movie(request.getId(),request.getTitle(),request.getRelYear(),request.getRating(),request.getGenre().toString());
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
                            .build();
            getMovieResponse = GetMovieResponse.newBuilder().setMovie(MovieResponse).build();


        }else{
            movie = movieRepository.findById(request.getId());
            Status status =
                    Status.newBuilder().setCode(403).setMessage("Login Id Not Available")
                            .build();
            getMovieResponse = GetMovieResponse.newBuilder().setStatus(status).build();

        }

        responseObserver.onNext(getMovieResponse);
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
                        .build())
                .collect(Collectors.toList());
        responseObserver.onNext(AllMovieResponse.newBuilder().addAllMovie(movieDtoList).build());
        responseObserver.onCompleted();


    }









}
