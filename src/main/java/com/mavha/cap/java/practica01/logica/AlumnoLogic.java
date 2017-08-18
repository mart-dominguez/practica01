/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.cap.java.practica01.logica;

import com.mavha.cap.java.practica01.modelo.Alumno;

/**
 *
 * @author mdominguez
 */
public interface AlumnoLogic {
    /**
     * Calcula el costo promedio de inscripcion a un curso 
     * Primero suma todos los gastos en los cursos inscriptos.
     * Luego todos los gastos en los cursos aprobados
     * Finalmente lo divide por la cantidad de cursos y retorna el promedio.
     * @param a
     * @return 
     */
     public Double costoPromedio (Alumno a);
}
