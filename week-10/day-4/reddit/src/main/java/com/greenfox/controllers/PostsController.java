package com.greenfox.controllers;
import com.greenfox.services.PostService;
import com.greenfox.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by rudolfps on 2017.01.04..
 */
@Controller
@RequestMapping("/posts")
public class PostsController {

    @Autowired
    private PostService service;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String listPosts(Model model){
        model.addAttribute("posts", service.getPostSorted());

        return "posts/post";
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable long id) {
        service.delete(id);
        return new ModelAndView("redirect:/posts");
    }

    @GetMapping("/add")
    public String createNewPost(Model model) {
        model.addAttribute("post", new Post());
        return "posts/add";
    }

    @PostMapping("/add")
    public String addNewPost(@ModelAttribute Post post){
        service.save(post);
        return "redirect:/posts";
    }
    @GetMapping("/thankyou")
    public String thankyou(Model model) {
        model.addAttribute("thankyou", new Post());
        return "posts/thankyou";
    }

    @GetMapping("{id}/edit")
    public String editPost(@PathVariable long id, Model model) {
        model.addAttribute("post", service.findAPost(id));
        return "posts/edit";
    }

    @PostMapping("/edit")
    public String addEditedPost(@ModelAttribute Post post) {
        System.out.println(post.getId());
        service.save(post);
        return "redirect:/posts";
    }

    @RequestMapping("{id}/upvote")
    public String upvote(@PathVariable long id) {
        service.upvote(id);
        return "redirect:/posts";
    }

    @RequestMapping("{id}/downvote")
    public String downvote(@PathVariable long id) {
        service.downvote(id);
        return "redirect:/posts";
    }


}