/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.david_vergara;

/**
 *
 * @author david
 */
public class Ejercicio3 {
    public static void ej3(){
        System.out.println("\n ================= Ejercicio 3 - Encapsulamiento con la Clase Libro ================");
        /*a. Crear una clase Libro con atributos privados: titulo, autor, añoPublicacion.
        Métodos requeridos: Getters para todos los atributos. Setter con validación para añoPublicacion.
        Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con uno válido, mostrar la información final.*/
        Libro Matematica_General = new Libro();
        Matematica_General.mostrarInfo();
        Matematica_General.setTitulo();
        Matematica_General.setAutor();
        Matematica_General.setAnioPublicacion();
        Matematica_General.mostrarInfo();



    }
    
}
