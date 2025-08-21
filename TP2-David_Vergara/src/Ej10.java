/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ej10 {
    public static void ej10() {
        /*10.	Actualización de stock a partir de venta y recepción de productos.
        Crea un método actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida), 
        que calcule el nuevo stock después de una venta y recepción de productos: 
        NuevoStock = StockActual − CantidadVendida + CantidadRecibida 
        NuevoStock = CantidadVendida + CantidadRecibida 
        Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, y muestra el stock actualizado. 
        Ejemplo de entrada/salida: 
        Ingrese el stock actual del producto: 50 
        Ingrese la cantidad vendida: 20 
        Ingrese la cantidad recibida: 30 
        El nuevo stock del producto es: 60 
        */

        System.out.println("\nEjercicio 10: Actualizacion de stock a partir de venta y recepcion de productos");
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = Integer.parseInt(input.nextLine());
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);        
    } 

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
     
    
}
