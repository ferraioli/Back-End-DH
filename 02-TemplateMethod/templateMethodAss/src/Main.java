public class Main {
    public static void main(String[] args) {
        Empregado efetivo = new Efetivo("Matheus", "Souza",
                "Efetivo", "31322132",10000.00);
        Empregado contratado = new Contratado("Matheus", "Souza",
                "Efetivo", "31322132",35, 25);
         efetivo.pagarSalario();
         contratado.pagarSalario();


    }
}
