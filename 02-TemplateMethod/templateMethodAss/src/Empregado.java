public abstract class Empregado {
    private String nome;
    private String sobrenome;
    private String vinculo;
    private String numeroConta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }


    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Empregado(String nome, String sobrenome, String vinculo, String numeroConta) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.vinculo = vinculo;
        this.numeroConta = numeroConta;
    }

    public void pagarSalario(){
        calcularSalario();
        imprimir();
        depositar();
    };
    public abstract void calcularSalario();
    public abstract void imprimir();
    public abstract void depositar();
}
