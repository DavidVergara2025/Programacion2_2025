
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
public class Ejercicio5 {
    public static void ej5(){
        /*Ejercicio 5. Escribe un programa que solicite dos números enteros y realice las siguientes operaciones:
        a. Suma
        b. Resta
        c. Multiplicación
        d. División
        Muestra los resultados en la consola.*/
        System.out.println("\nEjercicio 5:");
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer numero entero: ");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = Integer.parseInt(input.nextLine());
        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);
        System.out.println("Suma: " + (num1 + num2) + 
                "\nResta: " + (num1 - num2) + 
                "\nMultiplicacion: " + (num1 * num2) + 
                "\nDivision: " + ((double)num1 / num2));
    }
}
