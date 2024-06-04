package com.example.movieinfoService.resource;


import com.example.movieinfoService.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class movieInfo {

    @RequestMapping("/{movieid}")
    public Movie getmovie (@PathVariable("movieid") String movieid){
        return new Movie("nothing", "9");
    }
}
