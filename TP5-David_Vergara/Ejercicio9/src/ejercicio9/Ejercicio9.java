/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author david
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Rodrigo Rodriguez", "OSDE");
        Profesional profesional = new Profesional("Dra. Maria Gomez", "Cardiología");
        CitaMedica cita = new CitaMedica("23/09/2025", "10:30 a.m.");
        cita.setPaciente(paciente);
        cita.setProfesional(profesional);
        cita.mostrarDetalles();
    }
    
}
