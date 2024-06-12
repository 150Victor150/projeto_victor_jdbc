package com.castelo.dao;

public class PessoaPojo {
    private int id;
    private String nome;
    private int idade;
    private String endereco;

    
    public PessoaPojo() {
    }

    public PessoaPojo(String nome, int idade, String endereco, int id) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getId(){
        return id;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setId(int id){
        this.id = id;
    }

}
