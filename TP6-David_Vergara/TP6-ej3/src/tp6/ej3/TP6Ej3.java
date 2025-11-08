/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6.ej3;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class TP6Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nCreando Universidad, Profesores y Cursos...");
        Universidad universidad = new Universidad("Universidad Nacional", new ArrayList<Profesor>(), new ArrayList<Curso>());
        Profesor prof1 = new Profesor("P1", "Ana Lopez", "Matemáticas", new ArrayList<Curso>());
        Profesor prof2 = new Profesor("P2", "Carlos Pérez", "Física", new ArrayList<Curso>());
        Profesor prof3 = new Profesor("P3", "María Gómez", "Literatura", new ArrayList<Curso>());
        Curso curso1 = new Curso("C101", "Cálculo I");  
        Curso curso2 = new Curso("C102", "Física General");  
        Curso curso3 = new Curso("C103", "Literatura Universal");   
        Curso curso4 = new Curso("C104", "Álgebra Lineal");
        Curso curso5 = new Curso("C105", "Mecánica Clásica");
        System.out.println("Agregando Profesores y Cursos a la Universidad...");
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);
        universidad.agregarCurso(curso1);   
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);
        universidad.asignarProfesorACurso("C101", "P1");
        universidad.asignarProfesorACurso("C102", "P2");
        universidad.asignarProfesorACurso("C103", "P3");
        universidad.asignarProfesorACurso("C104", "P1");
        universidad.asignarProfesorACurso("C105", "P2");
        System.out.println("Listado de Cursos con sus Profesores:");
        universidad.listarCursos();
        System.out.println("Listado de Profesores con sus Cursos:");
        universidad.listarProfesores();
        System.out.println("\nCambiando el profesor del curso C101 a Carlos Pérez:");
        universidad.asignarProfesorACurso("C101", "P2");
        System.out.println("\nInformación del curso C101 después del cambio:");
        curso1.mostrarInfo();
        System.out.println("\nInformación del profesor Ana Lopez después del cambio:");
        prof1.mostrarInfo();
        System.out.println("\nInformación del profesor Carlos Pérez después del cambio:");
        prof2.mostrarInfo();
        System.out.println("\nEliminando el curso C104:");
        universidad.eliminarCurso("C104");
        System.out.println("\nInformación del profesor Ana Lopez después de eliminar el curso C104:");
        prof1.mostrarInfo();
        System.out.println("\nEliminando el profesor María Gómez:");
        universidad.eliminarProfesor("P3");
        prof3 = null;
        System.out.println("\nInformación del curso C103 después de eliminar a su profesor:");
        curso3.mostrarInfo();
        System.out.println("\nInformación del profesor María Gómez después de ser eliminada:");
        if (prof3 != null) {
            prof3.mostrarInfo();
        } else {
            System.out.println("Referencia prof3 = null (ya no accesible).");
        }
        System.out.println("\nReporte: Cantidad de cursos por profesor:");
        universidad.mostrarReporteCursosPorProfesor();


    }
    
}
