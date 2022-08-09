public class Estagiario extends Vendedor{
    public Estagiario(String nome){
        super.nome = nome;
        super.PONTOS_POR_VENDA = 5;
    }

    @Override
    public int calcularPontos() {
        return this.vendas * PONTOS_POR_VENDA;
    }

    public String mostrarCategoria() {
        if (calcularPontos() < 50){
            return "Estágiario novato";
        }else{
            return "Estágiario experiente";
        }
    }

    @Override
    public void recategorizar() {

    }
}
