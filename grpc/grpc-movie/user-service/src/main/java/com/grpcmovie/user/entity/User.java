package com.grpcmovie.user.entity;




public class User {


    private int login_id;
    private String name;
    private String genre;

    public User(int login, String name, String genre) {
        this.login_id = login;
        this.name = name;
        this.genre = genre;
    }

    public User() {
    }

    public int getLoginId() {
        return login_id;
    }

    public void setLoginId(int login) {
        this.login_id = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
