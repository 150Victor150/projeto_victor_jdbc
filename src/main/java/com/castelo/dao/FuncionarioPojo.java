package com.castelo.dao;

public class FuncionarioPojo {
    private int id;
    private String nome;
    private String login;
    private String senha;
    
    public FuncionarioPojo() {
    }
    
    public FuncionarioPojo(String nome, String login, String senha, int id) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public int getId(){
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setId(int id){
        this.id = id;
    }
    
    
}
