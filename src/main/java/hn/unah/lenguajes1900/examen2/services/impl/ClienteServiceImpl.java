package hn.unah.lenguajes1900.examen2.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.examen2.entities.Cliente;
import hn.unah.lenguajes1900.examen2.repositories.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public String crearCliente(Cliente cliente) {
    Cliente cliente2 = this.clienteRepository.save(cliente);
    if(null!=cliente2.getDni()){
        if((this.clienteRepository.findByDni(cliente2.getDni())) != null) {
            return "Cliente ya existe.";    
        }
        this.clienteRepository.save(cliente2);
        return "Cliente fue creado.";
    }
    return null;
    
    }
    
}

