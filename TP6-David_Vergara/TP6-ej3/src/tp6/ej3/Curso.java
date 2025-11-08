/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.ej3;

/**
 *
 * @author david
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor profesor) {
        if (this.profesor != null) {
            this.profesor.getCursos().remove(this);
        }
        this.profesor = profesor;
        if (profesor != null && !profesor.getCursos().contains(this)) {
            profesor.getCursos().add(this);
        }
    }
    public void mostrarInfo() {
        System.out.println("\nCódigo del Curso: " + getCodigo());
        System.out.println("Nombre del Curso: " + getNombre());
        if (getProfesor() != null) {
            System.out.println("Profesor Responsable: " + getProfesor().getNombre());
        } else {
            System.out.println("Profesor Responsable: No asignado");
        }
        System.out.println("---------------------------");
    }
}
