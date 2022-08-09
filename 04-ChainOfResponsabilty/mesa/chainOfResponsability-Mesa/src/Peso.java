public class Peso extends Artigo{


    @Override
    public void processar(int lote, int peso, String embalagem) {
        if (peso >= 1200 && peso <= 1300 || this.seguinteArtigo!= null ){
            this.seguinteArtigo.processar(lote, peso, embalagem);
        } else{
            System.out.println("Produto rejeitado!!");
        }
    }
}
