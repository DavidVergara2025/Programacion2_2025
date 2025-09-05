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
    
}