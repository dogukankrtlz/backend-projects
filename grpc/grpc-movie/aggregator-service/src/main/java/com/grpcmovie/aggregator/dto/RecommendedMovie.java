package com.grpcmovie.aggregator.dto;



public class RecommendedMovie {
    private int id;
    private String title;
    private int rel_year;
    private double rating;
    private String genre;
    private String image_url;
    private String summary;


    public RecommendedMovie(int id, String title, int rel_year, double rating, String genre, String image_url, String summary) {
        this.id = id;
        this.title = title;
        this.rel_year = rel_year;
        this.rating = rating;
        this.genre = genre;
        this.image_url = image_url;
        this.summary = summary;
    }

    public RecommendedMovie() {
    }

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

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
