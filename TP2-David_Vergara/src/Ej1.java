import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
public class Ej1 {
    public static void ej1(){
        /*Verificación de Año Bisiesto. 
        Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto. Un año es bisiesto si es divisible por 4, 
        pero no por 100, salvo que sea divisible por 400*/
        System.out.println("\nEjercicio 1:");

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un año para verificar si es bisiesto: ");
        int anio = Integer.parseInt(input.nextLine());
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
        System.out.println("Fin del ejercicio 1. Presione Enter para continuar...");
        input.nextLine();

    }
    
}
