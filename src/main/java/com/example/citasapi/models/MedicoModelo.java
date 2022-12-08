package com.example.citasapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="medico")
public class MedicoModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true,nullable = false)
    private int medico_id;
    private String licencia;
    private String especialidad;
    private String tarjeta_prof;
    private String inicio_horario_laboral;
    private String fin_horario_laboral;
    @Column(name="cedula_id", insertable=false, updatable=false)
    private Long cedulaId;

    @ManyToOne
    @JoinColumn(name= "cedula_id")
    private PersonaModelo persona;

    public MedicoModelo() {
        super();
    }

    
    public MedicoModelo(int medico_id, String licencia, String especialidad, String tarjeta_prof,
            String inicio_horario_laboral, String fin_horario_laboral) {
        super();
        this.medico_id = medico_id;
        this.licencia = licencia;
        this.especialidad = especialidad;
        this.tarjeta_prof = tarjeta_prof;
        this.inicio_horario_laboral = inicio_horario_laboral;
        this.fin_horario_laboral = fin_horario_laboral;
    }


    public int getMedico_id() {
        return medico_id;
    }
    public void setMedico_id(int medico_id) {
        this.medico_id = medico_id;
    }
    public String getLicencia() {
        return licencia;
    }
    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String getTarjeta_prof() {
        return tarjeta_prof;
    }
    public void setTarjeta_prof(String tarjeta_prof) {
        this.tarjeta_prof = tarjeta_prof;
    }
    public String getInicio_horario_laboral() {
        return inicio_horario_laboral;
    }
    public void setInicio_horario_laboral(String inicio_horario_laboral) {
        this.inicio_horario_laboral = inicio_horario_laboral;
    }
    public String getFin_horario_laboral() {
        return fin_horario_laboral;
    }
    public void setFin_horario_laboral(String fin_horario_laboral) {
        this.fin_horario_laboral = fin_horario_laboral;
    }
    public PersonaModelo getPersona () {
        return persona ;
    }
    public void setPersona (PersonaModelo persona ) {
        this.persona  = persona ;
    }
}
