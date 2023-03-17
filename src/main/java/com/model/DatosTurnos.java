/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

import java.util.List;

/**
 *
 * @author bpenc
 */
public class DatosTurnos {

    private static DatosTurnos instancia;
    private List<Turno> turnos;

    public DatosTurnos() {
    }

    public static DatosTurnos getInstancia() {
        if (instancia == null) {
            instancia = new DatosTurnos();
        }
        return instancia;
    }

    public void registrarTurno(Turno turno) {
        // código para registrar el turno en la base de datos
        this.turnos.add(turno);
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void guardarTurno(Turno turno) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Turno buscarTurno(String numeroTurno) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void actualizarTurno(Turno turno) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
