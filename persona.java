/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author katy1
 */
public class persona {//nombre de la calse 
    String nombre;// atributo
    int edad; //atributos
    
    public persona(String nombre,int edad){
    this.nombre=nombre;
    this.edad=edad;
            }
public void correr(){
  //  int velocidad;
    System.out.println(this.nombre+ " empezo a correr");
}
}
