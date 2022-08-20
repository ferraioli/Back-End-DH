package test;

import dao.ConfigJDBC;
import dao.impl.FilialDaoImpl;
import model.Filial;
import org.junit.jupiter.api.BeforeAll;
import service.FilialService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialServiceTest {

    private FilialService filialService = new FilialService(new FilialDaoImpl(new ConfigJDBC()));
    Filial filial = new Filial("Hilton", "Viera Souto", "256", "Rio De janeiro"
            , "RJ", true);
    Filial filial2 = new Filial("Copacabana Palace", "Avenida Mendes Sá", "689", "Vassouras"
            , "RJ", true);
    Filial filial3 = new Filial("Master hotel", "Rua Alexandre Pires", "785", "Liberdade"
            , "MG", false);
    Filial filial4 = new Filial("Hotel California", "Rua das Águias", "1980", "Ninho aberto"
            , "PI", false);
    Filial filial5 = new Filial("Rick Owens", "Rua Rakim Athelaston", "1988", "Harlem"
            , "NY", true);


    @Test
    public void salvarFilial(){
        filialService.salvarFilial(filial);
        filialService.salvarFilial(filial2);
        filialService.salvarFilial(filial3);
        filialService.salvarFilial(filial4);
        filialService.salvarFilial(filial5);
        assertTrue(filial.getId() != null);
        assertFalse(filial2.getId() != null);
        assertFalse(filial3.getId() != null);
        assertFalse(filial4.getId() != null);
        assertFalse(filial5.getId() != null);


    }
}