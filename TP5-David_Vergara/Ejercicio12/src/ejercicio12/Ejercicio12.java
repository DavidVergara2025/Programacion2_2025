/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author david
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Impuesto - Contribuyente - Calculadora
a. Asociación unidireccional: Impuesto → Contribuyente
b. Dependencia de uso: Calculadora.calcular(Impuesto)
Clases y atributos:
i. Impuesto: monto.
ii. Contribuyente: nombre, cuil.
iii. Calculadora->método: void calcular(Impuesto impuesto)*/
        Contribuyente contribuyente = new Contribuyente("Fernado Fernandez", "20-12345678-9");
        Impuesto impuesto = new Impuesto(27000.50);
        impuesto.setContribuyente(contribuyente);
        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
    }
    
}
