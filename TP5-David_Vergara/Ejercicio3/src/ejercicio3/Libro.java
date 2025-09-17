/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author david
 */
public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    // Agregación: se inyecta por constructor
    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    // Setter para asociación unidireccional
    public void setAutor(Autor autor) { 
        this.autor = autor; 
    }

    // Getter para la agregación
    public Editorial getEditorial() { 
        return editorial; 
    }

    public void mostrar() {
        System.out.println("\nLibro:\nTitulo=" + titulo + "\nisbn='" + isbn + "\nAutor=" + autor.getNombre() + "\nEditorial=" + editorial.getNombre());
    }
}
