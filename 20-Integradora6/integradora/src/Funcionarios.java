import java.io.Serializable;

public class Funcionarios implements Serializable {
    private String nome;
    private String sobrenome;
    private String documentoDeIdentificacao;
    private double salario;

    public Funcionarios(String nome, String sobrenome, String documentoDeIdentificacao, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.documentoDeIdentificacao = documentoDeIdentificacao;
        this.salario = salario;
    }

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

    public String getDocumentoDeIdentificacao() {
        return documentoDeIdentificacao;
    }

    public void setDocumentoDeIdentificacao(String documentoDeIdentificacao) {
        this.documentoDeIdentificacao = documentoDeIdentificacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", documentoDeIdentificacao='" + documentoDeIdentificacao + '\'' +
                ", salario=" + salario +
                '}';
    }
}
