/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ej4 {
    public static void ej4() {
        /*Calculadora de Descuento según categoría. 
        Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C). 
        Luego, aplique los siguientes descuentos: 
        Categoría A: 10% de descuento 
        Categoría B: 15% de descuento  
        Categoría C: 20% de descuento 
        El programa debe mostrar el precio original, el descuento aplicado y el precio final 
        */
        System.out.println("\nEjercicio 4:");
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la categoria (A, B o C): ");
        //Convertir a minuscula (Se busca la funcion correspondiente .toLowerCase())
        String categoria = input.nextLine().toLowerCase();
        double descuento = 0;
        switch (categoria) {
            case "a":
                descuento = 0.10; // 10% de descuento
                break;
            case "b":
                descuento = 0.15; // 15% de descuento
                break;
            case "c":
                descuento = 0.20; // 20% de descuento
                break;
            default:
                System.out.println("Categoria invalida");               
        }
        double descuentoAplicado = precio * descuento;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("Precio original: $" + precio);
        System.out.println("Descuento aplicado: $" + descuentoAplicado);
        System.out.println("Precio final: $" + precioFinal);
        System.out.println("Fin del ejercicio 4. Presione Enter para continuar...");
        input.nextLine();
    }   
}
