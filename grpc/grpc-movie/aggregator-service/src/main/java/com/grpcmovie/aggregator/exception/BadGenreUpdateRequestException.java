package com.grpcmovie.aggregator.exception;


public class BadGenreUpdateRequestException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    private final String message;

    public BadGenreUpdateRequestException() {



        this.message = "Bad Update Genre Request";
        //this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
