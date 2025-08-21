/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ej8 {
    public static void ej8() {
        /*Cálculo del Precio Final con impuesto y descuento.
Crea un método calcularPrecioFinal(double impuesto, double descuento) que calcule el precio final de un producto en un e-commerce. La fórmula es:
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento) PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento)
Desde main(), solicita el precio base del producto, el porcentaje de impuesto y el porcentaje de descuento, llama al método y muestra el precio final.
Ejemplo de entrada/salida:
Ingrese el precio base del producto: 100
Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): 10
Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): 5
El precio final del producto es: 105.0 */
        System.out.println("\nEjercicio 8: Calculo del Precio Final con impuesto y descuento");
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el porcentaje de impuesto: ");
        double impuesto = Double.parseDouble(input.nextLine()) / 100;
        System.out.print("Ingrese el porcentaje de descuento: ");
        double descuento = Double.parseDouble(input.nextLine()) / 100;
        double precioFinal = calcularPrecioFinal(impuesto, descuento, precioBase);
        System.out.println("El precio final del producto es: " + precioFinal);        
    }
    public static double calcularPrecioFinal(double impuesto, double descuento, double precioBase) {
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }
    
}
