
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author david
 */
public class Ejercicio4 {
    public static void ej4(){
        /*Ejercicio 4. Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego 
        los muestre en pantalla. Usa Scanner para capturar los datos.  */
        System.out.println("\nEjercicio 4:");

        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombreUsuario = input.nextLine();        
        System.out.print("Ingrese su edad: ");
        int edadUsuario = Integer.parseInt(input.nextLine());
        System.out.println("Nombre: " + nombreUsuario);
        System.out.println("Edad: " + edadUsuario);
    }
}
