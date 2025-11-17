/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author david
 */
public class TarjetaCredito implements Pago, PagoConDescuento {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito por: $" + monto);
    }
    
    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * 0.10; // 10% de descuento
        return monto - descuento;
    }
}
