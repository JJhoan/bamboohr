package com.bamboohr.challenge.domain.repository;

import java.util.List;
import java.util.Optional;

import com.bamboohr.challenge.domain.Blog;

public interface BlogRepository {

    Blog save(Blog blog);

    List<Blog> findAll();

    Optional<Blog> findById(Integer id);

}
