package com.example.Integradora7.service;

import com.example.Integradora7.model.Usuario;

import java.util.List;

public interface IService<T> {


    public T salvar(T t);

    public List<T> buscartodos();
    public String excluir(Integer id);

}
