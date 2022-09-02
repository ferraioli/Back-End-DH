package com.example.CTDCommerce.entity;

import com.example.CTDCommerce.entity.dto.ProductDTO;

public class Product {
    private Integer id;
    private String title;
    private double price;
    private String description ;
    private String image;

    private Integer categoryId;


    public Product(ProductDTO productDTO) {
        this.title = productDTO.getTitle();
        this.price = productDTO.getPrice();
        this.description = productDTO.getDescription();
        this.image = productDTO.getImage();

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}
