/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6_ej2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class TP6_ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inicio del Programa"
        + "\n---------------------------"
        + "\nGestión de Biblioteca\n"
        + "---------------------------"
        + "\nCeando Biblioteca, Autores y Libros...\n");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", new ArrayList<Libro>());
        Autor autor1 = new Autor("A1", "Gabriel Garcia Marquez", "Colombiano");
        Autor autor2 = new Autor("A2", "Isabel Allende", "Chilena");
        Autor autor3 = new Autor("A3", "Jorge Luis Borges", "Argentino");
        Libro libro1 = new Libro("ISBN001", "Cien Años de Soledad", 1967, autor1);
        Libro libro2 = new Libro("ISBN002", "El Amor en los Tiempos del Cólera", 1985, autor1);
        Libro libro3 = new Libro("ISBN003", "La Casa de los Espíritus", 1982, autor2);
        Libro libro4 = new Libro("ISBN004", "Eva Luna", 1987, autor2);
        Libro libro5 = new Libro("ISBN005", "Ficciones", 1944, autor3);
        continuar();
        System.out.println("Agregando Libros a la Biblioteca...\n");
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);
        continuar();
        System.out.println("Listado de Libros:");
        biblioteca.listarLibros();
        System.out.println("Buscar Libro por ISBN 'ISBN003':");
        Libro libroBuscado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }
        System.out.println("Filtrar Libros por Año 1985:");
        biblioteca.filtrarLibrosPorAnio(1985);
        System.out.println("Eliminar Libro con ISBN 'ISBN002':");
        biblioteca.eliminarLibro("ISBN002");
        System.out.println("Cantidad Total de Libros en la Biblioteca: " + biblioteca.obtenerCantidadLibros());
        System.out.println("\nAutores Disponibles en la Biblioteca:");
        biblioteca.mostrarAutoresDisponibles();
        System.out.println("Fin del Programa.");
    }  
        
    public static void continuar() {
    System.out.println("Presione cualquier tecla para continuar...");
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();
    }
    

    
}
