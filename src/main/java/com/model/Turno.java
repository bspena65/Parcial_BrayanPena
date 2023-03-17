/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author bpenc
 */
public class Turno {
    //Atributos
    private String numero;
    private int tiempo_estimado;
    
    
    //Constructor
    public Turno(String numero, int tiempo_estimado) {
        this.numero = numero;
        this.tiempo_estimado = tiempo_estimado;
    }
    
    //Métodos
    public String getNumero() {
        return numero;
    }
    
    public int getTiempoEstimado() {
        return tiempo_estimado;
    }

    
}
