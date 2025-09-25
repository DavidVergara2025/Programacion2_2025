/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author david
 */
public class Impuesto {
    /*Impuesto - Contribuyente - Calculadora
a. Asociación unidireccional: Impuesto → Contribuyente
b. Dependencia de uso: Calculadora.calcular(Impuesto)
Clases y atributos:
i. Impuesto: monto.
ii. Contribuyente: nombre, cuil.
iii. Calculadora->método: void calcular(Impuesto impuesto)*/
private double monto;
private Contribuyente contribuyente;
    public Impuesto(double monto) {
        this.monto = monto;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
    public double getMonto() {
        return monto;
    }
    public Contribuyente getContribuyente() {
        return contribuyente;
    }
}
