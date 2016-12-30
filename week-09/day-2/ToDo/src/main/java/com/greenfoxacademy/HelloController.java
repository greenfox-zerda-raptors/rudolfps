package com.greenfoxacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by gabkamabka on 2016.12.20..
 */

@Controller
public class HelloController {

    @RequestMapping(value ="/helloWorld")
     public String helloWorld(Model model, @RequestParam(required = false, defaultValue = "It is going to be a ToDo App") String name){
            Date today = new Date();
            model.addAttribute("name", name);
            model.addAttribute("today", today);
            return "helloWorld";
    }
}
