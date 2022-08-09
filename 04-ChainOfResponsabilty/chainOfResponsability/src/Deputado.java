public class Deputado extends Politico{
    @Override
    public void processarSolicitacao(int sigilo) {
        if (sigilo == 1 && this.seguintePolitico != null){
            System.out.println("Eu estou encarregado de administrar isso. Deputado");
            this.seguintePolitico.processarSolicitacao(sigilo);
        }else if (this.seguintePolitico != null){
            this.seguintePolitico.processarSolicitacao(sigilo);
        }
    }
}
