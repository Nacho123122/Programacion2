/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaux1;

/**
 *
 * @author win
 */
public class Instrumento {
    public String nombre;
    private String material,tipo;
    Instrumento(String a,String b, String c){
        nombre=a;
        material=b;
        tipo=c;
    }
    public String toString(){
        return "NOMBRE "+nombre+" MATERIAL "+material+" TIPO "+tipo;
    }

    

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
