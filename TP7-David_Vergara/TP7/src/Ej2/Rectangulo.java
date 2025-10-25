/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2;

/**
 *
 * @author david
 */
public class Rectangulo extends Figura {
    private double base;
    private double altura;
    
    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("El área de " + nombre + " es: " + area);
    }
    

}
