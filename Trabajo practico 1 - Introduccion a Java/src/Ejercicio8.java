
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
public class Ejercicio8 {
    public static void ej8(){
        /*Ejercicio 8:  Maneja converesiones de tipo y division en Java.
        a. Escribe un programa que divida dos numeros enteros ingresados por el usuario.
        b. Modifica el codigo para usar double en lugar de int y compara los resultados.
        */
        Scanner input = new Scanner(System.in);
        System.out.println("\nEjercicio 8: \nIngrese el primer numero entero: ");
        int numero1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el segundo numero entero: ");
        int numero2 = Integer.parseInt(input.nextLine());
        System.out.println("Utilizando int: \n" + numero1 + " / " + numero2 + " = " + (numero1/numero2));
        
        double valor1 = numero1;
        double valor2 = numero2;
        System.out.println("Utilizando Double: \n" + valor1 + " / " + valor2 + " = " + (valor1/valor2));
    }
}
