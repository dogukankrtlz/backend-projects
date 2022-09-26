package com.grpcmovie.aggregator.controller;

import com.dk.grpcmovie.movie.GetMovieResponse;
import com.dk.grpcmovie.movie.SaveMovieRequest;
import com.dk.grpcmovie.user.GetUserResponse;
import com.grpcmovie.aggregator.dto.RecommendedMovie;
import com.grpcmovie.aggregator.dto.UserGenre;
import com.grpcmovie.aggregator.service.UserMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AggregatorController {
    @Autowired
    private UserMovieService userMovieService;

    @GetMapping("/user/{loginId}")//get movies by user genre
    public List<RecommendedMovie> getMovies(@PathVariable int loginId){
        return userMovieService.getUserMovieSuggestions(loginId);
    }
    @PostMapping("/movie")//save new movie
    public RecommendedMovie saveMovie (@RequestBody RecommendedMovie recommendedMovie) throws Exception {
        return userMovieService.SaveMovie(recommendedMovie);
    }
    @PutMapping("/user")//update user genre
    public UserGenre setUserGenre(@RequestBody UserGenre userGenre){
        return userMovieService.setUserGenre(userGenre);
    }

    @PostMapping("/user")//save new user
    public UserGenre SaveUser (@RequestBody UserGenre userGenre) throws Exception {
        return userMovieService.SaveUser(userGenre);
    }
    @GetMapping("/user/check/{loginId}")//should change to password+loginId -> user doesn't have password in this system
    public boolean checkUser(@PathVariable int loginId){
        return userMovieService.checkUser(loginId);
    }

}
