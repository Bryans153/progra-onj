/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.calculadora;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Seleccione la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int opcion = scanner.nextInt();
        double resultado = 0;

        if (opcion == 1) {
            resultado = Calculadora.sumar(numero1, numero2);
            System.out.println("La suma es: " + resultado);
        } else if (opcion == 2) {
            resultado = Calculadora.restar(numero1, numero2);
            System.out.println("La resta es: " + resultado);
        } else if (opcion == 3) {
            resultado = Calculadora.multiplicar(numero1, numero2);
            System.out.println("La multiplicación es: " + resultado);
        } else if (opcion == 4) {
            resultado = Calculadora.dividir(numero1, numero2);
            // Evitar mostrar el resultado si hubo un error de división por cero
            if (!Double.isNaN(resultado)) {
                System.out.println("La división es: " + resultado);
            }
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }
    }
    

