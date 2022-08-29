package com.example.mvcmesa.service.impl;

import com.example.mvcmesa.model.Veiculo;
import com.example.mvcmesa.service.IVeiculoService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class VeiculoServiceImpl implements IVeiculoService {
    @Override
    public List<Veiculo> veiculos() {
        return Arrays.asList(new Veiculo("Fiat", "Vermelho"),
                new Veiculo("Ford", "Azul"));
    }
}
