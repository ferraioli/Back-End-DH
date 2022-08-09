import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
    List<Pessoa> colecao = new ArrayList<>();

    @BeforeEach
    void doBefore() {
        p1 = new Pessoa("Ivo", LocalDate.of(2016, 3, 23));
        colecao.add(p1);
        p2 = new Pessoa("Ana",  LocalDate.of(1966, 1, 03));
        colecao.add(p2);
        p3 = new Pessoa("Joe",  LocalDate.of(2010, 12, 04));
        colecao.add(p3);
        p4 = new Pessoa("Rob",  LocalDate.of(1976, 10, 25));
        colecao.add(p4);
        p5 = new Pessoa("Ted",  LocalDate.of(2014, 5, 14));
        colecao.add(p5);
        p6 = new Pessoa("Robert",  LocalDate.of(2000, 3, 30));
        colecao.add(p6);
        p7 = new Pessoa("Renata",  LocalDate.of(2010, 1, 18));
        colecao.add(p7);
        p8 = new Pessoa("Murilo",  LocalDate.of(2015, 7, 11));
        colecao.add(p8);
        p9 = new Pessoa("Candido",  LocalDate.of(1975, 9, 01));
        colecao.add(p9);
        p10 = new Pessoa("Camila",  LocalDate.of(2014, 5, 25));
        colecao.add(p10);
    }

    @Test
    void adicionarNomesTest() {
        List<String> colecao2 = p10.adicionarNomes(colecao);

        assertEquals(2, colecao2.size());
    }

    @Test
    void calcularIdadeTest() {
        int idadeMenor = p10.validarIdade();
        int idadeMenor2 = p3.validarIdade();
        int idadeMaior = p4.validarIdade();
        int idadeMaior2 = p2.validarIdade();

        assertEquals(8, idadeMenor);
        assertEquals(45, idadeMaior);
        assertTrue(idadeMenor2<18);
        assertTrue(idadeMaior2>18);
    }
}

