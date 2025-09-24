/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author david
 */
public class CuentaBancaria {
    /*CuentaBancaria - ClaveSeguridad - Titular
a. Composición: CuentaBancaria → ClaveSeguridad
b. Asociación bidireccional: CuentaBancaria ↔ Titular
Clases y atributos:
i. CuentaBancaria: cbu, saldo
ii. ClaveSeguridad: codigo, ultimaModificacion
iii. Titular: nombre, dni. */
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad; // Composición
    private Titular titular; // Asociación bidireccional

    public CuentaBancaria(String cbu, double saldo, String codigoClave, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigoClave, ultimaModificacion);
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }
    }
    public String getCbu() {
        return cbu;
    }
    public Titular getTitular() {
        return titular;
    }
    
    public void mostrarDetalles() {
        System.out.println("\nCBU: " + cbu);
        System.out.println("Saldo: " + saldo);
        System.out.println("Código de Seguridad: " + claveSeguridad.getCodigo());
        if (titular != null) {
            System.out.println("Titular: " + titular.getNombre());
        } else {
            System.out.println("Titular: No asignado");
        }
    }
}
