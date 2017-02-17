package com.greenfox;

import com.greenfox.Domain.Post;
import com.greenfox.Domain.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by gabkamabka on 2017.01.02..
 */

@SpringBootApplication
public class RedditApp implements CommandLineRunner {

    @Autowired
    private PostRepository repository;
    private PostRepository contentRepository;

    public static void main(String[] args) {
        SpringApplication.run(RedditApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            int n = rand.nextInt(5 - (-5) + 1) + -5;
            repository.save(new Post("" + (n)));
        }
    }
}