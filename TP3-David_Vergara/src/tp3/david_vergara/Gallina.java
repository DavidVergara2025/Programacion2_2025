package tp3.david_vergara;

import java.util.Scanner;

public class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;

    public void mostrarEstado(){
        System.out.println("\nID Gallina: " + idGallina + "\nEdad: " + edad + "\nHuevos puestos: " + huevosPuestos);
    }

    public void ponerHuevo(){
        System.out.println("Ingrese la cantidad de huevos puestos: ");
        Scanner input = new Scanner(System.in);
        int cantidad = Integer.parseInt(input.nextLine());
         while (cantidad < 0) {
            System.out.println("Cantidad invalida. Ingrese un numero positivo: ");
            cantidad = Integer.parseInt(input.nextLine());
        }
        huevosPuestos =+ cantidad;
    }

    public void envejecer(){
        System.out.println("Ingrese la cantidad de años: ");
        Scanner input = new Scanner(System.in);
        int anios = Integer.parseInt(input.nextLine());
         while (anios < 0) {
            System.out.println("Cantidad invalida. Ingrese un numero positivo: ");
            anios = Integer.parseInt(input.nextLine());
        }
        edad += anios;
    }
    public void setIdGallina(){
        System.out.println("Ingrese el ID de la gallina: ");
        Scanner input = new Scanner(System.in);
        this.idGallina = input.nextLine();
    }   
    public String getIdGallina(){
        return idGallina;
    }
}
