package com.semillero.fichajes.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
@Table(name="productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;

    @Column(name="NOMBRE")
    private String nombre;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(name="PRECIO")
    private BigDecimal precio;

    public Producto(String nombre, BigDecimal precio){
        this.nombre=nombre;
        this.precio=precio;
    }
}
