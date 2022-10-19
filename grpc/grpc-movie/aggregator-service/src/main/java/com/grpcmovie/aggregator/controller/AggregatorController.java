package com.grpcmovie.aggregator.controller;

import com.dk.grpcmovie.movie.GetMovieResponse;
import com.dk.grpcmovie.movie.SaveMovieRequest;
import com.dk.grpcmovie.user.GetUserResponse;
import com.grpcmovie.aggregator.dto.CommentDto;
import com.grpcmovie.aggregator.dto.Favorite;
import com.grpcmovie.aggregator.dto.RecommendedMovie;
import com.grpcmovie.aggregator.dto.UserGenre;
import com.grpcmovie.aggregator.service.UserMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    @GetMapping("/user/movie-list")//get movies by user genre
    public List<RecommendedMovie> getMovies() {
        return userMovieService.getUserMovies();
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

    //favorite-calls
    @PostMapping("/favorite")//save new movie
    public Favorite saveFavorite (@RequestBody Favorite favorite) throws Exception {
        return userMovieService.saveFavorite(favorite);
    }
    @GetMapping("/favorite/{userId}")//get movies by user genre
    public List<Favorite> getFavs(@PathVariable int userId) {
        return userMovieService.getFavs(userId);
    }

    @GetMapping("/favorite/movies/{userId}")//get movies by user genre
    public List<RecommendedMovie> getFavMovies(@PathVariable int userId) {
        return userMovieService.getFavMovies(userId);
    }

    @DeleteMapping("/favorite/{id}")//save new movie
    public ResponseEntity<String> deleteFavorite (@PathVariable int id) throws Exception {
        return userMovieService.deleteFavorite(id);
    }

    @GetMapping("/favorite/check/{userId}/{movieId}")//get movies by user genre
    public ResponseEntity<Favorite>  getFavMovies(@PathVariable int userId,@PathVariable int movieId) {
        return userMovieService.checkIsFav(userId,movieId);
    }
    @DeleteMapping("/favorite/{userId}/{movieId}")//get movies by user genre
    public ResponseEntity<String>  deleteFavMovie(@PathVariable int userId,@PathVariable int movieId) {
        return userMovieService.deleteFavMovie(userId,movieId);
    }

//comments-calls
    @GetMapping("/comment/{movieId}")//get comments by movieId
    public List<CommentDto> getMovieComments(@PathVariable int movieId) {
         return userMovieService.getMovieComments(movieId);
    }

    @PostMapping("/comment")//save new comment
    public ResponseEntity<String> saveComment (@RequestBody CommentDto commentDto) throws Exception {
        return userMovieService.saveComment( commentDto);
    }


}
