import java.util.HashMap;
import java.util.Map;

public class FlyweightQuadrado {
private Map<Integer, Quadrado> quadradoMap = new HashMap<>();
    public Quadrado obterquadrado(Integer tamanho){
        Quadrado quadrado = quadradoMap.get(tamanho);
        if (quadrado == null){
            quadrado = new Quadrado(tamanho);
            quadradoMap.put(tamanho, quadrado);
        }
        return quadrado;
    }
}
