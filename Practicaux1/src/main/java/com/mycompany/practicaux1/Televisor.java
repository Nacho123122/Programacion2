/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaux1;

/**
 *
 * @author win
 */
public class Televisor {
    private String marca,tipo;
    private int resolucion;
    Televisor(String a,int b,String c){
        marca=a;
        resolucion=b;
        tipo=c;
    }
    Televisor(){
        
    }
    @Override
    public String toString(){
        return "MARCA "+marca+" RESOLUCION  "+resolucion+" TIPO "+tipo;
    }
}
