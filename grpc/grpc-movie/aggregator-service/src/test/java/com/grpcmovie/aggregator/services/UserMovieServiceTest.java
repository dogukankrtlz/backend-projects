package com.grpcmovie.aggregator.services;



import com.dk.grpcmovie.common.Genre;
import com.dk.grpcmovie.user.GetUserResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.grpcmovie.aggregator.dto.RecommendedMovie;
import com.grpcmovie.aggregator.dto.UserGenre;
import com.grpcmovie.aggregator.exception.*;
import com.grpcmovie.aggregator.service.UserMovieService;

import org.hamcrest.Matchers;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.web.context.WebApplicationContext;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@WebMvcTest
public class UserMovieServiceTest {

    @Autowired
    private WebApplicationContext webApplicationContext;
    /*
     * We can @Autowire MockMvc because the WebApplicationContext provides an
     * instance/bean for us
     */
    @Autowired
    MockMvc mockMvc;

    /*
     * Jackson mapper for Object -> JSON conversion
     */
    @Autowired
    ObjectMapper mapper;

    /*
     * We use @MockBean because the WebApplicationContext does not provide
     * any @Component, @Service or @Repository beans instance/bean of this service
     * in its context. It only loads the beans solely required for testing the
     * controller.
     */
    @MockBean
    UserMovieService userMovieService;


    @Test
    public void givenUpdatedGenre_ifUserExist_thenUpdateGenreReturn200() throws Exception{




        UserGenre userGenre = new UserGenre();
        userGenre.setLoginId(2);
        userGenre.setGenre("WESTERN");

        Mockito.when(userMovieService.setUserGenre(ArgumentMatchers.any())).thenReturn(userGenre);
        String json = mapper.writeValueAsString(userGenre);
        mockMvc.perform(put("/user").contentType(MediaType.APPLICATION_JSON).characterEncoding("utf-8")
                        .content(json).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
                .andExpect(jsonPath("$.loginId", Matchers.equalTo(2)))
                .andExpect(jsonPath("$.genre", Matchers.equalTo("WESTERN")));



    }
    @Test
    public void givenUpdatedGenre_ifUserNotExist_thenReturn404() throws Exception{




        UserGenre userGenre = new UserGenre();
        userGenre.setLoginId(2);
        userGenre.setGenre("WESTERN");

        Mockito.when(userMovieService.setUserGenre(ArgumentMatchers.any())).thenThrow(new UserNotFoundException("No User With Given Login Id"));
        String json = mapper.writeValueAsString(userGenre);
        mockMvc.perform(put("/user").contentType(MediaType.APPLICATION_JSON).characterEncoding("utf-8")
                        .content(json).accept(MediaType.APPLICATION_JSON)).andExpect(status().is4xxClientError())
                .andExpect(jsonPath("$.message", Matchers.equalTo("gRPC Response: {No User With Given Login Id}")));




    }


    @Test
    public void givenUpdatedGenre_ifRequestIsBad_thenReturn400() throws Exception{



        Mockito.when(userMovieService.setUserGenre(ArgumentMatchers.any())).thenThrow(new BadGenreUpdateRequestException());
        String json = "{\n" +
                "    \"loginId\":4,\n" +
                "    \"genre\":\"WESTERN\"\n" +
                "}";
        mockMvc.perform(put("/user").contentType(MediaType.APPLICATION_JSON).characterEncoding("utf-8")
                .content(json).accept(MediaType.APPLICATION_JSON)).andExpect(status().is4xxClientError())
                .andExpect(jsonPath("$.message", Matchers.equalTo("Bad Update Genre Request")));



    }



    @Test
    void givenUserLoginId_thenReturnMovieList200() throws Exception {
        List<RecommendedMovie> movieList = new ArrayList<>();

        RecommendedMovie recommendedMovie = new RecommendedMovie();
        recommendedMovie.setId(10);
        recommendedMovie.setTitle("2022 Movie Title");
        recommendedMovie.setYear(2022);
        recommendedMovie.setRating(7.7);
        recommendedMovie.setGenre("DRAMA");

        movieList.add(recommendedMovie);

        Mockito.when(userMovieService.getUserMovieSuggestions(2)).thenReturn(movieList);
        String json = "{\n" +
                "    \n" +
                "}";
        mockMvc.perform(get("/user/{loginId}",2).contentType(MediaType.APPLICATION_JSON).characterEncoding("utf-8")
                        .content(json).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
                .andExpect(jsonPath("$", Matchers.hasSize(1)))
                .andExpect(jsonPath("$[0].id", Matchers.equalTo(10)))
                .andExpect(jsonPath("$[0].title", Matchers.equalTo("2022 Movie Title")));



    }






}