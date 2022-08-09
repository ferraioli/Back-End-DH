public class Embalagem extends Artigo{


    @Override
    public void processar(int lote, int peso, String embalagem) {
        if (embalagem.equalsIgnoreCase("saudavel") ||
                embalagem.equalsIgnoreCase("saudável") ||
                embalagem.equalsIgnoreCase("quase saudavel") ||
                embalagem.equalsIgnoreCase("quase saudável") || this.seguinteArtigo!= null){
            System.out.println("Produto aprovado!!!");
        } else{
            System.out.println("Produto rejeitado!!!");
        }
    }
}
