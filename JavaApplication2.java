/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author katy1
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//System.out.println("Hola Mundo");
    persona per = new persona("Bryan",25);
    per.correr();
    perro perro1 = new perro("luna","cocker","mediano",15.6f,2);
    perro1.ladrar();
    gato gato1=new gato("geto","inglesa","grande",8.9f,10);
    gato1.ronronear();
    vehiculos moto = new vehiculos("logan",2018);
    moto.correr(60);
        // TODO code application logic here
    }
    
}
