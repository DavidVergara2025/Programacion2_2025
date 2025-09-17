/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author david
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autor autor = new Autor("Juan Fernandez", "Mexico");
        Editorial editorial = new Editorial("Letras", "Calle 123, Ciudad");
        Libro libro = new Libro("Viaje al centro de la Tierra", "978-1234567890", editorial);
        libro.setAutor(autor);

        libro.mostrar();
    }
    
}
