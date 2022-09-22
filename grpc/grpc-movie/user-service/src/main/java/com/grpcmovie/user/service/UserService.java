package com.grpcmovie.user.service;


import com.dk.grpcmovie.common.Status;
import com.dk.grpcmovie.user.*;
import com.dk.grpcmovie.common.Genre;

import com.grpcmovie.user.entity.User;
import com.grpcmovie.user.repository.UserRepository;
import io.grpc.Channel;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;



@GrpcService
public class UserService extends UserServiceGrpc.UserServiceImplBase {


    @Autowired
    private UserRepository userRepository;

    UserService(UserRepository repository ) {

        this.userRepository = repository;
    }


    @Override
    public void getUserGenre(UserSearchRequest request, StreamObserver<GetUserResponse> responseObserver) {
         GetUserResponse getUserResponse;

        User user ;
        if(userRepository.findByIdBoolean(request.getLoginId())==false) {
            Status status =
                   Status.newBuilder().setCode(404).setMessage("User Not Found")

                            .build();
            getUserResponse = GetUserResponse.newBuilder().setStatus(status).build();


        }else{

            user = userRepository.findById(request.getLoginId());

            var userResponse =
                    UserResponse.newBuilder()
                            .setLoginId(user.getLoginId())
                            .setName(user.getName())
                            .setGenre(Genre.valueOf(user.getGenre()))
                            .build();
            getUserResponse = GetUserResponse.newBuilder().setUser(userResponse).build();
        }

        responseObserver.onNext(getUserResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void updateUserGenre(UserGenreUpdateRequest request, StreamObserver<GetUserResponse> responseObserver) {


        User user;
        GetUserResponse getUserResponse;

        if(userRepository.findByIdBoolean(request.getLoginId())==true) {

            userRepository.updateGenre(request);
            user = userRepository.findById(request.getLoginId());

            var userResponse =
                    UserResponse.newBuilder()
                            .setLoginId(user.getLoginId())
                            .setName(user.getName())
                            .setGenre(Genre.valueOf(user.getGenre()))
                            .build();
            getUserResponse = GetUserResponse.newBuilder().setUser(userResponse).build();


        }else{
            Status status =
                    Status.newBuilder().setCode(404).setMessage("No User With Given Login Id ")
                            .build();
            getUserResponse = GetUserResponse.newBuilder().setStatus(status).build();

        }

        responseObserver.onNext(getUserResponse);
        responseObserver.onCompleted();
    }


    @Override
    public void saveUser(SaveUserRequest request, StreamObserver<GetUserResponse> responseObserver) {
        User user = new User(request.getLoginId(),request.getName(),request.getGenre().toString());


        GetUserResponse getUserResponse;


        if(userRepository.findByIdBoolean(request.getLoginId())==false) {

            userRepository.insert(user);

            var userResponse =
                    UserResponse.newBuilder()
                            .setLoginId(user.getLoginId())
                            .setName(user.getName())
                            .setGenre(Genre.valueOf(user.getGenre()))
                            .build();
            getUserResponse = GetUserResponse.newBuilder().setUser(userResponse).build();


        }else{
            user = userRepository.findById(request.getLoginId());
            Status status =
                    Status.newBuilder().setCode(403).setMessage("Login Id Not Available")
                            .build();
            getUserResponse = GetUserResponse.newBuilder().setStatus(status).build();

        }

        responseObserver.onNext(getUserResponse);
        responseObserver.onCompleted();
    }

}
