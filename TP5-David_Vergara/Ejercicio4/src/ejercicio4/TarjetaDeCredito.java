/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author david
 */
public class TarjetaDeCredito {
    /*TarjetaDeCrédito: numero, fechaVencimiento. Asociación bidireccional con Cliente y agregación con Banco*/
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; // Asociación bidireccional con Cliente
    private Banco banco; // Agregación con Banco

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }
    public Cliente getCliente() {
        return cliente;
    }

    public String getNumero() {
        return numero;
    }

    public void mostrar() {
        System.out.println("\nNumero de tarjeta: " + numero + "\nFecha de vencimiento: " + fechaVencimiento + "\nBanco: " + banco.getNombre());
    }
}
