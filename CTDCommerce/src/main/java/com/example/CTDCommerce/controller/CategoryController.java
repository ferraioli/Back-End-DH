package com.example.CTDCommerce.controller;

import com.example.CTDCommerce.entity.dto.CategoryDTO;
import com.example.CTDCommerce.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryServiceImpl categoryService;

    @PostMapping
    public CategoryDTO create(@RequestBody CategoryDTO categoryDTO){
        return categoryService.create(categoryDTO);
    }

    @GetMapping("/{id}")
    public CategoryDTO getById(@PathVariable int id){
        return categoryService.getById(id);
    }

}

