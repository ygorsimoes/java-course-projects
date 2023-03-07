package com.ygorsimoes.controller;

import com.ygorsimoes.model.Movie;
import com.ygorsimoes.repository.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movie")
@AllArgsConstructor
public class MovieController {

    private MovieRepository movieRepository;

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public @ResponseBody List<Movie> listAll() {
        return movieRepository.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public @ResponseBody Movie findById(@PathVariable Long id) {
        return movieRepository.findById(id).orElseThrow();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Movie create(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movie> update(@PathVariable Long id, @RequestBody Movie movie) {
        return movieRepository.findById(id)
                .map(recordFound -> {
                    recordFound.setTitle(movie.getTitle());
                    recordFound.setGenre(movie.getGenre());
                    Movie updated = movieRepository.save(recordFound);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return movieRepository.findById(id)
                .map(recordFound -> {
                    movieRepository.deleteById(id);
                    return ResponseEntity.ok().<Void>build();
                }).orElse(ResponseEntity.notFound().build());
    }
}