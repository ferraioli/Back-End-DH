import java.io.Serializable;
import java.util.List;


public class Empresa implements Serializable {
    private String CNPJ;
    private String razaoSocial;
    private List<Funcionarios> funcionarios;

    public Empresa(String CNPJ, String razaoSocial, List<Funcionarios> funcionarios) {
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
        this.funcionarios = funcionarios;
    }

    public Empresa(String CNPJ, String razaoSocial) {
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public List<Funcionarios> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionarios> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
