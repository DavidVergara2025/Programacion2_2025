/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2;

/**
 *
 * @author david
 */
public abstract class Figura {
    /*Figuras geométricas y métodos abstractos
● Clase abstracta: Figura con método calcularArea() y atributo nombre
● Subclases: Círculo y Rectángulo implementan el cálculo del área
● Tarea: Crear un array de figuras y mostrar el área de cada una usando polimorfismo.*/
    protected String nombre;
    
    public Figura (String nombre) {
        this.nombre = nombre;
    }
    
    public void calcularArea(){
    }
}
