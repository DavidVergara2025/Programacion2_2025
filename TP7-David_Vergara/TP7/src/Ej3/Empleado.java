/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej3;

/**
 *
 * @author david
 */
public abstract class Empleado {
    /*3. Empleados y polimorfismo
● Clase abstracta: Empleado con método calcularSueldo()
● Subclases: EmpleadoPlanta, EmpleadoTemporal
● Tarea: Crear lista de empleados, invocar calcularSueldo() polimórficamente, usar instanceof para clasificar */
    public double calcularSueldo(Empleado emp){
        if (emp instanceof EmpleadoPlanta){
            System.out.println("Calculo sueldo de empleado de planta");
            return 1000000;
        } else if (emp instanceof EmpleadoTemporal){
            System.out.println("Calculo sueldo de empleado temporal");
            return 500000;
        } else {
            System.out.println("Tipo de empleado no reconocido");
            return 0;
        }
    }       
}
