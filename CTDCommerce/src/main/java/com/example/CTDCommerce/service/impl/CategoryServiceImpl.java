package com.example.CTDCommerce.service.impl;

import com.example.CTDCommerce.entity.Category;
import com.example.CTDCommerce.entity.dto.CategoryDTO;
import com.example.CTDCommerce.repository.CategoryRepository;
import com.example.CTDCommerce.service.ICommerce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements ICommerce<CategoryDTO> {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public CategoryDTO create(CategoryDTO categoryDTO) {
        Category category = new Category(categoryDTO);
        categoryRepository.create(category);
        return categoryDTO;
    }

    @Override
    public CategoryDTO getById(Integer id) {
        return new CategoryDTO(categoryRepository.getById(id));
    }

    public int getByName(String name){
        return categoryRepository.getByName(name);
    }
}
