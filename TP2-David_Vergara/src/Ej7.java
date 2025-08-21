/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ej7 {
    public static void ej7() {
        /*Validación de Nota entre 0 y 10 (do-while). 
        Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota hasta que ingrese un valor válido. 
        */
        System.out.println("\nEjercicio 7: Validacion de nota entre 0 y 10");
        Scanner input = new Scanner(System.in);
        int nota;
        do {
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = Integer.parseInt(input.nextLine());
            if (nota < 0 || nota > 10) {
                System.out.println("Nota invalida. Por favor, ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente: " + nota);
    }
}
