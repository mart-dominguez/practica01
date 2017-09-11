/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.cap.java.practica01.logica;

import com.mavha.cap.java.practica01.modelo.Alumno;
import com.mavha.cap.java.practica01.modelo.Curso;
import com.mavha.cap.java.practica01.modelo.Docente;

/**
 *
 * @author mdominguez
 */
public class CursoLogicImpl implements CursoLogic{
    
    private AlumnoLogic alumnoLogic;
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
                alumnoLogic.aprobar(a,c);
        }

        /**
         * Los cursos deben autofinanciarse por lo que se puede asignar un docente 
         * si la cantidad de alumnos inscriptos permiten pagar el salario del docente.
         * Sino no se hace nada (y el docente no se asigna )
         * 
         * @param c
         * @param d 
         */
    @Override
    public void asignarDocente(Curso c, Docente d) throws PresupuestoNoSuficienteException{
        Double ingresos = c.getAlumnosInscriptos().size()*c.getCosto();
        Double egresos = c.getHorasCatedra()*d.getCostoHora();
        if(ingresos>=egresos) c.setDocenteAsignado(d);
        else throw new PresupuestoNoSuficienteException(ingresos, egresos);
    }
        

    
}
