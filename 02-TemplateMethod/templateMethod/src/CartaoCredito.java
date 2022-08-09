public class CartaoCredito extends Cartao{

    private double limite;
    private double saldoUtilizado;

    public CartaoCredito(String numeroCartao, int segurancaNumero, String dataValidade, double limite, double saldoUtilizado) {
        super(numeroCartao, segurancaNumero, dataValidade);
        this.limite = limite;
        this.saldoUtilizado = saldoUtilizado;
    }

    @Override
    protected void ProcessarCompra(double valorCompra) {

    }
}
