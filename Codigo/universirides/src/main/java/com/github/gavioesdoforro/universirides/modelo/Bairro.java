package com.github.gavioesdoforro.universirides.modelo;

import javax.persistence.Entity;

@Entity
public class Bairro extends ObjetoPadrao {


    private String nome;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Bairro{" +
                "id=" + this.getId() +
                ", nome='" + nome + '\'' +
                '}';
    }
}
