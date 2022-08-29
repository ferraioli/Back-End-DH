package com.example.Integradora7.service.impl;

import com.example.Integradora7.model.Dentista;
import com.example.Integradora7.model.Usuario;
import com.example.Integradora7.service.IService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DentistaServiceImpl implements IService<Dentista> {
    private static Map<Integer, Dentista> dentistaMap = new HashMap<>();


    @Override
    public Dentista salvar(Dentista dentista) {
        dentistaMap.put(dentista.getId(), dentista);
        return dentista;
    }


    @Override
    public List<Dentista> buscartodos() {
        return new ArrayList<>(dentistaMap.values());
    }

    @Override
    public String excluir(Integer id) {
        return "Dentista removido";
    }
}
