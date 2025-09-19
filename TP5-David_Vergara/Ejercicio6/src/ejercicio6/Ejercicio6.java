/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author david
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Reserva - Cliente - Mesa
a. Asociación unidireccional: Reserva → Cliente
b. Agregación: Reserva → Mesa
Clases y atributos:
i. Reserva: fecha, hora
ii. Cliente: nombre, telefono
iii. Mesa: numero, capacidad */
        Cliente cliente = new Cliente("Pedro Anacleto", "1123581321");
        Mesa mesa = new Mesa(18, 4);
        Reserva reserva = new Reserva("20/09/2025", "20:00", mesa);
        reserva.setCliente(cliente);
        reserva.mostrarDetalles();
    }

        
    
}
