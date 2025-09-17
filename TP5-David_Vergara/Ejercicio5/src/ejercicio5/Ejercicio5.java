/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author david
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Computadora - PlacaMadre - Propietario
a. Composición: Computadora → PlacaMadre
b. Asociación bidireccional: Computadora ↔ Propietario
Clases y atributos:
i. Computadora: marca, numeroSerie
ii. PlacaMadre: modelo, chipset
iii. Propietario: nombre, dni */
        Computadora computadora = new Computadora("Dell", "SN123456", "ASUS 1234", "Intel Z490");
        Propietario propietario = new Propietario("Ana Gomez", "45678901");
        propietario.setComputadora(computadora);

        computadora.mostrarInfo();
        System.out.println("Propietario: " + propietario.getNombre());
        System.out.println("Computadora del Propietario: " + propietario.getComputadora().getMarca());
    }
    
}
