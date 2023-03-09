package com.example.bibliotecaservice.api.client;

import com.example.bibliotecaservice.domain.model.Juegos;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "juegos-service")
public interface IJuegosServiceClient {

    @GetMapping("/juegos/{biblioteca}")
    ResponseEntity<List<Juegos>> getJuegosByBiblioteca(@PathVariable String biblioteca);

}
