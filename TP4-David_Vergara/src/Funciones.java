/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Funciones {
    public static Empleado crearEmpleado() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = input.nextLine();
        System.out.println("Ingrese el puesto del empleado: ");
        String puesto = input.nextLine();
        System.out.println("¿Desea ingresar un ID y salario personalizado? (s/n): ");
        String respuesta = input.nextLine().toLowerCase();
        switch (respuesta) {
            case "s":
                System.out.println("Ingrese el ID del empleado (de 1000 en adelante): ");
                int id = Integer.parseInt(input.nextLine());
                System.out.println("Ingrese el salario del empleado: ");
                double salario = Double.parseDouble(input.nextLine());
                return new Empleado(id, nombre, puesto, salario);
            case "n":
                return new Empleado(nombre, puesto);
        
            default:
                System.out.println("Respuesta invalida. Se asignaran ID y salario por defecto.");
                return new Empleado(nombre, puesto);
        }  
    }
    

    //Mostrar informacion del empleado
    public static void mostrarEmpleado(Empleado emp) {
        System.out.println(emp);
    }
    //Buscar empleado por ID
    public static void buscarEmpleadoPorId(java.util.ArrayList<Empleado> empleados) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el ID del empleado a buscar: ");
        int idBuscar = Integer.parseInt(input.nextLine());
        for (Empleado emp : empleados) {
            if (emp.getId() == idBuscar) {
                mostrarEmpleado(emp);
                return;
            }
        }
        System.out.println("Empleado con ID " + idBuscar + " no encontrado.");
    }
    //Actualizar salario
    public static void actualizarSalario(java.util.ArrayList<Empleado> empleados) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el ID del empleado cuyo salario desea actualizar: ");
        int idBuscar = Integer.parseInt(input.nextLine());
        for (Empleado emp : empleados) {
            if (emp.getId() == idBuscar) {
                mostrarEmpleado(emp); 
                System.out.println("Desea actualizar por monto fijo (1) o porcentaje (2)? Ingrese 1 o 2: ");
                int opcion = Integer.parseInt(input.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nuevo salario: ");
                        double nuevoSalario = Double.parseDouble(input.nextLine());
                        emp.actualizarSalario(nuevoSalario);
                        System.out.println("Salario actualizado.");
                        mostrarEmpleado(emp);
                        return;
                    case 2:
                        emp.incrementarSalario();
                        System.out.println("Salario actualizado.");
                        mostrarEmpleado(emp);
                        return;
                    default:
                        System.out.println("Opción inválida. No se realizaron cambios.");
                        return;
                }
                
            }
        }
        System.out.println("Empleado con ID " + idBuscar + " no encontrado.");
    }

    
    //Funcion para presionar tecla y continuar
    public static void continuar() {
        System.out.println("Presione cualquier tecla para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    
}