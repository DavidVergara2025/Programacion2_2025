/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.david_vergara;

/**
 *
 * @author david
 */


public class Estudiante {
    //Crear constantes calificacion maxima y minima
    final static double CALIFICACION_MAXIMA = 10.0;
    final static double CALIFICACION_MINIMA = 0.0;

    //Atributos
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    

    
    //Metodos
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }
    
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        if (calificacion > CALIFICACION_MAXIMA) {
            calificacion = CALIFICACION_MAXIMA; // Limitar la calificación máxima a 10
        }
    }
    
    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < CALIFICACION_MINIMA) {
            calificacion = CALIFICACION_MINIMA; // Limitar la calificación mínima a 0
        }
    }
    
}
