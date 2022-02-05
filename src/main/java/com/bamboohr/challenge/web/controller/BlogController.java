package com.bamboohr.challenge.web.controller;

import java.util.List;

import com.bamboohr.challenge.domain.service.BlogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @PostMapping("/posts")
    public BlogResponse create(@RequestBody BlogRequest request) {
        return blogService.save(request);
    }

    @GetMapping("/posts/")
    public List<FullBlogResponse> findAll() {
        return blogService.findAll();
    }

    @GetMapping("/post/{id}")
    public FullBlogResponse findBlog(@PathVariable Integer id) {
        return blogService.findBlog(id);
    }



}
