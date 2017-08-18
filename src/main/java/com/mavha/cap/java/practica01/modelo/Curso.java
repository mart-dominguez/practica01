/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.cap.java.practica01.modelo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author mdominguez
 */
public class Curso {
    private static Integer _GENERADOR_ID_CURSO=0;
    private Integer id;
    private String nombre;   
    private Integer creditosOtorgados;
    private Integer cupo;
    private Set<Alumno> alumnosInscriptos;
    private Double costo;
    private boolean cerrado;
    //

    public Curso() {
        this.id = ++Curso._GENERADOR_ID_CURSO;                
        this.alumnosInscriptos=new HashSet<>();
        this.cupo=5;
    }

    public Curso(String nombre, Integer creditosOtorgados,Double costo) {
        this();
        this.nombre = nombre;
        this.creditosOtorgados = creditosOtorgados;
        this.costo = costo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCreditosOtorgados() {
        return creditosOtorgados;
    }

    public void setCreditosOtorgados(Integer creditosOtorgados) {
        this.creditosOtorgados = creditosOtorgados;
    }

    public Integer getCupo() {
        return cupo;
    }

    public void setCupo(Integer cupo) {
        this.cupo = cupo;
    }

    public Set<Alumno> getAlumnosInscriptos() {
        return alumnosInscriptos;
    }

    public void setAlumnosInscriptos(Set<Alumno> alumnosInscriptos) {
        this.alumnosInscriptos = alumnosInscriptos;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public boolean isCerrado() {
        return cerrado;
    }

    public void setCerrado(boolean cerrado) {
        this.cerrado = cerrado;
    }
    
    
    
    
}
