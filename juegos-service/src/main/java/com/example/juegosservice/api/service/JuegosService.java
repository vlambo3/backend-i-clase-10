package com.example.juegosservice.api.service;

import com.example.juegosservice.domain.model.Juegos;
import com.example.juegosservice.domain.repository.JuegosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JuegosService {


	private final JuegosRepository repository;

	public List<Juegos> findByBiblioteca(String biblioteca) {
		return repository.findByBiblioteca(biblioteca);
	}

	public Juegos save(Juegos juegos) {
		return repository.save(juegos);
	}
}
