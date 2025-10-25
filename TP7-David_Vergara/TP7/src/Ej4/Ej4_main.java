/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej4;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Ej4_main {
    public static void main(String[] args) {
        
        ArrayList<Animal> animales = new ArrayList<>();
        Perro p1 = new Perro();
        Gato g1 = new Gato();   
        Vaca v1 = new Vaca();

        animales.add(p1);
        animales.add(g1);
        animales.add(v1);

        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}
