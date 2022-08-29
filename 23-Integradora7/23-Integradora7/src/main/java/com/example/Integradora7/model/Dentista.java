package com.example.Integradora7.model;

public class Dentista {

    private Integer id;
    private String nome;
    private String email;
    private String numMatricula;
    private String atendeConvenio;

    public Dentista(Integer id, String nome, String email, String numMatricula, String atendeConvenio) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.numMatricula = numMatricula;
        this.atendeConvenio = atendeConvenio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getAtendeConvenio() {
        return atendeConvenio;
    }

    public void setAtendeConvenio(String atendeConvenio) {
        this.atendeConvenio = atendeConvenio;
    }
}
