package hn.unah.lenguajes1900.examen2.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import hn.unah.lenguajes1900.examen2.entities.Direccion;
import hn.unah.lenguajes1900.examen2.repositories.DireccionRepository;
import hn.unah.lenguajes1900.examen2.services.DireccionService;

public class DireccionServiceImpl implements DireccionService {

    @Autowired
    private DireccionRepository direccionRepository;

    @Override
    public Direccion crearDireccion(Direccion direccion) {
        return this.direccionRepository.save(direccion);
    }
    
}
