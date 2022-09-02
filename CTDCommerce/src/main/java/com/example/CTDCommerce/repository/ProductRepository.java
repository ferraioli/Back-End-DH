package com.example.CTDCommerce.repository;

import com.example.CTDCommerce.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class ProductRepository {

    private static Map<Integer, Product> productMap = new HashMap<>();

    private static int idCategory = 1;

    public Product create(Product product){
        product.setId(idCategory++);
        productMap.put(product.getId(), product);
        return product;
    }

    public Product getById(int id){
        return productMap.get(id);
    }

}
