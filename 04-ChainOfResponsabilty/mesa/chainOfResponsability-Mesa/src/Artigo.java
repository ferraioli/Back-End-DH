public abstract class Artigo {
    Artigo seguinteArtigo;
    private String nome;
    private int lote, peso;
    private String embalagem;

    public Artigo getSeguinteArtigo() {
        return seguinteArtigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }



    public abstract void processar( int lote, int peso,String embalagem);

    public Artigo setSeguinteArtigo(Artigo seguinteArtigo){
        this.seguinteArtigo = seguinteArtigo;
        return this;
    }

}
