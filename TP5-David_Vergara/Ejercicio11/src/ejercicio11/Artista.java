/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author david
 */
public class Artista {
    /*Reproductor - Canción - Artista
a. Asociación unidireccional: Canción → Artista
b. Dependencia de uso: Reproductor.reproducir(Cancion)
Clases y atributos: 
i. Canción: titulo.
ii. Artista: nombre, genero.
iii. Reproductor->método: void reproducir(Cancion cancion) */
    private String nombre;
    private String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }
    public String getNombre() {
        return nombre;
    }
    
}
