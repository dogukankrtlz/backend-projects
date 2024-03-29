package com.grpcmovie.user.service;

import com.dk.grpcmovie.common.Genre;
import com.dk.grpcmovie.common.Status;
import com.dk.grpcmovie.user.*;
import com.grpcmovie.user.entity.User;
import com.grpcmovie.user.repository.UserRepository;
import io.grpc.ManagedChannel;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.internal.testing.StreamRecorder;
import io.grpc.testing.GrpcCleanupRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.ArgumentCaptor;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;


import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@RunWith(JUnit4.class)
class UserServiceTest {

    //MethodName_StateUnderTest_ExpectedBehavior


    @Rule
    public final GrpcCleanupRule grpcCleanup = new GrpcCleanupRule();




//ok
    @org.junit.jupiter.api.Test
    public void getUserGenre_ifUserExist_shouldReturnStatus() throws Exception{

        // Generate a unique in-process server name.
        String serverName = InProcessServerBuilder.generateName();
        UserRepository entityManager = mock(UserRepository.class);

        // Create a server, add service, start, and register for automatic graceful shutdown.
        grpcCleanup.register(InProcessServerBuilder
                .forName(serverName).directExecutor().addService(new UserService(entityManager)).build().start());

        UserServiceGrpc.UserServiceBlockingStub blockingStub = UserServiceGrpc.newBlockingStub(
                // Create a client channel and register for automatic graceful shutdown.
                grpcCleanup.register(InProcessChannelBuilder.forName(serverName).directExecutor().build()));




        GetUserResponse reply =
                blockingStub.getUserGenre(UserSearchRequest.newBuilder().setLoginId(1).build());
        System.out.println(reply);


        assertEquals("User Not Found", reply.getStatus().getMessage());
        assertEquals(404, reply.getStatus().getCode());



    }
    //ok
    @org.junit.jupiter.api.Test
    public void saveUserGenre_ifUserNotExist_shouldReturnUser()  throws Exception{

        // Generate a unique in-process server name.
        String serverName = InProcessServerBuilder.generateName();
        UserRepository entityManager = mock(UserRepository.class);

        // Create a server, add service, start, and register for automatic graceful shutdown.
        grpcCleanup.register(InProcessServerBuilder
                .forName(serverName).directExecutor().addService(new UserService(entityManager)).build().start());

        UserServiceGrpc.UserServiceBlockingStub blockingStub = UserServiceGrpc.newBlockingStub(
                // Create a client channel and register for automatic graceful shutdown.
                grpcCleanup.register(InProcessChannelBuilder.forName(serverName).directExecutor().build()));




        GetUserResponse reply =
                blockingStub.saveUser(SaveUserRequest.newBuilder().setLoginId(1).setName("Tester 1").setGenre(Genre.CRIME).build());
        System.out.println(reply);




        assertEquals(Genre.CRIME, reply.getUser().getGenre());
        assertEquals("Tester 1", reply.getUser().getName());
        assertEquals(1 ,reply.getUser().getLoginId());


    }


//ok
    @org.junit.jupiter.api.Test
    void updateUserGenre_ifUserNotExist_shouldReturnStatus() throws Exception {

        // Generate a unique in-process server name.
        String serverName = InProcessServerBuilder.generateName();
        UserRepository entityManager = mock(UserRepository.class);

        // Create a server, add service, start, and register for automatic graceful shutdown.
        grpcCleanup.register(InProcessServerBuilder
                .forName(serverName).directExecutor().addService(new UserService(entityManager)).build().start());

        UserServiceGrpc.UserServiceBlockingStub blockingStub = UserServiceGrpc.newBlockingStub(
                // Create a client channel and register for automatic graceful shutdown.
                grpcCleanup.register(InProcessChannelBuilder.forName(serverName).directExecutor().build()));


        GetUserResponse getUserResponse = GetUserResponse.newBuilder().setUser(UserResponse.newBuilder().setName("Tester 1").setGenre(Genre.CRIME).setLoginId(5).build()).build();

        System.out.println("get user respone:"+getUserResponse);
        Mockito.when(blockingStub.updateUserGenre(UserGenreUpdateRequest.newBuilder().setLoginId(5).setGenre(Genre.CRIME).build())).thenReturn(getUserResponse);


        GetUserResponse reply =
                blockingStub.updateUserGenre(UserGenreUpdateRequest.newBuilder().setLoginId(1).setGenre(Genre.CRIME).build());
        System.out.println(reply);


        assertEquals("No User With Given Login Id ", reply.getStatus().getMessage());
        assertEquals(404, reply.getStatus().getCode());




    }


    //ok
    @Test
    void x() throws Exception {

        // Generate a unique in-process server name.
        String serverName = InProcessServerBuilder.generateName();
        UserRepository entityManager = mock(UserRepository.class);

        // Create a server, add service, start, and register for automatic graceful shutdown.
        grpcCleanup.register(InProcessServerBuilder
                .forName(serverName).directExecutor().addService(new UserService(entityManager)).build().start());

        UserServiceGrpc.UserServiceBlockingStub blockingStub = UserServiceGrpc.newBlockingStub(
                // Create a client channel and register for automatic graceful shutdown.
                grpcCleanup.register(InProcessChannelBuilder.forName(serverName).directExecutor().build()));









        GetUserResponse reply =
                blockingStub.saveUser(SaveUserRequest.newBuilder().setLoginId(1).setName("Tester 1").setGenre(Genre.CRIME).build());
        System.out.println(reply);


        //  GetUserResponse get= blockingStub.getUserGenre(UserSearchRequest.newBuilder().setLoginId(1).build());
        GetUserResponse getUserResponse = GetUserResponse.newBuilder().setUser(UserResponse.newBuilder().setLoginId(1).setGenre(Genre.CRIME).setName("Tester 1")).build();
/*
        GetUserResponse getUserResponse2 = GetUserResponse.newBuilder().setUser( UserResponse.newBuilder()
                .setLoginId(1)
                .setName("Tester 1")
                .setGenre(Genre.CRIME)
                .build()).build();*/
        User user = new User(1,"Tester 1",Genre.CRIME.toString());

        User user2 =new User();


        Mockito.when(entityManager.findByIdBoolean(1))
                .thenReturn(true);
        //Mockito.when(entityManager.findById(1))
            //    .thenReturn(ArgumentMatchers.any());

        //userRepository.findById(request.getLoginId());
        Mockito.when(blockingStub.getUserGenre(UserSearchRequest.newBuilder().setLoginId(1).build())).thenReturn(getUserResponse);






    }





}