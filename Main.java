/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.calculadora;
import java.util.Scanner;
import java.io.*;
import java.util.InputMismatchException;
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

        double numero1 = obtenerNumero(scanner, "Ingrese el primer número: ");
        double numero2 = obtenerNumero(scanner, "Ingrese el segundo número: ");

        System.out.println("Seleccione la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int opcion = obtenerOpcion(scanner);

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

    private static double obtenerNumero(Scanner scanner, String mensaje) {
        double numero = 0;
        boolean entradaCorrecta = false;

        do {
            try {
                System.out.print(mensaje);
                numero = scanner.nextDouble();
                entradaCorrecta = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        } while (!entradaCorrecta);

        return numero;
    }

    private static int obtenerOpcion(Scanner scanner) {
        int opcion = 0;
        boolean entradaCorrecta = false;

        do {
            try {
                opcion = scanner.nextInt();
                entradaCorrecta = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número entero válido.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        } while (!entradaCorrecta);

        return opcion;
    }
    }
    
    

