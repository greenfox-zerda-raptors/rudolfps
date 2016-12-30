package com.greenfoxacademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gabkamabka on 2016.12.20..
 */
@Controller
@RequestMapping(value ="/todo")
public class TodoController {
    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }
}
