package com.semillero.fichajes.controller;

import com.semillero.fichajes.dto.RegistroPaisDTO;
import com.semillero.fichajes.entity.Pais;
import com.semillero.fichajes.service.PaisService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaisController {

    @Autowired
    private PaisService paisService;


    @RequestMapping(value = "paises", method = RequestMethod.POST)
    public ResponseEntity<Pais> insertar(@Valid @RequestBody RegistroPaisDTO datos){
        return paisService.insertar(datos);
    }

}
