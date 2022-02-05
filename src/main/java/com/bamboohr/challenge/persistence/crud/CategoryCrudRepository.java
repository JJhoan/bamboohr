package com.bamboohr.challenge.persistence.crud;

import com.bamboohr.challenge.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {

}
