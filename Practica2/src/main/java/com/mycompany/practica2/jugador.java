/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

/**
 *
 * @author win
 */
public class jugador {
    private String nombre;
    private int nrodiamantes;
    jugador(String a,int b){
        nombre=a;
        nrodiamantes=b;
    }

    public int getNrodiamantes() {
        return nrodiamantes;
    }

    public void setNrodiamantes(int nrodiamantes) {
        this.nrodiamantes = nrodiamantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
