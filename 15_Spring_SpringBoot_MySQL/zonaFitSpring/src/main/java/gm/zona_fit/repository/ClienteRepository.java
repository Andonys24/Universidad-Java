package gm.zona_fit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gm.zona_fit.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
}
