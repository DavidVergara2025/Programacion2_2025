/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej3;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Ej3_main {
    public static void main(String[] args) {
        System.out.println("\n---------- EJERCICIO 3 - EMPLEADOS Y POLIMORFISMO - PROGRAMACION 2 - DAVID VERGARA ----------");
        
        Empleado emp1 = new EmpleadoPlanta();
        Empleado emp2 = new EmpleadoTemporal();
        
        Empleado emp3 = new EmpleadoPlanta();
        Empleado emp4 = new EmpleadoTemporal();

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleados.add(emp4);

        for (Empleado emp : empleados) {
            double sueldo = emp.calcularSueldo(emp);
            System.out.println("Sueldo calculado: " + sueldo);
        }
        System.out.println("\n---------- FIN DEL PROGRAMA ----------");
    }

}
