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
public class Ejercicio2 {
    public static void ej2(){
        System.out.println("\n ================ Ejercicio 2 - Registro de mascotas ================");
        
/*Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y verificar los cambios. */
        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Lobo";
        mascota1.especie = "Perro";
        mascota1.edad = 12;

        mascota1.mostrarInfo();
        System.out.println("Cumplio años la mascota? (s/n): "); 
        Scanner input = new Scanner(System.in);   
        String respuesta = input.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            mascota1.cumplirAnios();
            System.out.println("Informacion actualizada: ");
            mascota1.mostrarInfo();
        }
       
    }
    
}
