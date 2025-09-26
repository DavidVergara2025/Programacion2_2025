/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    static int totalEmpleados = 0;
    static int idAutomatico = 1;
    final static double SALARIO_POR_DEFECTO = 30000.0;

    public Empleado(int id, String nombre, String puesto, double salario) {
        setId(id);
        setNombre(nombre);
        setPuesto(puesto);
        setSalario(salario);        
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this.id = idAutomatico++;
        setNombre(nombre);
        setPuesto(puesto);
        this.salario = SALARIO_POR_DEFECTO;
        totalEmpleados++;
    }

    public void actualizarSalario(double nuevoSalario) {
        this.salario = nuevoSalario;
    }   
    
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    //getters
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getPuesto() {
        return puesto;
    }
    public double getSalario() {
        return salario;
    }

    //setters
    public void setId(int id) {
        this.id = id;       
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;            
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public void setSalario(double salario) {
        this.salario = salario;       
    }

    //Incrementar salario por porcentaje
    public void incrementarSalario() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el porcentaje de incremento salarial (por ejemplo, 10 para un 10%): ");
        double porcentaje = Double.parseDouble(input.nextLine());
        if (porcentaje > 0) {
            double incremento = this.salario * (porcentaje / 100);
            this.salario += incremento;
            System.out.println("Salario incrementado en " + porcentaje + "%. Nuevo salario: " + this.salario);
        } else {
            System.out.println("Porcentaje invalido. El salario no se ha modificado.");
        }
    } 

    public void mostrarInfo() {
        getId();
        getNombre();
        getPuesto();
        getSalario();
    }
}    
