package com.peekay.discoveryservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

	private static List<Movie> moviesList = new ArrayList<>();
	static {
		moviesList.add(new Movie("MOVIE ABC", "ACTOR ABC", "SYNOPSIS ABC"));
		moviesList.add(new Movie("MOVIE DEF", "ACTOR DEF", "SYNOPSIS DEF"));
		moviesList.add(new Movie("MOVIE GHI", "ACTOR GHI", "SYNOPSIS GHI"));
		moviesList.add(new Movie("MOVIE JKL", "ACTOR JKL", "SYNOPSIS JKL"));
	}

	@GetMapping("/movies")
	public ResponseEntity<?> getMovies() {

		return ResponseEntity.ok(moviesList);

	}

}
