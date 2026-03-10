/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

/**
 *
 * @author win
 */
public class Servidor {
    private jugador[] jugadores;
    private int cantidad;

    public Servidor() {
        jugadores = new jugador[10];
        cantidad = 0;
    }
    
    public void agregarJugador(String nombre, int diamantes) {
        if (cantidad < 10) {
            jugadores[cantidad] = new jugador(nombre, diamantes);
            cantidad++;
        } else {
            System.out.println("Servidor lleno");
        }
    }

    public void mostrarStacks() {
        for (int i = 0; i < cantidad; i++) {
            int stacks = jugadores[i].getNrodiamantes() / 64;
            System.out.println(jugadores[i].getNombre() +
                    " tiene " + stacks + " stack(s) de diamantes");
        }
    }

    public void jugadorConMasDiamantes() {
        int max = 0;
        String nombre = "";

        for (int i = 0; i < cantidad; i++) {
            if (jugadores[i].getNrodiamantes() > max) {
                max = jugadores[i].getNrodiamantes();
                nombre = jugadores[i].getNombre();
            }
        }

        System.out.println("Jugador con más diamantes: " + nombre);
    }

    public void totalDiamantes() {
        int total = 0;

        for (int i = 0; i < cantidad; i++) {
            total += jugadores[i].getNrodiamantes();
        }

        System.out.println("Total de diamantes en el servidor: " + total);
    }
 
}
