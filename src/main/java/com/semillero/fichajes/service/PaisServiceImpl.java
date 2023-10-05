package com.semillero.fichajes.service;

import com.semillero.fichajes.dto.RegistroPaisDTO;
import com.semillero.fichajes.entity.Pais;
import com.semillero.fichajes.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PaisServiceImpl implements PaisService{

    @Autowired
    private PaisRepository paisRep;

    @Override
    public ResponseEntity<Pais> insertar(RegistroPaisDTO datos) {
        Pais paisNew=new Pais(datos.nombre(), datos.sigla());
        paisRep.save(paisNew);
        return ResponseEntity.ok(paisNew);
    }
}
