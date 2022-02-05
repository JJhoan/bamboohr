package com.bamboohr.challenge.domain.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.bamboohr.challenge.config.BlogNotFound;
import com.bamboohr.challenge.domain.Blog;
import com.bamboohr.challenge.domain.Category;
import com.bamboohr.challenge.domain.repository.BlogRepository;
import com.bamboohr.challenge.domain.repository.CategoryRepository;
import com.bamboohr.challenge.web.controller.BlogRequest;
import com.bamboohr.challenge.web.controller.BlogResponse;
import com.bamboohr.challenge.web.controller.FullBlogResponse;
import org.springframework.stereotype.Service;

@Service
public class BlogService {

    private final BlogRepository blogRepository;
    private final CategoryRepository categoryRepository;

    public BlogService(BlogRepository blogRepository, CategoryRepository categoryRepository) {
        this.blogRepository = blogRepository;
        this.categoryRepository = categoryRepository;
    }

    public BlogResponse save(BlogRequest blogRequest) {
        Category category = categoryRepository.findById(blogRequest.categoryId())
                .orElseThrow(NullPointerException::new);

        Blog blog = new Blog();
        blog.setCategory(category);
        blog.setText(blogRequest.text());
        blog.setTitle(blogRequest.title());
        blog.setTimestamp(LocalDateTime.now());

        Blog savedBlog = blogRepository.save(blog);

        BlogResponse blogResponse = new BlogResponse();

        blogResponse.setCategoryId(category.getId());
        blogResponse.setText(savedBlog.getText());
        blogResponse.setTitle(savedBlog.getTitle());
        blogResponse.setId(savedBlog.getId());
        blogResponse.setTimestamp(blog.getTimestamp());

        return blogResponse;
    }

    public List<FullBlogResponse> findAll() {
        List<Blog> blogs = blogRepository.findAll();
        return blogs.stream()
                .map(FullBlogResponse::toResponse)
                .collect(Collectors.toList());
    }

    public FullBlogResponse findBlog(Integer id)  {
        Blog blog = blogRepository.findById(id).orElseThrow(BlogNotFound::new);
        return FullBlogResponse.toResponse(blog);
    }
}
