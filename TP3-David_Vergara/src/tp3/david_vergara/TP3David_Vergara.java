/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3.david_vergara;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class TP3David_Vergara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n============ Trabajo practico 3 - Programacion orientada a objetos ============");
        System.out.println("Elija una opcion:");
        System.out.println("1. Ejecutar todos los ejercicios secuencialmente");
        System.out.println("2. Elegir un ejercicio para ejecutar");
        System.out.print("Ingrese su opcion (1 o 2): ");
        int opcion = Integer.parseInt(input.nextLine());
        //Validacion de datos
        while (opcion != 1 && opcion != 2) {
            System.out.println("Opcion invalida. Por favor, ingrese 1 o 2.");
            System.out.print("Ingrese su opcion (1 o 2): ");
            opcion = Integer.parseInt(input.nextLine());
        }
        switch (opcion) {
            case 1:
                Ejercicio1.ej1();
                Ejercicio2.ej2();  
                Ejercicio3.ej3();
                Ejercicio4.ej4();
                Ejercicio5.ej5();              
                break;
            case 2:
              //Opcion para elegir ejercicio. Al finalizar un ejercicio, pregunta si ejecutar otro
                do {
                    System.out.print("\nIngrese el numero del ejercicio (1-5): ");
                    int numeroEjercicio = Integer.parseInt(input.nextLine());
                    switch (numeroEjercicio) {
                        case 1:
                            Ejercicio1.ej1();
                            break;
                        case 2:
                            Ejercicio2.ej2();
                            break;
                        case 3:
                            Ejercicio3.ej3();
                            break;
                        case 4:
                            Ejercicio4.ej4();
                            break;
                        case 5:
                            Ejercicio5.ej5();
                            break;                     
                        default:
                            System.out.println("Numero de ejercicio invalido. Por favor, ingrese un numero entre 1 y 5.");
                            break;
                    }
                    System.out.print("\nDesea ejecutar otro ejercicio? (s/n): ");
                } while (input.nextLine().equalsIgnoreCase("s"));
                System.out.println("\nFin de los ejercicios.");
                break;
            default:
                break;
            
        }
        
    }
}