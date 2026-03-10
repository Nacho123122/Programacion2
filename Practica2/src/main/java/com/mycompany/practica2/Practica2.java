/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica2;

/**
 *
 * @author win
 */
public class Practica2 {

    public static void main(String[] args) {
        System.out.println("Inciso 4");
        Bus b1=new Bus();
        b1.setNombre("876");
        b1.setCapacidad(14);
        b1.setNropas(5);
        System.out.println("Total cobrado "+b1.Cobrar());
        System.out.println("Disponible "+b1.Disponibles());
        System.out.println("");
        Servidor s = new Servidor();

        s.agregarJugador("Juan", 120);
        s.agregarJugador("Pedro", 64);
        s.agregarJugador("Ana", 200);

        s.mostrarStacks();
        s.jugadorConMasDiamantes();
        s.totalDiamantes();
    }
}
