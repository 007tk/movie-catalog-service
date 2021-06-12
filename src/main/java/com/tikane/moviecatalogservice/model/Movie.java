package com.tikane.moviecatalogservice.model;

public class Movie {

    private String  MovieId;
    private String  Name;

    public Movie() {
    }

    public Movie(String movieId, String name) {
        MovieId = movieId;
        Name = name;
    }

    public String getMovieId() {
        return MovieId;
    }

    public void setMovieId(String movieId) {
        MovieId = movieId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }




}
