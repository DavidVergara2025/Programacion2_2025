/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author david
 */
public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; // Asociación bidireccional con Computadora

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
    }

    public String getNombre() {
        return nombre;
    }
    public Computadora getComputadora() {
        return computadora;
    }
    
    
}
