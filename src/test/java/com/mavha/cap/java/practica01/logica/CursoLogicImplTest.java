/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.cap.java.practica01.logica;

import com.mavha.cap.java.practica01.modelo.Alumno;
import com.mavha.cap.java.practica01.modelo.Curso;
import com.mavha.cap.java.practica01.modelo.Docente;
import java.util.LinkedHashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mdominguez
 */
public class CursoLogicImplTest {
    
    private Curso curso;
    private CursoLogic logica;
    
    @Before
    public void setUp() {
        curso = new Curso();
        curso.setAlumnosInscriptos(new LinkedHashSet<>());
        logica = new CursoLogicImpl();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of inscribirAlumno method, of class CursoLogicImpl.
     */
    @Test
    public void testInscribirAlumno() {
    }

    /**
     * Test of aprobarAlumno method, of class CursoLogicImpl.
     */
    @Test
    public void testAprobarAlumno() {
    
    }
    
    @Test
    public void testAsignarDocenteOk()throws PresupuestoNoSuficienteException  {       
            curso.setCosto(10.0);
            curso.setHorasCatedra(2);
            curso.getAlumnosInscriptos().add(new Alumno("Alumno1"));
            curso.getAlumnosInscriptos().add(new Alumno("Alumno2"));
            curso.getAlumnosInscriptos().add(new Alumno("Alumno3"));
            Docente d2 = new Docente();
            d2.setCostoHora(10.0);
            logica.asignarDocente(curso, d2);        
            assertNotNull(curso.getDocenteAsignado());
    }
    
        @Test(expected = PresupuestoNoSuficienteException.class)
        public void testAsignarDocenteFalla() throws PresupuestoNoSuficienteException {       
            curso.setCosto(10.0);
            curso.setHorasCatedra(2);
            curso.getAlumnosInscriptos().add(new Alumno("Alumno1"));
            curso.getAlumnosInscriptos().add(new Alumno("Alumno2"));
            curso.getAlumnosInscriptos().add(new Alumno("Alumno3"));
            Docente d2 = new Docente();
            d2.setCostoHora(22.0);
            logica.asignarDocente(curso, d2);                    
        }



        
}
