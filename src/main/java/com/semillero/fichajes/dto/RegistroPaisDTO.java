package com.semillero.fichajes.dto;

import jakarta.validation.constraints.NotBlank;

public record RegistroPaisDTO(@NotBlank String nombre, @NotBlank String sigla) {
}
