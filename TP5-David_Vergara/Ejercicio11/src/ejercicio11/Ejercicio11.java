/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author david
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Reproductor - Canción - Artista
a. Asociación unidireccional: Canción → Artista
b. Dependencia de uso: Reproductor.reproducir(Cancion)
Clases y atributos:
i. Canción: titulo.
ii. Artista: nombre, genero.
iii. Reproductor->método: void reproducir(Cancion cancion) */
        Artista artista1 = new Artista("Sebastian Yatra", "Pop");
        Cancion cancion1 = new Cancion("No hay nadie más");
        cancion1.setArtista(artista1);
        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion1);
    }
    
}
