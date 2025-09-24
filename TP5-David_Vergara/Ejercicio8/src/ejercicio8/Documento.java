/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author david
 */
public class Documento {
    
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; // Composición


    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario); // Composición
    }
    public void mostrarInfo() {
        System.out.println("\nTítulo: " + titulo);
        System.out.println("Contenido: " + contenido);
        System.out.println("Firma Digital:");
        System.out.println("  Código Hash: " + firmaDigital.getCodigoHash());
        System.out.println("  Fecha: " + firmaDigital.getFecha());
        System.out.println("  Usuario: " + firmaDigital.getUsuario().getNombre());
    }
}
