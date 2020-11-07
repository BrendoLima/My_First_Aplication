package com.example.newstudy;

public class Publicacao {
    String nome;
    String titulo;
    String conteudo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Publicacao (String nome, String titulo, String conteudo){
        this.nome = nome;
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

}
