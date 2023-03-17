/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vista;

;
import java.util.Scanner;

/**
 *
 * @author bpenc
 */


public class VistaTurnos {

    private Scanner scanner;

    public VistaTurnos() {
        this.scanner = new Scanner(System.in);
    }

    //muestra el menú de opciones para los usuarios.
    public void mostrarMenu() {
        System.out.println("1. Solicitar turno");
        System.out.println("2. Consultar turno");
        System.out.println("3. Salir");
    }

    //solicita el número de documento del usuario.
    public String solicitarNumeroDocumento() {
        System.out.print("Ingrese su número de documento: ");
        return scanner.nextLine();
    }

    //muestra el número de turno y el tiempo estimado de atención.
    public void mostrarTurno(String numero, int tiempo_estimado) {
        System.out.println("Su número de turno es " + numero + ".");
        System.out.println("El tiempo estimado de atención es de " + tiempo_estimado + " minutos.");
    }

}
