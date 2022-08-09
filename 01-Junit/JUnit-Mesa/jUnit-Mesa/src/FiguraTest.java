import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiguraTest {

    Figura circulos, quadrado;
    @BeforeEach
    void doBefore(){
    Figura circulos =  new Circulo(2);
    Figura quadrado =  new Quadrado(2);
    }

    @Test
    void calcPerimetroTest(){
       int circulo = circulos.calcPerimetro();
        assertEquals(circulo, circulos.calcPerimetro());
    }

}