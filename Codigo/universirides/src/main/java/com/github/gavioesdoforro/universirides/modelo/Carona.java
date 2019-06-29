package com.github.gavioesdoforro.universirides.modelo;

import com.github.gavioesdoforro.universirides.modelo.enums.Tipo;

public class Carona {

    private String descricao;

    private Tipo tipo;


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
