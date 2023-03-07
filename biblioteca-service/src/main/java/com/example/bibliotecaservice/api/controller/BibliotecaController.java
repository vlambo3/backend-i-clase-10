package com.example.bibliotecaservice.api.controller;

import com.example.bibliotecaservice.api.service.BibliotecaService;
import com.example.bibliotecaservice.domain.model.Juegos;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BibliotecaController {

    private final BibliotecaService serviceClient;

    @GetMapping("/{biblioteca}")
    ResponseEntity<List<Juegos>> getBiblioteca(@PathVariable String biblioteca) {
        return ResponseEntity.ok().body(serviceClient.getJuegoByBiblioteca(biblioteca));
    }

}
