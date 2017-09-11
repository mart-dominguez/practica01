/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.cap.java.practica01.logica;

/**
 *
 * @author martdominguez
 */
public class PresupuestoNoSuficienteException extends Exception{
    PresupuestoNoSuficienteException(Double monto1,Double monto2){
        super("No se puede asignar el docente. Los ingresos por "+monto1+" son menores a los costos "+monto2);
    }
}
