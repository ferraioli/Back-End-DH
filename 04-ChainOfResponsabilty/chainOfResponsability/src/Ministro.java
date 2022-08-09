public class Ministro extends Politico{
    @Override
    public void processarSolicitacao(int sigilo) {
        if (sigilo <= 2 && this.seguintePolitico != null ){
            System.out.println("Eu estou encarregado de administrar isso. Ministro");
            this.seguintePolitico.processarSolicitacao(sigilo);
        }else if (this.seguintePolitico != null){
            this.seguintePolitico.processarSolicitacao(sigilo);
        }
    }
}

