package com.example.citasapi.models;

public class PersonaModelo {
    
    private Long cedula_id;
    private String nombres;
    private String apellidos;
    private String correo;
    private int numero_contacto;
    
    public PersonaModelo(){
    }

    public PersonaModelo(Long cedula_id, String nombres, String apellidos, String correo, int numero_contacto) {
        this.cedula_id = cedula_id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.numero_contacto = numero_contacto;
    }

    public Long getCedula_id() {
        return cedula_id;
    }

    public void setCedula_id(Long cedula_id) {
        this.cedula_id = cedula_id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumero_contacto() {
        return numero_contacto;
    }

    public void setNumero_contacto(int numero_contacto) {
        this.numero_contacto = numero_contacto;
    }
    


}
