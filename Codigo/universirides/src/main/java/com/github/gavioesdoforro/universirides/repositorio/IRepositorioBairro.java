package com.github.gavioesdoforro.universirides.repositorio;

import com.github.gavioesdoforro.universirides.modelo.Bairro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioBairro extends JpaRepository<Bairro, Long> {
}
