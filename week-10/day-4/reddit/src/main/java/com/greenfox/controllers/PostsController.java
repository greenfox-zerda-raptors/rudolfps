package com.greenfox.controllers;
import com.greenfox.model.Post;
import com.greenfox.repositories.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by rudolfps on 2017.01.04..
 */
@Controller
@RequestMapping ("/posts")
public class PostsController {

    @Autowired
    private PostRepository repository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String listPosts(Model model){
        model.addAttribute("posts", repository.findAll());
        return "posts/post";
    }


    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable long id) {
        repository.delete(id);
        return new ModelAndView("redirect:/posts");
    }



    @GetMapping("/add")
    public String createPosts(Model model) {
        model.addAttribute("post", new Post());
        return "posts/add";
    }


    @PostMapping(value = "/add")
    public String addPosts(@ModelAttribute Post post){
        repository.save(post);
        return "redirect:/posts";
    }


    @GetMapping(value = "/{id}/edit")
    public String edit(@PathVariable long id,
                       Model model) {
        Post post = repository.findOne(id);
        model.addAttribute("post", post);
        return "posts/edit";
    }



    @PostMapping(value = "/update")
    public ModelAndView update(@RequestParam("post_id") long id,
                               @RequestParam("content") String content) {
        Post post = repository.findOne(id);
        post.setContent(content);
        repository.save(post);
        return new ModelAndView("redirect:/posts");
    }



    @RequestMapping(value = "/{id}/upvote")
    public String upVote(@PathVariable("id") long id) {
        Post post = repository.findOne(id);
        post.increment();
        repository.save(post);
        return "redirect:/posts";
    }

    @RequestMapping(value = "/{id}/downvote")
    public String downVote(@PathVariable("id") long id) {
        Post post = repository.findOne(id);
        post.decrement();
        repository.save(post);
        return "redirect:/posts";
    }


}