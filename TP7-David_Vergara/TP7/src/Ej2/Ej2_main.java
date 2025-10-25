/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Ej2_main {
    public static void main(String[] args) {
        System.out.println("\n---------- TRABAJO PRACTICO 7 - PROGRAMACION 2 - DAVID VERGARA ----------");
        
        //Crear  un ArrayList para las figuras
        ArrayList<Figura> figuras = new ArrayList<>();
        //Instanciar figuras
        Rectangulo rectangulo1 = new Rectangulo("Rectángulo 1", 4, 5);
        Circulo circulo1 = new Circulo("Círculo 1", 3);
        Rectangulo rectangulo2 = new Rectangulo("Rectángulo 2", 6, 2);
        Circulo circulo2 = new Circulo("Círculo 2", 5);
        //Agregar figuras al ArrayList
        figuras.add(rectangulo1);
        figuras.add(circulo1);
        figuras.add(rectangulo2);
        figuras.add(circulo2);
        //Calcular y mostrar el área de cada figura usando polimorfismo
        for (Figura figura : figuras) {
            figura.calcularArea();
        }   
        System.out.println("\n---------- FIN DEL PROGRAMA ----------");
    }
}