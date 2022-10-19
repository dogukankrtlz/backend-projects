package com.grpcmovie.aggregator.dto;




public class CommentDto {

    private int userId;
    private int movieId;
    private String  message;
    private String date ;

    public CommentDto() {
    }

    public CommentDto( int userId, int movieId, String message, String date) {
        this.userId = userId;
        this.movieId = movieId;
        this.message = message;
        this.date = date;
    }



    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


}
