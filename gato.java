/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author katy1
 */
public class gato {
    String nombre;// atributo
    String raza;
    String tamano;
    float peso;
    int edad; //atributos
    
    public gato(String nombre,String raza,String tamano,float peso,int edad){
    this.nombre=nombre;
    this.raza=raza;
    this.tamano=tamano;
    this.peso=peso;
    this.edad=edad;
}
    public void ronronear(){

    System.out.println(this.nombre+ "Empezo a ronronear");
}
}