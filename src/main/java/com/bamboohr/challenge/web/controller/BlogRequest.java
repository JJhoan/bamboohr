package com.bamboohr.challenge.web.controller;

import com.bamboohr.challenge.domain.Blog;
import com.bamboohr.challenge.domain.Category;

public final class BlogRequest {

    private String title;

    private String text;

    private Integer categoryId;

    public String title() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String text() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer categoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

}
