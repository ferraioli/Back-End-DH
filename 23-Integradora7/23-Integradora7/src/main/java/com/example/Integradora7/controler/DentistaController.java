package com.example.Integradora7.controler;


import com.example.Integradora7.model.Dentista;
import com.example.Integradora7.model.Usuario;
import com.example.Integradora7.service.impl.DentistaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/dentista")
public class DentistaController {

    @Autowired
    private DentistaServiceImpl dentistaService;

    @GetMapping
    public Dentista salvar(@RequestParam(value = "id") Integer id,
                          @RequestParam(value = "nome") String nome,
                          @RequestParam(value = "email") String email,
                          @RequestParam(value = "numMatricula") String numMatricula,
                          @RequestParam(value = "atendeConvenio") String atendeConvenio){
        return dentistaService.salvar(new Dentista(id,nome,email,numMatricula,atendeConvenio));
    }
    @GetMapping("/buscar")
    public List<Dentista> buscarTodos(){
        return dentistaService.buscartodos();
    }

    @GetMapping("/{id}")
    public String excluir(@PathVariable Integer id){
        return dentistaService.excluir(id);
    }
}
