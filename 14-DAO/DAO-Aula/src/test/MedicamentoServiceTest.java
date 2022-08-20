package test;

import medicamentos.dao.ConfigJDBC;
import medicamentos.dao.impl.MedicamentoDaoImpl;
import medicamentos.model.Medicamento;
import medicamentos.service.MedicamentoService;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class MedicamentoServiceTest {

    private MedicamentoService medicamentoService = new MedicamentoService(
        new    MedicamentoDaoImpl(new ConfigJDBC())
    );

  /*  @Test
    public void salvarMedicamento() throws SQLException {
        Medicamento medicamento = new Medicamento("Ibrupofeno", "Aché", 394,
                23.0);
        medicamentoService.salvar(medicamento);
        assertTrue(medicamento.getId() != null);

    }*/

    @Test
    public void buscarMedicamento() throws SQLException {
        Medicamento medicamento = new Medicamento("Ibrupofeno", "Aché", 394,
                23.0);
        medicamentoService.buscar(1);
    }

}