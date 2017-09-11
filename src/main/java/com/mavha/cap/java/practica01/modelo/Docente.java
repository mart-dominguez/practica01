/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package com.mavha.cap.java.practica01.modelo;

import java.util.Set;

/**
 *
 * @author mdominguez
 */
public class Docente {
    
    private static Integer _GENERADOR_ID_DOCENTE=0;
    private String nombre;
    private Integer id;
    private Double costoHora;
    private Set<Curso> cursosDictados;
    
    public static Integer getGENERADOR_ID_DOCENTE() {
        return _GENERADOR_ID_DOCENTE;
    }

    public static void setGENERADOR_ID_DOCENTE(Integer _GENERADOR_ID_DOCENTE) {
        Docente._GENERADOR_ID_DOCENTE = _GENERADOR_ID_DOCENTE;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getCostoHora() {
        return costoHora;
    }

    public void setCostoHora(Double costoHora) {
        this.costoHora = costoHora;
    }
    
    
    
    
    public Set<Curso> getCursosDictados() {
        return cursosDictados;
    }

    public void setCursosDictados(Set<Curso> cursosDictados) {
        this.cursosDictados = cursosDictados;
    }        
    
}
