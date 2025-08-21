/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ej5 {
    public static void ej5() {
        /*Suma de Números Pares (while).  
        Escribe un programa que solicite números al usuario y sume solo los números pares. El ciclo debe continuar hasta que el usuario ingrese el número 0, momento en el que se debe mostrar la suma total de los pares ingresados. 
         */
        System.out.println("\nEjercicio 5: Suma de pares ");
        Scanner input = new Scanner(System.in);
        int numero;
        int sumaDePares = 0;
        System.out.print("Ingrese un numero (0 para terminar): ");
        numero = Integer.parseInt(input.nextLine());
        while (numero != 0) {
            if (numero % 2 == 0) {sumaDePares += numero;}
            System.out.print("Ingrese otro numero (0 para terminar): ");
            numero = Integer.parseInt(input.nextLine());
        }
        System.out.println("La suma de los numeros pares ingresados es: " + sumaDePares);
        System.out.println("Fin del ejercicio 5. Presione Enter para continuar...");
        input.nextLine();
    }
    
}
