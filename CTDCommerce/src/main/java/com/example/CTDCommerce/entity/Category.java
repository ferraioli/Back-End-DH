package com.example.CTDCommerce.entity;

import com.example.CTDCommerce.entity.dto.CategoryDTO;

public class Category {
    private Integer id;
    private String name;

    public Category(CategoryDTO categoryDTO) {
        this.name = categoryDTO.getName();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
