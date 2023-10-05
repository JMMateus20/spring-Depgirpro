package com.semillero.fichajes.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name="paises")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String sigla;

    public Pais(String nombre, String sigla) {
        this.nombre = nombre;
        this.sigla = sigla;
    }


}
