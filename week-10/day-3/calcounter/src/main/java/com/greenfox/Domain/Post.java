package com.greenfox.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by gabkamabka on 2017.01.02..
 */
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    public String message;
    public String content;
    public int score;



    public Post() {
    }

    public Post(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void increment() {
        score++;
    }
    public void decrement() {
        score--;
    }
}
