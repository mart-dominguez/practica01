/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.cap.java.practica01.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author mdominguez
 */
public class Alumno {
    private static Integer _GENERADOR_ID_CURSO=1;
    private String nombre;
    private Integer id;
    private Integer creditos;
    private List<Curso> cursosTerminados;
    private List<Curso> cursosInscripto;
    

    public Alumno() {
        this.id= _GENERADOR_ID_CURSO++;
        this.creditos=0;
        this.cursosTerminados=new ArrayList<>();
        this.cursosInscripto=new ArrayList<>();        
    }

    public Alumno(String nombre) {
        this();
        this.nombre = nombre;
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

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public List<Curso> getCursosTerminados() {
        return cursosTerminados;
    }

    public void setCursosTerminados(List<Curso> cursosTerminados) {
        this.cursosTerminados = cursosTerminados;
    }

    public List<Curso> getCursosInscripto() {
        return cursosInscripto;
    }

    public void setCursosInscripto(List<Curso> cursosInscripto) {
        this.cursosInscripto = cursosInscripto;
    }

    
    
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", id=" + id + '}';
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}
