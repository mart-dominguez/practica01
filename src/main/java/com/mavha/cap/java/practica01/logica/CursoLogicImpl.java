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
public class CursoLogicImpl implements CursoLogic{

    @Override
    public void inscribirAlumno(Curso c, Alumno a) {
        if(c.getAlumnosInscriptos().size()<c.getCupo()){
            c.getAlumnosInscriptos().add(a);
            a.getCursosInscripto().add(c);
        }else{
            System.out.println("No se puede inscribir");
        }
    }

    /**
     * Cuando un alumnno aprueba un curso, 
     * - se borra el curso de la lista de cursos inscriptso
     * - se agrega el curso a la lista de cursos aprobados
     * - se asignan al alumno los creditos que otorga el curso.
     * @param c
     * @param a 
     */
    @Override
    public void aprobarAlumno(Curso c, Alumno a) {
        boolean cursoEncontrado = a.getCursosInscripto().remove(c);
        if(cursoEncontrado){
            a.getCursosTerminados().add(c);
            a.setCreditos(a.getCreditos()+c.getCreditosOtorgados());
        }else{
            System.out.println("No se puede aprobar un curso en el que no fue inscripto");
        }
    }
        

    
}
