package com.greenfox.model;

import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by rudolfps on 2017.01.03..
 */

    @Entity (name = "posts")
    @ToString
    public class Post {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;


        private String author;
        private String content;
        private int score;
        private String title;


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


        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

