package com.greenfox.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by rudolfps on 2017.01.03..
 */

    @Entity (name = "posts")
    @Data
    public class Post {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        private String author;
        private String content;
        public int score;
        private String    title;


    public Post(){
        }

        public Post(String title, String author, String content){
            this.title = title;
            this.author = author;
            this.content = content;
        }

        public void increment(){
            score++;
        }

        public void decrement(){
            score--;
        }
    }

