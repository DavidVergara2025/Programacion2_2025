/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author david
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Crear asociacion bidireccional entre tarjeta y cliente, y agregacion entre tarjeta y banco.Clases y atributos:
i. TarjetaDeCrédito: numero, fechaVencimiento
ii. Cliente: nombre, dni
iii. Banco: nombre, cuit*/
        Banco banco = new Banco("Banco Nacion", "30-34567890-9");
        Cliente cliente = new Cliente("Juan Perez", "34567890");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("4398-5678-9012-3456", "12/25", banco);

        // Asociación bidireccional entre TarjetaDeCredito y Cliente
        cliente.setTarjeta(tarjeta);
        
        // Mostrar información
        System.out.println("\nCliente: " + cliente.getNombre() + "\nBanco: " + banco.getNombre() + "\nTarjeta asignada:" + cliente.getTarjeta().getNumero());
    }
    
}
