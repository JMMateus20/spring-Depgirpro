package com.semillero.fichajes.service;

import com.semillero.fichajes.dto.ProductoResponseDTO;
import com.semillero.fichajes.dto.RegistroProductoDTO;
import com.semillero.fichajes.entity.Producto;
import com.semillero.fichajes.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepository productoRep;

    @Override
    public ResponseEntity<ProductoResponseDTO> insertar(RegistroProductoDTO datos) {
        Producto productoNew=new Producto(datos.getNombre(), datos.getPrecio());
        productoRep.save(productoNew);
        ProductoResponseDTO response=new ProductoResponseDTO(productoNew.getId(), productoNew.getNombre(), productoNew.getPrecio());
        return ResponseEntity.ok(response);
    }
}
