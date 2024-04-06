package hn.unah.lenguajes1900.examen2.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.examen2.entities.Cliente;
import hn.unah.lenguajes1900.examen2.services.impl.ClienteServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("examen2")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;
    
    @PostMapping("/cliente/crear")
    public String crearCliente(@RequestBody Cliente cliente) {
        return this.clienteServiceImpl.crearCliente(cliente);
    }
    
}
