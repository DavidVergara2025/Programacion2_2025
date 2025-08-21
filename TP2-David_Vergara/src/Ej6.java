/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ej6 {
    public static void ej6() {
        /*Contador de Positivos, Negativos y Ceros (for).  
        Escribe un programa que pida al usuario ingresar 10 números enteros y cuente cuántos son positivos, negativos y cuántos son ceros. 
         */
        System.out.println("\nEjercicio 6: Contador de positivos, negativos y ceros");
        Scanner input = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el " + (i+1) + "° numero entero: ");
            int numero = Integer.parseInt(input.nextLine());
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        System.out.println("Fin del ejercicio 6. Presione Enter para continuar...");
        input.nextLine();
    }  
}