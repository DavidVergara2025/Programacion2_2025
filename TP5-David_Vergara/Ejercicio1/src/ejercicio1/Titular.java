/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author david
 */
public class Titular {
    private String nombre;
    private String DNI;
    private Pasaporte pasaporte;

    public Titular(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }
    public String getNombre() {
        return nombre;
    }
    public Pasaporte getPasaporte() {
        return pasaporte;
    }
}
