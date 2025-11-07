/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_ej2;

/**
 *
 * @author david
 */
public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public Autor getAutor() {
        return autor;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + getTitulo());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Año de Publicación: " + getAnioPublicacion());
        System.out.println("Información del Autor:");
        autor.mostrarInfo();
        System.out.println("---------------------------");
    }
}
