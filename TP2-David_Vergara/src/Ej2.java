/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ej2 {
    public static void ej2(){
    /*2.	Determinar el Mayor de Tres Números. 
    Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor.  
    */
    System.out.println("\nEjercicio 2:");

    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese el primer numero entero: ");
    int num1 = Integer.parseInt(input.nextLine());
    System.out.print("Ingrese el segundo numero entero: ");
    int num2 = Integer.parseInt(input.nextLine());
    System.out.print("Ingrese el tercer numero entero: ");
    int num3 = Integer.parseInt(input.nextLine());
    //Se coloca como mayor al primero y se compara con los otros dos
    int mayor = num1;
    if (num2 > mayor) {mayor = num2;}
    if (num3 > mayor) {mayor = num3;}  
    System.out.println("El numero mayor es: " + mayor);
    System.out.println("Fin del ejercicio 2. Presione Enter para continuar...");
    input.nextLine();
    }
}
