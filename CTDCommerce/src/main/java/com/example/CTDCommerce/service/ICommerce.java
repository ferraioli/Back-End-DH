package com.example.CTDCommerce.service;

public interface ICommerce<T> {

    T create(T t);
    T getById(Integer id);

}
