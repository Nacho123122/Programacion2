/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

/**
 *
 * @author win
 */
public class Bus {
    private String nombre;
    private int nropas, capacidad;
    Bus(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNropas() {
        return nropas;
    }

    public void setNropas(int nropas) {
        this.nropas = nropas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    Bus(String a, int b ,int c){
        nombre=a;
        nropas=b;
        capacidad=c;
    }
    public double Cobrar(){
        double c=nropas*1.5;
        return c;
    }
    public int Disponibles(){
        int r=capacidad-nropas;
        return r;
    }
    
}
