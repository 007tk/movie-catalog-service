package com.tikane.moviecatalogservice.model;

public class Rating {
    private String  movieId;
    private int rating;

    public Rating() {
    }

    public Rating(String movieId, int ratings) {
        this.movieId = movieId;
        this.rating = ratings;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getRatings() {
        return rating;
    }

    public void setRatings(int ratings) {
        this.rating = ratings;
    }
}
