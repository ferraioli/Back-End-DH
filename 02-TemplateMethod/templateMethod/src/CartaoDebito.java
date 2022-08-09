public class CartaoDebito extends Cartao{

    private double saldoDisponivel;


    public CartaoDebito(String numeroCartao, int segurancaNumero, String dataValidade,double saldoDisponivel) {
        super(numeroCartao, segurancaNumero, dataValidade);
        this.saldoDisponivel = saldoDisponivel;
    }
    @Override
    protected void ProcessarCompra( double valorCompra){
        if (Processar() == 1){
            if (saldoDisponivel > 0 && saldoDisponivel > valorCompra){
                System.out.println("Processando compra...");
            }else {
                System.out.println("lorem");
            }
        }

    }
}
