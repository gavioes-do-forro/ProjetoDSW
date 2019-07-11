package com.github.gavioesdoforro.universirides.configuracao;

import com.github.gavioesdoforro.universirides.modelo.Bairro;
import com.github.gavioesdoforro.universirides.modelo.Carona;
import com.github.gavioesdoforro.universirides.modelo.Usuario;
import com.github.gavioesdoforro.universirides.modelo.enums.Tipo;
import com.github.gavioesdoforro.universirides.modelo.enums.Turno;
import com.github.gavioesdoforro.universirides.modelo.enums.Vinculo;
import com.github.gavioesdoforro.universirides.repositorio.IRepositorioBairro;
import com.github.gavioesdoforro.universirides.repositorio.IRepositorioCarona;
import com.github.gavioesdoforro.universirides.repositorio.IRepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Intanciacao implements CommandLineRunner {

    @Autowired
    IRepositorioBairro iRepositorioBairro;

    @Autowired
    IRepositorioCarona iRepositorioCarona;

    @Autowired
    IRepositorioUsuario iRepositorioUsuario;

    @Override
    public void run(String... args) throws Exception {

        Bairro bairro = new Bairro();
        bairro.setNome("São Judas");

        Usuario usuario = new Usuario();
        usuario.setNome("Joao");
        usuario.setWhatsApp("62111111111");
        usuario.setVinculo(Vinculo.Discente);

        Carona carona = new Carona();
        carona.setTipo(Tipo.Ida);
        carona.setTurno(Turno.Verspertino);
        carona.setBairro(bairro);
        carona.setUsuario(usuario);
        carona.setDescricao("Indo para a UFG as 12:00");

        System.out.println(iRepositorioBairro.save(bairro));
        System.out.println(iRepositorioUsuario.save(usuario));
        System.out.println(iRepositorioCarona.save(carona));
    }
}
