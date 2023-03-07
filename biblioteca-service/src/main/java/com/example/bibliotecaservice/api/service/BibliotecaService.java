package com.example.bibliotecaservice.api.service;

import com.example.bibliotecaservice.domain.model.Juegos;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@Service
public class BibliotecaService implements IBibliotecaService {

    @Autowired
    private RestTemplate clienteRest;

    @Override
    public List<Juegos> getJuegoByBiblioteca(String biblioteca) {
        var url = String.format("http://localhost:8001/juegos/%s", biblioteca);

        var response = clienteRest.exchange(url, HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Juegos>>() {
                });

        return Objects.requireNonNull(response.getBody());
    }
}
