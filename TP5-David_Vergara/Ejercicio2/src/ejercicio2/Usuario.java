/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author david
 */
public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular; // Asociación bidireccional

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    //Asociación bidireccional con Celular
    public void setCelular(Celular celular) {
        this.celular = celular;
        if (celular !=null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
        
    }
    public String getNombre() {
        return nombre;
    }

    public Celular getCelular() {
        return celular;
    }
}