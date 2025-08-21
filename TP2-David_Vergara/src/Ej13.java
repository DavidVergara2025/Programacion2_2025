/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ej13 {
    public static void ej13() {
        /*Impresión recursiva de arrays antes y después de modificar un elemento. 
        Crea un programa que: 
        a.	Declare e inicialice un array con los precios de algunos productos. 
        b.	Use una función recursiva para mostrar los precios originales. 
        c.	Modifique el precio de un producto específico. 
        d.	Use otra función recursiva para mostrar los valores modificados. 
        Salida esperada: 
        Precios originales: 
        Precio: $199.99 
        Precio: $299.5 
        Precio: $149.75 
        Precio: $399.0 
        Precio: $89.99 
        Precios modificados: 
        Precio: $199.99 
        Precio: $299.5 
        Precio: $129.99 
        Precio: $399.0 
        Precio: $89.99 
        
        */
        System.out.println("\nEjercicio 13: Impresion recursiva de arrays antes y despues de modificar un elemento");
        double[] precios = {250.45, 635.28, 790.99, 120.00, 450.75};
        System.out.println("Precios originales:");
        imprimirPreciosRecursivo(precios, 0);
        //Modificacion por el usuario
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el producto a modificar (1-5). Ingrese 0 para terminar: ");
        int indice = Integer.parseInt(input.nextLine());
        while (indice != 0) {
            System.out.print("Ingrese el nuevo precio para el producto " + indice + ": $");
            double nuevoPrecio = Double.parseDouble(input.nextLine());
            precios[indice - 1] = nuevoPrecio; 
            System.out.print("Ingrese el siguiente producto a modificar (1-5). Ingrese 0 para terminar: ");
            indice = Integer.parseInt(input.nextLine());            
        }
        System.out.println("Precios modificados:");
        imprimirPreciosRecursivo(precios, 0);
    }
    public static void imprimirPreciosRecursivo(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio " + (indice + 1) + ": $" + precios[indice]);
            imprimirPreciosRecursivo(precios, indice + 1);
        }
    }
    
}
