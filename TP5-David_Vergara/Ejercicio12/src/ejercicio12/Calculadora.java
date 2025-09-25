/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author david
 */
public class Calculadora {
    /*Impuesto - Contribuyente - Calculadora
a. Asociación unidireccional: Impuesto → Contribuyente
b. Dependencia de uso: Calculadora.calcular(Impuesto)
Clases y atributos:
i. Impuesto: monto.
ii. Contribuyente: nombre, cuil.
iii. Calculadora->método: void calcular(Impuesto impuesto)*/
    public void calcular(Impuesto impuesto){
        System.out.println("\nCalculando impuesto de monto: " + impuesto.getMonto() + " para el contribuyente: " + impuesto.getContribuyente().getNombre());
    }
}
