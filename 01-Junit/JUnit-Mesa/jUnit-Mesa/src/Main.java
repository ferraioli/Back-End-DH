public class Main {
    public static void main(String[] args) {
        Figura circulo =  new Circulo(2);
        Figura quadrado =  new Quadrado(2);

        System.out.println( circulo.calcPerimetro());
        System.out.println( quadrado.calcPerimetro());

    }
}
