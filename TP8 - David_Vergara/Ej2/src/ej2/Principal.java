/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*1. División segura
○ Solicitar dos números y dividirlos. Manejar ArithmeticException si el divisor es cero.
2. Conversión de cadena a número
○ Leer texto del usuario e intentar convertirlo a int. Manejar NumberFormatException si no es válido.
3. Lectura de archivo
○ Leer un archivo de texto y mostrarlo. Manejar FileNotFoundException si el archivo no existe.
4. Excepción personalizada
○ Crear EdadInvalidaException. Lanzarla si la edad es menor a 0 o mayor a 120. Capturarla y mostrar mensaje.
5. Uso de try-with-resources
○ Leer un archivo con BufferedReader */
        System.out.println("TRABAJO PRACTICO 8 - EXCEPCIONES");
        DivisionSegura.main(args);
        ConvCadenaANum.main(args);
        LectArch.main(args);
        ExcPers.main(args);
        LectArch.leerArchivoConTry();
        System.out.println("\nFin del programa.");


    }
    //Funcion enter para continuar
    public static void enterParaContinuar() {
        System.out.println("Presione Enter para continuar...");
        Scanner sc = new Scanner(System.in) ;
        sc.nextLine();
    }
}