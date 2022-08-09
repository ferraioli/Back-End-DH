public class Main {
    public static void main(String[] args) {
        Cartao cartaoDebito = new CartaoDebito("123456", 123, "22/12/2021",2565.65 );

        cartaoDebito.ProcessarCompra(125.50);
    }
}
