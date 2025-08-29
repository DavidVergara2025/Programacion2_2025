/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.david_vergara;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio5 {
    public static void ej5(){ 
        
        boolean enAire = false;
        boolean repetir = true;

        NaveEspacial nave = new NaveEspacial();
        nave.mostrarEstado();
        System.out.println("\n*** Bienvenido al menu de operaciones de la nave espacial. ***");
        while (repetir) {
            System.out.println("\nSeleccione una opcion: \n1. Despegar\n2. Avanzar\n3. Recargar Combustible\n4. Mostrar Estado\n5. Salir");
            Scanner input = new Scanner(System.in);
            int opcion = Integer.parseInt(input.nextLine());
            while (opcion < 1 || opcion > 5) {
                System.out.println("Opcion invalida. Ingrese un numero entre 1 y 5: ");
                opcion = Integer.parseInt(input.nextLine());
            }
            switch (opcion) {
                case 1:                       
                    enAire = nave.despegar(enAire);                   
                    break;
                case 2:
                    nave.avanzar(enAire);
                    break;
                case 3:
                    nave.recargarCombustible();
                    break;
                case 4:
                    nave.mostrarEstado();
                    break;
                case 5:
                    repetir = false;
                    if (!enAire){
                        System.out.println("Saliendo del menu. Hasta luego!");
                    } else {
                        System.out.println("Usted abandona la nave en el espacio. Jaja. Suerte con eso. Hasta la vista!");
                    }                        
                    break;
            }
        }
    }    
}
