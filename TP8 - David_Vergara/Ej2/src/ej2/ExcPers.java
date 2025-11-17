/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class ExcPers {
    /*Crear EdadInvalidaException. Lanzarla si la edad es menor a 0 o mayor a 120. Capturarla y mostrar mensaje. */
    public static void main(String[] args) {
        solicitarEdad();

    }
    public static void solicitarEdad() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        
        try {
            int edad = sc.nextInt();
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad inválida: " + edad);
            }
            System.out.println("Edad ingresada: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada no es un número válido.");
        }
        Principal.enterParaContinuar();
    }
}
