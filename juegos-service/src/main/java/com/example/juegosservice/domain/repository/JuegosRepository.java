package com.example.juegosservice.domain.repository;

import com.example.juegosservice.domain.model.Juegos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JuegosRepository extends JpaRepository<Juegos, Long> {

    @Query("SELECT m FROM Juegos m WHERE m.biblioteca = ?1")
    List<Juegos> findByBiblioteca(String genre);
}
