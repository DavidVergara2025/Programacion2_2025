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
        boolean salir = false;
        java.util.ArrayList<Empleado> empleados = new java.util.ArrayList<>();
         System.out.println("\n=========================== TRABAJO PRACTICO 4: Programación Orientada a Objetos II ==========================="
                + "\nAlumno: David Vergara \n"
                + "==============================================================================================================="
                + "\nSistema de Gestión de Empleados");
        while (!salir) {
            System.out.println("\nOpciones:"
                + "\n1. Crear empleado"
                + "\n2. Mostrar empleado por ID"
                + "\n3. Actualizar salario"
                + "\n4. Mostrar total de empleados"
                + "\n5. Mostrar todos los empleados"
                + "\n6. Fin del programa");
      
            System.out.println("Ingrese la opción deseada (1-5): ");
            Scanner scanner = new Scanner(System.in);
            int opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1:
                    Empleado nuevo = Funciones.crearEmpleado();
                    empleados.add(nuevo);
                    System.out.println("Empleado creado: " + nuevo);
                    break;
                case 2:
                    Funciones.buscarEmpleadoPorId(empleados);
                    break;
                case 3:                    
                    Funciones.actualizarSalario(empleados);
                    break;
                case 4:
                    System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
                    break;
                case 5:
                    for (Empleado emp : empleados) {
                        Funciones.mostrarEmpleado(emp);
                    }                    
                    break;
                case 6:
                    salir = true;
                    System.out.println("Fin del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            Funciones.continuar();        
        }        
    }
}
