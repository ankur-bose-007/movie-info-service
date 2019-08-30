package com.cts.movieinfoservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.movieinfoservice.models.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable String movieId){
		return new Movie(movieId,"Test name");
	}
}
