/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicaux1;

/**
 *
 * @author win
 */
public class Practicaux1 {

    public static void main(String[] args) {
        Anime a1=new Anime("jujutsu kaisen","accion",24);
        Anime a2=new Anime("one piece","pirata xd",50000);
        System.out.println(a1);
        
        Televisor t1=new Televisor("Samsung",24,"oled");
        Televisor t2=new Televisor("LG",48,"plasma");
        System.out.println(t1.toString());
        Televisor t3=new Televisor();
        
        
        Instrumento i1=new Instrumento("Guitarra","madera","cuerda");
        Instrumento i2=new Instrumento("tambor","madera","percusion");
        System.out.println(i1.toString());
    }
}
