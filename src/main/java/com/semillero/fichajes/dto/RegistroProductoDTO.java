package com.semillero.fichajes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistroProductoDTO {

    private String nombre;

    private BigDecimal precio;
}
