/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

/**
 *
 * @author david
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cliente cliente = new Cliente("David Vergara");
        Pedido pedido = new Pedido(cliente);
        
        Producto producto1 = new Producto("Notebook Dell", 1100500.00);
        Producto producto2 = new Producto("Smartphone Samsung Galaxy A24", 300000.00);
        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);
       double totalPedido = pedido.calcularTotal();
        System.out.println("Total sin descuento: $" + totalPedido);
        TarjetaCredito tarjeta = new TarjetaCredito();
        double totalConDescuento = tarjeta.aplicarDescuento(totalPedido);
        System.out.println("Total con descuento: $" + totalConDescuento);
        tarjeta.procesarPago(totalConDescuento);
        pedido.cambiarEstado("Procesando...");
        pedido.cambiarEstado("Enviado");
        pedido.cambiarEstado("Entregado");

    }
    
}
