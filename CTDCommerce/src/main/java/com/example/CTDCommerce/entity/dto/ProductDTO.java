package com.example.CTDCommerce.entity.dto;

import com.example.CTDCommerce.entity.Product;

public class ProductDTO {
    private String title;
    private double price;
    private String description ;
    private String image;
    private String category;


    public ProductDTO(Product product) {
        this.title = product.getTitle();
        this.price = product.getPrice();
        this.description = product.getDescription();
        this.image = product.getImage();
    }

    public ProductDTO() {
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
