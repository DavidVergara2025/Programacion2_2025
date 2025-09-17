/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author david
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; // Composición con PlacaMadre
    private Propietario propietario; // Asociación bidireccional con Propietario
    
    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipsetPlaca) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipsetPlaca); // Crear la PlacaMadre al crear la Computadora
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }

    public String getMarca() {
        return marca;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void mostrarInfo() {
        System.out.println("\nMarca: " + marca);
        System.out.println("Número de Serie: " + numeroSerie);
        System.out.println("Placa Madre - Modelo: " + placaMadre.getModelo());   
    }
    
}
