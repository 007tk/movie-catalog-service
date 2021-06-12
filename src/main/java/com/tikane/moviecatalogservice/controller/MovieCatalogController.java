package com.tikane.moviecatalogservice.controller;

import com.tikane.moviecatalogservice.model.CatelogItem;
import com.tikane.moviecatalogservice.model.Movie;
import com.tikane.moviecatalogservice.model.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public List<CatelogItem> getCatalog(@PathVariable("userId") String userId){

        List<Rating> ratings = Arrays.asList(
                new Rating("1234",4),
                new Rating("3456",2)
        );

      return  ratings.stream().map(rating -> {
          Movie movie = restTemplate.getForObject("http://localhost:3030/movies/" + rating.getMovieId(), Movie.class);
          return new CatelogItem(movie.getName(), "action", rating.getRatings());
      }).collect(Collectors.toList());
    }
}
