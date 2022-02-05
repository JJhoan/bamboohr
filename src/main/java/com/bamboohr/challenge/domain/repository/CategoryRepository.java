package com.bamboohr.challenge.domain.repository;

import java.util.Optional;

import com.bamboohr.challenge.domain.Category;

public interface CategoryRepository {

    Optional<Category> findById(Integer id);
}
