package model;

public class Filial {
    private Integer id;
    private String nomeFilial;
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private Boolean e5Estrela;


    public Filial(String nomeFilial, String rua, String numero, String cidade, String estado, Boolean e5Estrela) {
        this.nomeFilial = nomeFilial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.e5Estrela = e5Estrela;
    }

    public Filial(Integer id, String nomeFilial, String rua, String numero, String cidade, String estado, Boolean e5Estrela) {
        this.id = id;
        this.nomeFilial = nomeFilial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.e5Estrela = e5Estrela;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getE5Estrela() {
        return e5Estrela;
    }

    public void setE5Estrela(Boolean e5Estrela) {
        this.e5Estrela = e5Estrela;
    }


    @Override
    public String toString() {
        return "Filial{" +
                "id=" + id +
                ", nomeFilial='" + nomeFilial + '\'' +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", e5Estrela=" + e5Estrela +
                '}';
    }
}
