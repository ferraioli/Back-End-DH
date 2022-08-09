public abstract class Cartao {
    protected String numeroCartao;
    protected int segurancaNumero;
    protected String dataValidade;

    public Cartao(String numeroCartao, int segurancaNumero, String dataValidade) {
        this.numeroCartao = numeroCartao;
        this.segurancaNumero = segurancaNumero;
        this.dataValidade = dataValidade;
    }

    public int Processar(){
        if(dataValidade.equals("02/08/2022")){
            System.out.println("Data Inválida");
            return 0;
        } else {
            System.out.println("Processando pagamento");
            return 1;
        }

    }

    protected abstract void ProcessarCompra(double valorCompra);
}
