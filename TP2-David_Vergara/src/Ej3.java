/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ej3 {
    public static void ej3(){
        /*Clasificación de Edad. 
        Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según la siguiente tabla: 
        Menor de 12 años: "Niño" 
        Entre 12 y 17 años: "Adolescente" 
        Entre 18 y 59 años: "Adulto" 
        60 años o más: "Adulto mayor"*/

        System.out.println("\nEjercicio 3:");
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine());
        String clasificacion;
        if (edad < 12) {
            clasificacion = "Niño";
        } else if (edad >= 12 && edad <= 17) {
            clasificacion = "Adolescente";
        } else if (edad >= 18 && edad <= 59) {
            clasificacion = "Adulto";
        } else {
            clasificacion = "Adulto mayor";
        }
        System.out.println("Usted es un " + clasificacion);
        System.out.println("Fin del ejercicio 3. Presione Enter para continuar...");
        input.nextLine();

    }
    

}
