/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author bpenc
 */
public class Usuario {

    //Atributos
    private String numero_documento;

    //Constructor -- recibe el número de documento del usuario y lo asigna al atributo numero_documento.
    public Usuario(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    //Métodos -- devuelve el número de documento del usuario.
    public String getNumeroDocumento() {
        return numero_documento;
    }

}
