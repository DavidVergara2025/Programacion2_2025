import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author david
 */
public class Tp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Programa principal con menu de opciones: ejecutar secuencialmente o elejir ejercicio
        Scanner input = new Scanner(System.in);
        System.out.println("\n============ Trabajo practico 2 - Programacion estructurada ============");
        System.out.println("Elija una opcion:");
        System.out.println("1. Ejecutar todos los ejercicios secuencialmente");
        System.out.println("2. Elegir un ejercicio para ejecutar");
        System.out.print("Ingrese su opcion (1 o 2): ");
        int opcion = Integer.parseInt(input.nextLine());
        switch (opcion) {
            case 1:
                Ej1.ej1();
                Ej2.ej2();
                Ej3.ej3();
                Ej4.ej4();
                Ej5.ej5();
                Ej6.ej6();
                Ej7.ej7();
                Ej8.ej8();
                Ej9.ej9();
                Ej10.ej10();
                Ej11.ej11();
                Ej12.ej12();
                Ej13.ej13();
                System.out.println("\nFin de los ejercicios.");
                break;
            case 2:
                System.out.print("Ingrese el numero del ejercicio (1-13): ");
                int numeroEjercicio = Integer.parseInt(input.nextLine());
                switch (numeroEjercicio) {
                    case 1:
                        Ej1.ej1();
                        break;
                    case 2:
                        Ej2.ej2();
                        break;
                    case 3:
                        Ej3.ej3();
                    case 4:
                        Ej4.ej4();
                        break;
                    case 5:
                        Ej5.ej5();
                        break;
                    case 6:
                        Ej6.ej6();
                        break;
                    case 7:
                        Ej7.ej7();
                        break;
                    case 8:
                        Ej8.ej8();
                        break;
                    case 9:
                        Ej9.ej9();
                        break;
                    case 10:
                        Ej10.ej10();
                        break;
                    case 11:
                        Ej11.ej11();
                        break;
                    case 12:
                        Ej12.ej12();
                        break;
                    case 13:
                        Ej13.ej13();
                        break;
                    default:
                        System.out.println("Numero de ejercicio invalido.");
                        break;                
                }
                break;            
            default:
                System.out.println("Opcion invalida. Por favor, elija 1 o 2.");
                break;
        }            
    }
}


    

