/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.ej3;

import java.util.List;

/**
 *
 * @author david
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad, List<Curso> cursos) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = cursos;
    }
    
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public List<Curso> getCursos() {
        return cursos;
    }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            c.setProfesor(this);
        }
    }
    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);
            c.setProfesor(null);
        }
    }
    public void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println("\nCódigo: " + curso.getCodigo() + ", Nombre: " + curso.getNombre());
        }
    }
    public void mostrarInfo() {
        System.out.println("\nID del Profesor: " + getId());
        System.out.println("Nombre del Profesor: " + getNombre());
        System.out.println("Especialidad: " + getEspecialidad());
        System.out.println("Cursos que dicta: " );
        listarCursos();
    }


}
