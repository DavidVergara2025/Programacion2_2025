/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author david
 */
public class Render { 
    private String formato;
    private Proyecto proyecto; // Asociación unidireccional a Proyecto

    public Render(String formato) {
        this.formato = formato;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public String getFormato() {
        return formato;
    }
}
