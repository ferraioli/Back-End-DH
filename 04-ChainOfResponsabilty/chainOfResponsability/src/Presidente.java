public class Presidente extends Politico{

    @Override
    public void processarSolicitacao(int sigilo) {
        if (sigilo <= 3 || this.seguintePolitico != null){
            System.out.println("Eu estou encarregado de administrar isso. Presidente");
        }else if (this.seguintePolitico != null){
            this.seguintePolitico.processarSolicitacao(sigilo);
        }
    }
}
