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
public class AlumnoLogicImpl implements AlumnoLogic{
    
    
    @Override
    public Double costoPromedio (Alumno a){
        Double gasto = 0.0;
        for(Curso unCurso : a.getCursosInscripto()){
            gasto += unCurso.getCosto();
        }
        for(Curso unCurso : a.getCursosTerminados()){
            gasto += unCurso.getCosto();
        }
        Integer cantidadCursos = a.getCursosTerminados().size()+a.getCursosInscripto().size();                
        return gasto/cantidadCursos;
    }

    @Override
    public void aprobar(Alumno a,Curso c) {
            boolean cursoEncontrado = a.getCursosInscripto().remove(c);
            if(cursoEncontrado){
                a.getCursosTerminados().add(c);
                a.setCreditos(a.getCreditos()+c.getCreditosOtorgados());
            }
    }
    
}
