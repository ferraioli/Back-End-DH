package com.example.mvcmesa.controller;

import com.example.mvcmesa.model.Veiculo;
import com.example.mvcmesa.service.impl.VeiculoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoTrainer {

        @Autowired
        private VeiculoServiceImpl veiculoService;

        @GetMapping
        public List<Veiculo> getVeiculo(){
            return veiculoService.veiculos();
        }
}
