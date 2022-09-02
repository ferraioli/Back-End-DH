package com.example.CTDCommerce.controller;

import com.example.CTDCommerce.entity.dto.CategoryDTO;
import com.example.CTDCommerce.entity.dto.ProductDTO;
import com.example.CTDCommerce.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
     private ProductServiceImpl productService;


    @PostMapping
    public ProductDTO create(@RequestBody ProductDTO productDTO){
        return productService.create(productDTO);
    }

    @GetMapping("/{id}")
    public ProductDTO getById(@PathVariable int id){
        return productService.getById(id);
    }
}
