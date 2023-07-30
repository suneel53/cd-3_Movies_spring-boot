// Write your code here
package com.example.movie.repository;

import com.example.movie.model.Movie;
import java.util.*;

public interface MovieRepository{
    ArrayList<Movie> getMovies();
    Movie getMovieById(int movieId);
    Movie addMovie(Movie movie);
    Movie updateMovie(Movie movie,int movieId);
    void delete(int movieId);
}