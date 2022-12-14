public abstract class Vendedor {

    protected String nome;
    protected int vendas = 0;
    protected int PONTOS_POR_VENDA;

    public void vender(int qtdVendas){
        this.vendas += qtdVendas;
        System.out.println(this.nome +" realizou "+ qtdVendas + " vendas.");
    }

    /*Método que calcula os pontos do Vendedor de acordo com seus aspectos
    a serem considerados*/
    public abstract int calcularPontos();

    /*TEMPLATE METHOD - recebe o total de pontos calculados a partir
    da subclasse e valida cada item para retornar a categoria*/
    public String mostrarCategoria(){
       if (calcularPontos() < 20){
           return "Novato";
       }
       else if (calcularPontos() >= 20 && calcularPontos() <= 30){
           return "Aprendiz";
       }

       else if (calcularPontos() >= 31 && calcularPontos() <= 40)
           return "Bom";
       else return "Mestre";
    }

    public abstract void recategorizar();
}