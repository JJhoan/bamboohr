package com.bamboohr.challenge.persistence;

import java.util.List;
import java.util.Optional;

import com.bamboohr.challenge.domain.Blog;
import com.bamboohr.challenge.domain.repository.BlogRepository;
import com.bamboohr.challenge.persistence.crud.BlogCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PostgressBlogRepository implements BlogRepository {

    private final BlogCrudRepository repository;

    public PostgressBlogRepository(BlogCrudRepository repository) {
        this.repository = repository;
    }

    @Override
    public Blog save(Blog blog) {
        return repository.save(blog);
    }

    @Override
    public List<Blog> findAll() {
        return repository.findAllByTime();
    }

    @Override
    public Optional<Blog> findById(Integer id) {
        return repository.findById(id);
    }
}
