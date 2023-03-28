package dev.shan.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// @RestController         // To say that this is a rest api controller not just an another class
public class MoviesApplication {

	public static void main(String[] args) { SpringApplication.run(MoviesApplication.class, args); }

}
