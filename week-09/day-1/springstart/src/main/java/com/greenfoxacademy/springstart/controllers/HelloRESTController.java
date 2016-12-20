package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by gabkamabka on 2016.12.19..
 */

@RestController
public class HelloRESTController {


    static final AtomicLong counter = new AtomicLong();


    @RequestMapping(value="/greeting")
    @ResponseBody
    public Greeting greeting(@RequestParam String name){
        Greeting greets = new Greeting(counter.getAndIncrement(), "Hello, "+ name);
        return greets;
    }
}
