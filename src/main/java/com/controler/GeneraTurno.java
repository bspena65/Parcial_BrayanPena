/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controler;

import com.model.Turno;
import com.model.Usuario;

/**
 *
 * @author bpenc
 */
public class GeneraTurno {
    
    /** * recibe un objeto usuario y crea un objeto turno de acuerdo con el tipo de usuario 
     * (UsuarioPOS, UsuarioPlanComplementarios o UsuarioTraslados) 
     * utilizando un patrón factory.Devuelve el objeto turno creado.
     * @param usuario
     * @return **/

    public static Turno crearTurno(Usuario usuario) {
        String tipo_usuario = usuario.getClass().getSimpleName();
        switch (tipo_usuario) {
            case "UsuarioPOS":
                return new Turno("P001", 10);
            case "UsuarioPlanComplementarios":
                return new Turno("C001", 15);
            case "UsuarioTraslados":
                return new Turno("T001", 20);
            default:
                return null;
        }
    }

    //Constructor
    private GeneraTurno() {
    }

}
