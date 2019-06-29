package com.github.gavioesdoforro.universirides.repositorio;

import com.github.gavioesdoforro.universirides.modelo.Carona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioCarona extends JpaRepository<Carona, Long> {
}
