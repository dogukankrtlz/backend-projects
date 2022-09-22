package com.grpcmovie.aggregator.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class UserGenre {
    private int loginId;
    private String genre;

    public UserGenre(int loginId, String genre) {
        this.loginId = loginId;
        this.genre = genre;
    }

    public UserGenre() {
    }


    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
