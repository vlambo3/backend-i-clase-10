package com.example.juegosservice.domain.data;

import com.example.juegosservice.domain.model.Juegos;
import com.example.juegosservice.domain.repository.JuegosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private JuegosRepository juegosRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        juegosRepository.save(new Juegos(1L, "God of war", "BibliotecaUno", "Acción"));
        juegosRepository.save(new Juegos(2L, "Minecraft", "BibliotecaUno", "Sandbox"));
        juegosRepository.save(new Juegos(3L, "Tomb Raider", "BibliotecaDos", "Acción"));
        juegosRepository.save(new Juegos(4L, "Lara Croft", "BibliotecaDos", "Acción"));
        juegosRepository.save(new Juegos(5L, "Fallout", "BibliotecaDos", "Acción"));
        juegosRepository.save(new Juegos(6L, "Monopoly", "BibliotecaUno", "Sandbox"));
    }

}
