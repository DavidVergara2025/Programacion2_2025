/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author david
 */
public class Cancion {
    /*Reproductor - Canción - Artista
a. Asociación unidireccional: Canción → Artista
b. Dependencia de uso: Reproductor.reproducir(Cancion)
Clases y atributos:
i. Canción: titulo.
ii. Artista: nombre, genero.
iii. Reproductor->método: void reproducir(Cancion cancion) */
    private String titulo;
    private Artista artista;    // Asociación unidireccional a Artista

    public Cancion(String titulo) {
        this.titulo = titulo;
    }
    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    public String getNombre() {
        return titulo;
    }
    public Artista getArtista() {
        return artista;
    }
}
