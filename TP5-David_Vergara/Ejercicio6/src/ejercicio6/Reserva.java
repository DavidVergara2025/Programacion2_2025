/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author david
 */
public class Reserva {
    /*Reserva - Cliente - Mesa
a. Asociación unidireccional: Reserva → Cliente
b. Agregación: Reserva → Mesa
Clases y atributos:
i. Reserva: fecha, hora
ii. Cliente: nombre, telefono
iii. Mesa: numero, capacidad */
    private String fecha;
    private String hora;
    private Cliente cliente; // Asociación unidireccional
    private Mesa mesa; // Agregación

    public Reserva(String fecha, String hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void mostrarDetalles() {
        System.out.println("\nDetalles de la Reserva: \nFecha: " + fecha + "\nHora: " + hora + "\nMesa Número: " + mesa.getNumero() + "\nCliente: " + cliente.getNombre());
    }
}
