/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_ej2;

import java.util.List;

/**
 *
 * @author david
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre, List<Libro> libros) {
        this.nombre = nombre;
        this.libros = libros;
    }

    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }
    public void listarLibros() {
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
        TP6_ej2.continuar();
    }
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        libros.removeIf(libro -> libro.getIsbn().equals(isbn));
        System.out.println("Libro con ISBN " + isbn + " eliminado. Libros restantes:");
        listarLibros();
    }
    public int obtenerCantidadLibros() {
        return libros.size();
    }
    public void filtrarLibrosPorAnio(int anio) {
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
            }
        }
        TP6_ej2.continuar();
    }
    public void mostrarAutoresDisponibles() {
        for (Libro libro : libros) {
            libro.getAutor().mostrarInfo();
        }
        TP6_ej2.continuar();
    }

    
}
