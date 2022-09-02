package com.example.CTDCommerce.repository;

import com.example.CTDCommerce.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class CategoryRepository {
    private static Map<Integer, Category>  categoryMap = new HashMap<>();

    private static int idCategory = 1;

    public Category create(Category category){
        category.setId(idCategory++);
        categoryMap.put(category.getId(), category);
        return category;
    }

    public Category getById(int id){
        return categoryMap.get(id);
    }

    public int getByName(String name){
        for (Category category: categoryMap.values()){
            if(category.getName().equalsIgnoreCase(name));
            return category.getId();
        }
        return 0 ;
    }
}
