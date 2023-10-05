package com.semillero.fichajes.service;

import com.semillero.fichajes.dto.RegistroPaisDTO;
import com.semillero.fichajes.entity.Pais;
import org.springframework.http.ResponseEntity;

public interface PaisService {

    ResponseEntity<Pais> insertar(RegistroPaisDTO datos);
}
