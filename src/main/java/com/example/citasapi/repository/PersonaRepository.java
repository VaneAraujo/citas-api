package com.example.citasapi.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;
import com.example.citasapi.models.PersonaModelo;

@Repository
public interface PersonaRepository extends CrudRepository<PersonaRepository, Long> {
    ArrayList<PersonaModelo> findByNombres(String nombres);
    
}
