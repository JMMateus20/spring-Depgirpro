package com.semillero.fichajes.controller;

import com.semillero.fichajes.dto.ProductoResponseDTO;
import com.semillero.fichajes.dto.RegistroProductoDTO;
import com.semillero.fichajes.entity.Producto;
import com.semillero.fichajes.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {

    @Autowired
    private ProductoService productoService;


    @RequestMapping(value = "productos", method = RequestMethod.POST)
    public ResponseEntity<ProductoResponseDTO> insertar(@RequestBody RegistroProductoDTO datos){
        return productoService.insertar(datos);
    }

}
