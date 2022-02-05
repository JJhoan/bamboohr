package com.bamboohr.challenge.persistence;

import java.util.Optional;

import com.bamboohr.challenge.domain.Category;
import com.bamboohr.challenge.domain.repository.CategoryRepository;
import com.bamboohr.challenge.persistence.crud.CategoryCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PostgressCategoryRepository implements CategoryRepository {

    private final CategoryCrudRepository repository;

    public PostgressCategoryRepository(CategoryCrudRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Category> findById(Integer id) {
        return repository.findById(id);
    }
}
