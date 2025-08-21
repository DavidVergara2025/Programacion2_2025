/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ej11 {
    public static void ej11() {
        /*11.	Cálculo de descuento especial usando variable global. 
        Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un método calcularDescuentoEspecial(double precio) 
        que use la variable global para calcular el descuento especial del 10%. 
        Dentro del método, declara una variable local descuentoAplicado, almacena el valor del descuento y muestra el precio final con descuento. 
        Ejemplo de entrada/salida: 
        Ingrese el precio del producto: 200 
        El descuento especial aplicado es: 20.0 
        El precio final con descuento es: 180.0 
        */
        System.out.println("\nEjercicio 11: Calculo de descuento especial usando variable global");
        double descuento = 0.10;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: $ ");
        double precio = Double.parseDouble(input.nextLine());
        double descuentoAplicado = calcularDescuentoEspecial(precio, descuento);
        System.out.println("El descuento especial aplicado es: $" + descuentoAplicado);
        System.out.println("El precio final con descuento es: $" + (precio - descuentoAplicado));        
    }

    public static double calcularDescuentoEspecial(double precio, double descuento) {
        return precio * descuento;
    }
    
}
