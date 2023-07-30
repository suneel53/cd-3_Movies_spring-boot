/*
 * You can use the following import statements
 *
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 */

// Write your code here
package com.example.movie.controller;

import com.example.movie.model.Movie;
import com.example.movie.service.MovieH2Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class MovieController{
    @Autowired
    private MovieH2Service ms;

    @GetMapping("/movies")
    public ArrayList<Movie> getMovies(){
        return ms.getMovies();
    }

    @GetMapping("/movies/{movieId}")
    public Movie getMovieById(@PathVariable int movieId){
        return ms.getMovieById(movieId);
    }
    /*
    @PostMapping("/movies")
    public Movie addMovie(@RequestBody Movie movie){
        return ms.addMovie(movie);
    }

    @PutMapping("/movies/{movieId}")
    public Movie updateMovie(@RequestBody Movie movie,@PathVariable int movieId){
        return ms.updateMovie(movie,movieId);
    }

    @DeleteMapping("/movies/{movieId}")
    public void delete(@PathVariable int movieId){
        ms.delete(movieId);
    }
    */
}
