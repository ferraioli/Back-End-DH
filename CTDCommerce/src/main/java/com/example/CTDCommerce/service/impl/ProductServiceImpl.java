package com.example.CTDCommerce.service.impl;

import com.example.CTDCommerce.entity.Product;
import com.example.CTDCommerce.entity.dto.CategoryDTO;
import com.example.CTDCommerce.entity.dto.ProductDTO;
import com.example.CTDCommerce.repository.CategoryRepository;
import com.example.CTDCommerce.repository.ProductRepository;
import com.example.CTDCommerce.service.ICommerce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ICommerce<ProductDTO> {

   @Autowired
   private ProductRepository productRepository;

   @Autowired
   private CategoryServiceImpl categoryService;

    @Override
    public ProductDTO create(ProductDTO productDTO) {
        Product product = new Product(productDTO);

        //Isso faz a mesma coisa que a parte de baixo
        String categoryName = productDTO.getCategory();
        int categoryId = categoryService.getByName(categoryName);
        product.setCategoryId(categoryId);

        // Isso faz a mesma coisa da linha de cima
        /*product.setCategory(categoryService.getByName(productDTO.getCategory()));*/


        if(product.getCategoryId() != 0){
            productRepository.create(product);
        }
        return productDTO;
    }

    @Override
    public ProductDTO getById(Integer id) {

        Product product = productRepository.getById(id);
        ProductDTO productDTO = new ProductDTO(product);


       /* int categoryId = productEntity.getCategoryId();
        CategoryDTO categoryDTO = categoryService.getById(categoryId);
        String categoryName = categoryDTO.getName();
        productDTO.setCategory(categoryName);*/


        productDTO.setCategory(categoryService.getById(product.getCategoryId()).getName());
        return productDTO;
    }
}
