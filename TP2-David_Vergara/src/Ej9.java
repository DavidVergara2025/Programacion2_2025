/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ej9 {
    //CONSTANTES
    final static int COSTO_NACIONAL_X_KG = 5; 
    final static int COSTO_INTERNACIONAL_X_KG = 10; 

    public static void ej9() {
        /* Composición de funciones para calcular costo de envío y total de compra. 
        a.	calcularCostoEnvio(double peso, String zona): Calcula el costo de 
        envío basado en la zona de envío (Nacional o Internacional) y el peso del paquete. 
        Nacional: $5 por kg  
        Internacional: $10 por kg 
        b.	calcularTotalCompra(double precioProducto, double 
        costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con el costo de envío. 
        Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto. Luego, muestra el total a pagar. 
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: $ ");
        double precioProducto = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la zona de envío (1:Nacional o 2:Internacional)");
        System.out.print("Ingrese la opcion: ");
        int zona = Integer.parseInt(input.nextLine());
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
        System.out.println("Costo de envío: $"+ costoEnvio);
        System.out.println("Total a pagar: $"+ totalCompra);
    }
    public static double calcularCostoEnvio(double peso, int zona) {
        switch (zona) {
            case 1:
                return peso * COSTO_NACIONAL_X_KG; 
            case 2:
                return peso * COSTO_INTERNACIONAL_X_KG;
            default:
                System.out.println("Zona de envío no válida.");
                break;
        }
        return 0; // Retorna 0 si la zona no es válida
    }
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
}
