package com.github.gavioesdoforro.universirides.modelo;

import com.github.gavioesdoforro.universirides.modelo.enums.Tipo;
import com.github.gavioesdoforro.universirides.modelo.enums.Turno;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Carona extends ObjetoPadrao {

    private String descricao;

    private Tipo tipo;

    private Turno turno;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bairro", nullable = false)
    private Bairro bairro;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;


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

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Carona{" +
                "descricao='" + descricao + '\'' +
                ", tipo=" + tipo +
                ", turno=" + turno +
                ", bairro=" + bairro.getNome() +
                ", usuario=" + usuario.getNome() +
                '}';
    }
}
