/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6.ej3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre, List<Profesor> profesores, List<Curso> cursos) {
        this.nombre = nombre;
        this.profesores = profesores;
        this.cursos = cursos;
    }

    public void agregarProfesor(Profesor p) {
        this.profesores.add(p);
    }
    public void agregarCurso(Curso c) {
        this.cursos.add(c);
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor profesor : profesores) {
            if (profesor.getId().equals(id)) {
                return profesor;
            }
        }
        return null;
    }
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }
        return null;
    }

    public void listarProfesores() {
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
        }
    }
    public void listarCursos() {
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }
    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            if (curso.getProfesor() != null) {
                curso.setProfesor(null);
            }
            cursos.remove(curso);
        }
    }

    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p == null) {
            System.out.println("Profesor no encontrado: " + id);
            return;
        }
        ArrayList<Curso> copia = new ArrayList<>(p.getCursos());
        for (Curso c : copia) {
            c.setProfesor(null);
        }
        p.getCursos().clear();
        profesores.remove(p);
        System.out.println("Profesor eliminado: " + p.getId());
    }
    public List<Profesor> getProfesores() {
        return profesores;
    }
    
    public void mostrarReporteCursosPorProfesor() {
        for (Profesor profesor : this.getProfesores()) {
            System.out.println("Profesor: " + profesor.getNombre() + " - Cantidad de cursos: " + profesor.getCursos().size());
        }
    }
}
