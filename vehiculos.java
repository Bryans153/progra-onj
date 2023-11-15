/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author katy1
 */
public class vehiculos {
    String modelo;// atributo
    int ano;
    
    public vehiculos(String modelo,int ano){
    this.modelo=modelo;
    this.ano=ano;
            }
public void correr(int velocidad){
    
    int velociadad=velocidad;
    if(velocidad>50){
        System.out.println(this.modelo+" "+this.ano+" multado");
    }
    }
   }