/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author david
 */
public class Reproductor {
       public void reproducir(Cancion cancion) {
        System.out.println("\nReproduciendo: " + cancion.getNombre() + " - Artista: " + cancion.getArtista().getNombre());
    }
}
