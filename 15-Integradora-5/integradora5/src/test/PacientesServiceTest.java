package test;

import org.junit.jupiter.api.Test;
import pacientes.dao.ConfigJDBC;
import pacientes.dao.impl.EnderecoDaoImpl;
import pacientes.dao.impl.PacienteDaoImpl;
import pacientes.model.Endereco;
import pacientes.model.Pacientes;
import pacientes.service.ClinicaService;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PacientesServiceTest {
        private ClinicaService clinicaService = new ClinicaService( new EnderecoDaoImpl(new ConfigJDBC()), new PacienteDaoImpl( new ConfigJDBC()));


        @Test
    public void salvarPaciente(){
            Pacientes pacientes = new Pacientes("Marcos", "Paulo",
                    "145816546", LocalDate.of(2012, 12,24),
                    new Endereco("Aurelio", "25", "Marcia Domp", "Alistar" ));

           clinicaService.salvar(pacientes);
            assertTrue( pacientes.getId() != null);
            assertTrue(pacientes.getEndereco() != null);
        }
}