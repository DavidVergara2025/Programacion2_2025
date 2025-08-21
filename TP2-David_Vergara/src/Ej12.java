/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ej12 {
    public static void ej12() {
        /*12.	Modificación de un array de precios y visualización de resultados.  
        Crea un programa que: 
        a.	Declare e inicialice un array con los precios de algunos productos. 
        b.	Muestre los valores originales de los precios. 
        c.	Modifique el precio de un producto específico. 
        d.	Muestre los valores modificados. 
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
        Conceptos Clave Aplicados: 
        ✔	Uso de arrays (double[]) para almacenar valores. 
        ✔	Recorrido del array con for-each para mostrar valores. 
        ✔	Modificación de un valor en un array mediante un índice. 
        ✔	Reimpresión del array después de la modificación. 
        */
        System.out.println("\nEjercicio 12: Modificacion de un array de precios y visualizacion de resultados");
        double[] precios = {250.45, 635.28, 790.99, 120.00, 450.75};
        System.out.println("Precios originales:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio " + (i + 1) + ": $" + precios[i]);
        }

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
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio " + (i + 1) + ": $" + precios[i]);

        
        }
    }
    
}
