package com.grpcmovie.movie.services;


import com.dk.grpcmovie.common.Genre;
import com.dk.grpcmovie.movie.*;
import com.dk.grpcmovie.user.GetUserResponse;
import com.dk.grpcmovie.user.UserGenreUpdateRequest;
import com.dk.grpcmovie.user.UserServiceGrpc;
import com.grpcmovie.movie.repository.MovieRepository;
import com.grpcmovie.movie.service.MovieService;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.testing.GrpcCleanupRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;


public class MovieServiceTest {

    //MethodName_StateUnderTest_ExpectedBehavior


    @Rule
    public final GrpcCleanupRule grpcCleanup = new GrpcCleanupRule();



    //ok
    @Test
    public void getMoviesByGenre_shouldReturnMovieList() throws Exception {

        // Generate a unique in-process server name.
        String serverName = InProcessServerBuilder.generateName();
        MovieRepository entityManager = mock(MovieRepository.class);

        // Create a server, add service, start, and register for automatic graceful shutdown.
        grpcCleanup.register(InProcessServerBuilder
                .forName(serverName).directExecutor().addService(new MovieService(entityManager)).build().start());

        MovieServiceGrpc.MovieServiceBlockingStub blockingStub = MovieServiceGrpc.newBlockingStub(
                // Create a client channel and register for automatic graceful shutdown.
                grpcCleanup.register(InProcessChannelBuilder.forName(serverName).directExecutor().build()));




        AllMovieResponse reply =
                blockingStub.getMovies(MovieSearchRequest.newBuilder().setGenre(Genre.DRAMA).build());


        assertEquals(0, reply.getMovieList().size());




    }
    //ok
    @Test
    public void saveMovie_ifNotExist_shouldReturnMovie() throws Exception {

        // Generate a unique in-process server name.
        String serverName = InProcessServerBuilder.generateName();
        MovieRepository entityManager = mock(MovieRepository.class);

        // Create a server, add service, start, and register for automatic graceful shutdown.
        grpcCleanup.register(InProcessServerBuilder
                .forName(serverName).directExecutor().addService(new MovieService(entityManager)).build().start());

        MovieServiceGrpc.MovieServiceBlockingStub blockingStub = MovieServiceGrpc.newBlockingStub(
                // Create a client channel and register for automatic graceful shutdown.
                grpcCleanup.register(InProcessChannelBuilder.forName(serverName).directExecutor().build()));




        GetMovieResponse reply =
                blockingStub.saveMovie(SaveMovieRequest.newBuilder().setId(1).setTitle("Movie 1").setRating(7.7).setRelYear(2020).setGenre(Genre.CRIME).build());

        assertEquals(1, reply.getMovie().getId());
        assertEquals("Movie 1", reply.getMovie().getTitle());
        assertEquals(7.7, reply.getMovie().getRating(),0.0);
        assertEquals(2020, reply.getMovie().getRelYear());
        assertEquals(Genre.CRIME, reply.getMovie().getGenre());




    }

}