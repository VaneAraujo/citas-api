package com.example.citasapi.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.citasapi.services.MedicoService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/medico")

public class MedicoController {
    @Autowired
    MedicoService servicio;

    @GetMapping("/vertodos")
    public ArrayList<MedicoModelo> consultarMedicos(){
        return servicio.consultarMedicos();
    }

    @PostMapping("/guadar")
    public MedicoModelo guardarMedico(@RequestBody MedicoModelo medico){
        return servicio.guardarMedico(medico);
    }

    @DeleteMapping("{Id}")
    public void borrar(@PathVariable("Id") String Id){
        return servicio.eliminarMedico();
    }

}
