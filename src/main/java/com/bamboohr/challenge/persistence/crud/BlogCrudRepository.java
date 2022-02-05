package com.bamboohr.challenge.persistence.crud;

import java.util.List;

import com.bamboohr.challenge.domain.Blog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BlogCrudRepository extends CrudRepository<Blog, Integer> {

    @Query("select b from Blog b order by b.timestamp desc")
    List<Blog> findAllByTime();

}
