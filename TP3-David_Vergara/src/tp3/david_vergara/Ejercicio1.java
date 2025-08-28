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
public class Ejercicio1 {
    public static void ej1() {
        System.out.println("\n================ Ejercicio 1 - Registro de Estudiantes ================");
        /*Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir calificaciones.*/
        Estudiante estudiante1 = new Estudiante();
        estudiante1.mostrarInfo();
        System.out.println("Desea subir la calificacion? (s/n): ");
        Scanner input = new Scanner(System.in);
        String respuesta = input.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Ingrese los puntos a sumar: ");
            double puntos = Double.parseDouble(input.nextLine());
            estudiante1.subirCalificacion(puntos);
            System.out.println("Informacion actualizada: ");
            estudiante1.mostrarInfo();
        }
        System.out.println("Desea bajar la calificacion? (s/n): ");
        respuesta = input.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Ingrese los puntos a restar: ");
            double puntos = Double.parseDouble(input.nextLine());
            estudiante1.bajarCalificacion(puntos);
            System.out.println("Informacion actualizada: ");
            estudiante1.mostrarInfo();
        }
    }
    
}
