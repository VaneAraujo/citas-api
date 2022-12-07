package com.example.citasapi.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.citasapi.models.PersonaModelo;
import com.example.citasapi.repository.PersonaRepository;

@Service
public class PersonaService {
    @Autowired
    PersonaRepository repositorio;

    public PersonaModelo guardarPersona(PersonaModelo persona){
        return repositorio.save(persona);
    }

    public ArrayList<PersonaModelo> consultarPersonas(){
        return (ArrayList<PersonaModelo>) repositorio.findAll();
    }

    public Optional<PersonaModelo> consultaPorId(Long id){
        return repositorio.findById(id);
    }

    public boolean eliminarPersona(Long id){
        if(repositorio.existsById(id)){
            repositorio.deleteById(id);
            return true;
        }
        else{
            return false;
        }
    }

    public ArrayList<PersonaModelo> buscarPorNombres(String nombres){
        return repositorio.findByNombres(nombres);
    }

}
