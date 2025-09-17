/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author david
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pasaporte pasaporte = new Pasaporte("A123456789", "2023-10-01", "imagen1.jpg", "jpg");
        Titular titular = new Titular("Heraclito Pérez", "11668954");
        titular.setPasaporte(pasaporte);
        System.out.println("Titular: " + titular.getNombre());
        pasaporte.mostrar();
    }
    
}
