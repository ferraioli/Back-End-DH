public class FacadeForma {
    private FlyweightQuadrado flyweightQuadrado;
    private FlyweightTriangulo flyweightTriangulo;


    public FacadeForma() {
       flyweightQuadrado = new FlyweightQuadrado();
       flyweightTriangulo = new FlyweightTriangulo();

    }

    public void criarformas(String[][] listaformas){
        for (int i = 0; i< listaformas.length; i++){
            if (listaformas[i][0].equals("triangulo")) {
                flyweightTriangulo.obterTriangulo(listaformas[i][1]);
            }
            if (listaformas[i][0].equals("quadrado")){
                flyweightQuadrado.obterquadrado(Integer.parseInt(listaformas[i][2]) );
            }
        }
    }
}
