/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controler;

import com.model.*;

/**
 *
 * @author bpenc
 */
public class ControladorTurnos {
    
    private DatosTurnos base_de_datos;
    
    public ControladorTurnos() {
        this.base_de_datos = DatosTurnos.getInstancia();
    }
    
    
    /**ecibe un objeto usuario, utiliza la FabricaTurno para crear un objeto 
     *turno de acuerdo con el tipo de usuario y registra el turno en la Base de Datos Turnos (DatosTurnos)**/
    public void solicitarTurno(Usuario usuario) {
        Turno turno = GeneraTurno.crearTurno(usuario);
        base_de_datos.registrarTurno(turno);
    }
    
    
    /**recibe el número de turno y devuelve el tiempo estimado de atención utilizando 
     * la Base de Datos Turnos (DatosTurnos).**/
    public int consultarTurno(String numero) {
        int tiempo_estimado = 0;
        // código para consultar el tiempo estimado de atención en la base de datos
        return tiempo_estimado;
    }


}

