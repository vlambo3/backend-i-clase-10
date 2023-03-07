package com.example.bibliotecaservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Juegos implements Serializable {

    private static final long serialVersionUID = 1L;

     private Long id;

    private String name;

    private String biblioteca;

    private String genero;

}
