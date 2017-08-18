/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.cap.java.practica01.logica;

import com.mavha.cap.java.practica01.modelo.Alumno;
import com.mavha.cap.java.practica01.modelo.Curso;

/**
 *
 * @author mdominguez
 */
public interface CursoLogic {
    public void inscribirAlumno(Curso c,Alumno a);
    public void aprobarAlumno(Curso c, Alumno a);
}
