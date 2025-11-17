/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class DivisionSegura {
    /*Solicitar dos números y dividirlos. Manejar ArithmeticException si el divisor es cero. */
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Ingrese dividendo: ");
        int a = sc.nextInt();
        System.out.print("Ingrese divisor: ");
        int b = sc.nextInt();
        try {
            int resultado = divide(a, b);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            if (b == 0) {
                System.out.println("Error: División por cero no permitida.");
            } else {
                System.out.println("Error aritmético inesperado");
            }
        Principal.enterParaContinuar();}
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
