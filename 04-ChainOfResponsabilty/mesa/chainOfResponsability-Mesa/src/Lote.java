public class Lote  extends Artigo{




    @Override
    public void processar( int lote, int peso, String embalagem) {
        if (lote >= 1000 && lote <= 2000 || this.seguinteArtigo!= null ){
            this.seguinteArtigo.processar(lote, peso, embalagem);
        } else{
            System.out.println("Produto rejeitado");
        }
    }
}
