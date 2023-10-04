package com.semillero.fichajes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoResponseDTO {
    private Long id;
    private String nombre;
    private BigDecimal precio;                  //ALT+INSERT=GENERAR CODIGO AUTOMATICAMENTE

}
