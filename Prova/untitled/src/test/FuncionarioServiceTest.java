package test;

import dao.ConfigJDBC;
import dao.impl.FuncionarioDaoImpl;
import model.Funcionario;
import org.junit.jupiter.api.Test;
import service.FuncionarioService;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioServiceTest {
    private FuncionarioService funcionarioService = new FuncionarioService(
            new FuncionarioDaoImpl(
            new ConfigJDBC()));

    @Test
    public void salvar() {
        Funcionario funcionario = new Funcionario("Marcos", "Paulo", "123456789",
                "12345789", "Diretor", true);
        funcionarioService.salvar(funcionario);
        Funcionario funcionario2 = new Funcionario("Marcos", "Paulo", "123456789",
                "12345789", "Diretor", true);
        funcionarioService.salvar(funcionario2);


        assertTrue(funcionario.getId() != null);
    }
}