/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author david
 */
public class TP4David_Vergara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=========================== TRABAJO PRACTICO 4: Programación Orientada a Objetos II ==========================="
            + "\nAlumno: David Vergara \n"
            + "====================================================================================="
            + "Sistema de Gestión de Empleados"
            + "\nSecuencia del programa:"
            + "\n1. Crear empleado"
            + "\n2. Mostrar empleado"
            + "\n3. Actualizar salario"
            + "\n4. Mostrar total de empleados"
            + "\n5. Fin del programa");
      
        
            Empleado emp = Funciones.crearEmpleado();
            Funciones.mostrarEmpleado(emp); 
            System.out.println("Ingrese el nuevo salario del empleado: ");
            Scanner input = new Scanner(System.in);
            double nuevoSalario = Double.parseDouble(input.nextLine());
            emp.actualizarSalario(nuevoSalario);
            System.out.println("Salario actualizado: " + emp);
            System.out.println("Total de empleados en el sistema: " + Empleado.mostrarTotalEmpleados());
            System.out.println("Fin del programa.");

        
    }
    
}
