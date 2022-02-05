package com.bamboohr.challenge.web.controller;

import java.sql.Date;
import java.time.LocalDateTime;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

public final class BlogResponse {

    private Integer id;

    private String title;

    private String text;

    @JsonFormat(pattern = "dd/MM/yyyy hh:mm:ss a")
    private LocalDateTime timestamp;

    private Integer categoryId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime timestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}
