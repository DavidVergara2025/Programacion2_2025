/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej1;

/**
 *
 * @author david
 */
public class Ej1_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Desarrollar las siguientes Katas en Java aplicando herencia y polimorfismo. Se recomienda repetir cada kata para afianzar el concepto.
1. Vehículos y herencia básica
● Clase base: Vehículo con atributos marca, modelo y método mostrarInfo()
● Subclase: Auto con atributo adicional cantidadPuertas, sobrescribe mostrarInfo()
● Tarea: Instanciar un auto y mostrar su información completa.*/
        System.out.println("\n---------- EJERCICIO 1 - HERENCIA Y POLIMORFISMO ----------");
        Auto auto = new Auto("Toyota", "Corolla", 4);
        auto.mostrarInfo();
        System.out.println("\n---------- FIN DEL PROGRAMA ----------");

    }
    
}
