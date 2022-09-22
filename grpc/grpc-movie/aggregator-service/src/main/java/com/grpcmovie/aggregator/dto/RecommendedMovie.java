package com.grpcmovie.aggregator.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecommendedMovie {
    private int id;
    private String title;
    private int year;
    private double rating;
    private String genre;
}
