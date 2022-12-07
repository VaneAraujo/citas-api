package com.example.citasapi.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        if(repositorio.existById(id)){
            repositorio.deleteById(id)
            return true;
        }
        else{
            return false;
        }
    }
}
