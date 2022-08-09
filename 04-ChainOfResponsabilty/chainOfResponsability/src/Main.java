public class Main {
    public static void main(String[] args) {
        Politico handler = new Deputado().setSeguintePolitico(new
                Ministro().setSeguintePolitico(new Presidente()));

        handler.processarSolicitacao(3);
        System.out.println("----------------");
        handler.processarSolicitacao(2);
        System.out.println("----------------");
        handler.processarSolicitacao(1);
    }
}
