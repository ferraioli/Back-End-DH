public class Main {
    public static void main(String[] args) {
        Artigo handler = new Lote().setSeguinteArtigo( new Peso().setSeguinteArtigo( new Embalagem()));

        handler.processar(1900, 1230, "saudavel");
    }
}
