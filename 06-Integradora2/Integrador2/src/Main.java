public class Main {
    public static void main(String[] args) {
        GradeDeFilmesProxy proxy = new GradeDeFilmesProxy(new GradeDeFilmes());
        proxy.setIp(new Ip(100, 23, 23, 25));

        Serie serieProxy = new Serie("Sandman","Brasil");


        try {
            System.out.println(proxy.getFilme("The White Tiger").getLink());
            System.out.println("Acesso Liberado");
        } catch (FilmeNaoHabilitadoException e) {
            System.out.println(e);
        }

        System.out.println(serieProxy.getSerie(serieProxy.getNome()));
    }
}
