/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaux1;

/**
 *
 * @author win
 */
public class Anime {
    public String nombre,genero;
    private int nroEpisodios;
    private String[] episodios;
    
    Anime(String a,String b,int c){
        nombre=a;
        genero=b;
        nroEpisodios=c;
        episodios=new String[nroEpisodios];
    }
    
}
