package hn.unah.lenguajes1900.examen2.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.examen2.entities.Cliente;
import java.util.List;


@Repository
public interface ClienteRepository extends CrudRepository<Cliente, String> {
    
    public List<Cliente> findByDni(String dni);;
}
