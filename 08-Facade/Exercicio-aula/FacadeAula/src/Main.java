public class Main {
    public static void main(String[] args) {
        Cartao cartao = new Cartao("123456789", "Star Bank");
        Produto produto = new Produto("Milho", "Latas");

        FacadeDesconto facadeDesconto = new FacadeDesconto();

        System.out.println(  facadeDesconto.calcularDesconto(cartao, produto,15));
    }
}
