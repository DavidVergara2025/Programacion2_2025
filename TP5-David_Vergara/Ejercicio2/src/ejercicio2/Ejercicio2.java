/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author david
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Celular - Batería - Usuario
a. Agregación: Celular → Batería
b. Asociación bidireccional: Celular ↔ Usuario
Clases y atributos:
i. Celular: imei, marca, modelo
ii. Batería: modelo, capacidad
iii. Usuario: nombre, dni*/
        Bateria bateria = new Bateria("LKG654", 4000);
        Usuario usuario = new Usuario("David", "35123456");
        Celular celular = new Celular("35648768A", "Samsung", "A32-5g", bateria, usuario);
        usuario.setCelular(celular);
        System.out.println("\nEl usuario " + usuario.getNombre() + " tiene un celular con IMEI: " + celular.getImei());
        System.out.println("El celular con IMEI: " + celular.getImei() + " pertenece a " + celular.getUsuario().getNombre());
        System.out.println("El celular con IMEI: " + celular.getImei() + " tiene una batería modelo: " + bateria.getModelo() + " con capacidad: " + bateria.getCapacidad() + "mAh");
        
    }
    
}
