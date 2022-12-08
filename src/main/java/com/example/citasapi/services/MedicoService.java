package com.example.citasapi.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.citasapi.models.MedicoModelo;
import com.example.citasapi.repository.MedicoRepository;
import com.example.citasapi.repository.PersonaRepository;

@Service
public class MedicoService {
    @Autowired
    MedicoRepository repositorio;
    @Autowired
    PersonaRepository repositorioPersona;

    public MedicoModelo guardarMedico(MedicoModelo medico){
        repositorioPersona.save(medico.getPersona());
        return repositorio.save(medico);
    }

    public ArrayList<MedicoModelo> consultarMedicos(){
        return(ArrayList<MedicoModelo>) repositorio.findAll();
    }

    public boolean eliminarMedico(Long id){
        if(repositorio.existsById(id)){
            repositorio.deleteById(id);
            return true;
        }
        else{
            return false;
        }
    }
}
