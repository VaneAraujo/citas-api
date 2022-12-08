package com.example.citasapi.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;
import com.example.citasapi.models.PersonaModelo;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaModelo, Long> {
    ArrayList<PersonaModelo> findByNombres(String nombres);
    
}
