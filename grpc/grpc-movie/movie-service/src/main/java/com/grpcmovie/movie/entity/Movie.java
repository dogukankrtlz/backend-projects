package com.grpcmovie.movie.entity;



public class Movie  {

    public Movie(int id, String title, int rel_year, double rating, String genre) {
        this.id = id;
        this.title = title;
        this.rel_year = rel_year;
        this.rating = rating;
        this.genre = genre;
    }

    public Movie() {
    }

    private int id;
    private String title;
    private int rel_year;
    private double rating;
    private String genre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRel_year() {
        return rel_year;
    }

    public void setRel_year(int rel_year) {
        this.rel_year = rel_year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


}
