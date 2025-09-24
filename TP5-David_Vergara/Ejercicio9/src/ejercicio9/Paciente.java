/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author david
 */
public class Paciente {
    /*CitaMédica - Paciente - Profesional
a. Asociación unidireccional: CitaMédica → Paciente,
b. Asociación unidirecciona: CitaMédica → Profesional
Clases y atributos:
i. CitaMédica: fecha, hora
ii. Paciente: nombre, obraSocial
iii. Profesional: nombre, especialidad */
    private String nombre;
    private String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }
    public String getNombre() {
        return nombre;
    }
    
}
