package com.grpcmovie.aggregator.controller;

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

    @GetMapping("/user/{loginId}")
    public List<RecommendedMovie> getMovies(@PathVariable int loginId){
        return userMovieService.getUserMovieSuggestions(loginId);
    }

    @PutMapping("/user")
    public UserGenre setUserGenre(@RequestBody UserGenre userGenre){
       return userMovieService.setUserGenre(userGenre);

    }

}
