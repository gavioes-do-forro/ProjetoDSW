package com.github.gavioesdoforro.universirides.modelo;

import com.github.gavioesdoforro.universirides.modelo.enums.Vinculo;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends ObjetoPadrao{

    private String nome;
    private String whatsApp;

    private Vinculo vinculo;

    private List<Carona> caronasList = new ArrayList<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getWhatsApp() {
        return whatsApp;
    }

    public void setWhatsApp(String whatsApp) {
        this.whatsApp = whatsApp;
    }

    public Vinculo getVinculo() {
        return vinculo;
    }

    public void setVinculo(Vinculo vinculo) {
        this.vinculo = vinculo;
    }

    public List<Carona> getCaronasList() {
        return caronasList;
    }

    public void setCaronasList(List<Carona> caronasList) {
        this.caronasList = caronasList;
    }
}
