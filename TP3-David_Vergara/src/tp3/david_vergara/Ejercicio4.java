/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.david_vergara;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio4 {
    public static void ej4(){
        System.out.println("\n================= Ejercicio 4 - Gestion de gallinas en granja digital ================");
        /*Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos.
        Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
        Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado. */
        Gallina gallina1 = new Gallina();
        gallina1.setIdGallina();
        gallina1.mostrarEstado();
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nSeleccione una accion para la gallina " + gallina1.getIdGallina() + ":");
            System.out.println("1. Poner huevo");
            System.out.println("2. Envejecer");
            System.out.println("3. Salir");
            Scanner input = new Scanner(System.in);
            int opcion = Integer.parseInt(input.nextLine());
            switch (opcion) {
                case 1:
                    gallina1.ponerHuevo();
                    break;
                case 2:
                    gallina1.envejecer();
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion invalida. Intente de nuevo.");
            }
            System.out.println("\n===== Estado actual de la gallina:  =====");
            gallina1.mostrarEstado();
            
        }
    }
    
}
