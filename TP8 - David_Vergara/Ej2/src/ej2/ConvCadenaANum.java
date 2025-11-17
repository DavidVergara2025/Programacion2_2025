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
public class ConvCadenaANum {
    /*2. Conversión de cadena a número
○ Leer texto del usuario e intentar convertirlo a int. Manejar NumberFormatException si no es válido. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        String input = sc.nextLine();
        try {
            int numero = Integer.parseInt(input);
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no es un número entero válido.");
        }
        Principal.enterParaContinuar();
        
    }
}
