package com.example.bibliotecaservice.api.service;

import com.example.bibliotecaservice.domain.model.Juegos;

import java.util.List;

public interface IBibliotecaService {

    List<Juegos> getJuegoByBiblioteca (String biblioteca);
}
