public abstract class Politico {
    protected Politico seguintePolitico;

    public abstract void processarSolicitacao(int sigilo);

    public Politico setSeguintePolitico(Politico seguintePolitico){
        this.seguintePolitico = seguintePolitico;
        return this;
    }
}
