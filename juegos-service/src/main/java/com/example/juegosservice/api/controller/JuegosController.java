package com.example.juegosservice.api.controller;

import com.example.juegosservice.api.service.JuegosService;
import com.example.juegosservice.domain.model.Juegos;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/juegos")
@RequiredArgsConstructor
public class JuegosController {

    private final JuegosService service;

    @GetMapping("/{biblioteca}")
    ResponseEntity<List<Juegos>> getJuegosByBiblioteca(@PathVariable String biblioteca) {
        return ResponseEntity.ok().body(service.findByBiblioteca(biblioteca));
    }

    @PostMapping("/salvar")
    ResponseEntity<Juegos> saveJuego(@RequestBody Juegos juegos) {
        return ResponseEntity.ok().body(service.save(juegos));
    }
}
