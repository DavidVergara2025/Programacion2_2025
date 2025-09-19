/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author david
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Motor motor = new Motor("V8", "AH54698");
    Conductor conductor = new Conductor("Elsa Pallito", "ACIT123456");
    Vehiculo vehiculo = new Vehiculo("APA456", "Ford K", motor);

    conductor.setVehiculo(vehiculo);

    System.out.println("\nDetalles del Vehículo:" + 
                       "\nPatente: " + vehiculo.getPatente() + 
                       "\nModelo: " + vehiculo.getModelo() + 
                       "\nTipo de Motor: " + motor.getTipo() +
                       "\nConductor: " + vehiculo.getConductor().getNombre());

    System.out.println("\nDetalles del Conductor:" + 
                        "\nNombre: " + conductor.getNombre() +
                        "\nLicencia: " + conductor.getLicencia() +
                        "\nVehículo: " + conductor.getVehiculo().getPatente());
    }
}
