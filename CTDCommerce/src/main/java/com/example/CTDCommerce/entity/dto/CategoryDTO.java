package com.example.CTDCommerce.entity.dto;

import com.example.CTDCommerce.entity.Category;

public class CategoryDTO {
    private String name;


    public CategoryDTO(Category category) {
        this.name = category.getName();
    }

    public CategoryDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
