package com.github.gavioesdoforro.universirides.modelo;

import com.github.gavioesdoforro.universirides.modelo.enums.Vinculo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Usuario extends ObjetoPadrao {

    private String nome;
    private String whatsApp;

    private Vinculo vinculo;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
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

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + this.getId() +
                ", nome='" + nome + '\'' +
                ", whatsApp='" + whatsApp + '\'' +
                ", vinculo=" + vinculo +
                ", caronasList=" + caronasList +
                '}';
    }
}
