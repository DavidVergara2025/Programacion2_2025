/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author david
 */
public class CitaMedica {
    /*CitaMédica - Paciente - Profesional
a. Asociación unidireccional: CitaMédica → Paciente,
b. Asociación unidirecciona: CitaMédica → Profesional
Clases y atributos:
i. CitaMédica: fecha, hora
ii. Paciente: nombre, obraSocial
iii. Profesional: nombre, especialidad */
    private String fecha;
    private String hora;
    private Paciente paciente; // Asociación unidireccional a Paciente
    private Profesional profesional; // Asociación unidireccional a Profesional

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    public void mostrarDetalles() {
        System.out.println("\nCita Médica:");
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Paciente: " + paciente.getNombre());
        System.out.println("Profesional: " + profesional.getNombre());
    }    
}
