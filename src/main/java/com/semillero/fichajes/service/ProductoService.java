package com.semillero.fichajes.service;

import com.semillero.fichajes.dto.ProductoResponseDTO;
import com.semillero.fichajes.dto.RegistroProductoDTO;
import com.semillero.fichajes.entity.Producto;
import org.springframework.http.ResponseEntity;

public interface ProductoService {

    ResponseEntity<ProductoResponseDTO> insertar(RegistroProductoDTO datos);
}
