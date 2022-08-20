public class Main {
    public static void main(String[] args) {
        FlyweightTriangulo flyweightTriangulo = new FlyweightTriangulo();
        Triangulo triangulo = flyweightTriangulo.obterTriangulo("vermelho");
        triangulo.setTamanho(2);
        Triangulo triangulo2 = flyweightTriangulo.obterTriangulo("vermelho");
        triangulo2.setTamanho(4);
        Triangulo triangulo3 = flyweightTriangulo.obterTriangulo("azul");
        triangulo3.setTamanho(5);


        System.out.println(flyweightTriangulo.getTrianguloMap().size());
        System.out.println(triangulo.toString());
        System.out.println(triangulo2.toString());
        System.out.println(triangulo3.toString());


    }
}
