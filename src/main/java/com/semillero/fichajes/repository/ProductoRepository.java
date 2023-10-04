package com.semillero.fichajes.repository;

import com.semillero.fichajes.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {


}
