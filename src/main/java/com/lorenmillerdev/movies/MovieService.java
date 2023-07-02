package com.lorenmillerdev.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    // Business logic

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> movieById(ObjectId id){
        return movieRepository.findById(id);
    }
}
