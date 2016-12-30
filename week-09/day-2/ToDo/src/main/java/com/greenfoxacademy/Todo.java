package com.greenfoxacademy;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by gabkamabka on 2016.12.20..
 */
public class Todo {
    int Id;
    String title;
    Boolean isUrgent,isDone;


    public Todo(int i, String s, boolean b, boolean b1) {
    }


    public Todo(int i, String s) {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getUrgent() {
        return isUrgent;
    }

    public void setUrgent(Boolean urgent) {
        isUrgent = urgent;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }
}
