package com.example.Integradora7.service.impl;

import com.example.Integradora7.model.Usuario;
import com.example.Integradora7.service.IService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UsuarioServiceImpl implements IService<Usuario> {
        private static Map<Integer, Usuario> usuarioMap = new HashMap<>();


    @Override
    public Usuario salvar(Usuario user) {
        usuarioMap.put(user.getId(), user);
        return user;
    }

    @Override
    public List<Usuario> buscartodos() {

        return new ArrayList<>(usuarioMap.values());

    }

    @Override
    public String excluir(Integer id) {
        usuarioMap.remove(id);
        return "Usuário Removido";
    }
}
