/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class LectArch {
     //Leer un archivo de texto y mostrarlo. Manejar FileNotFoundException si el archivo no existe.
    public static void main(String[] args) {
        //Llamar al método que lee el archivo
        
        System.out.println("\nLectura de archivo valido:");
        String ruta = "C:\\Users\\david\\Documentos\\Punto3.txt";
        leerArchivo(ruta);
        Principal.enterParaContinuar();
        System.out.println("\nLectura con ruta inexistente:");
        leerArchivo("ruta/inexistente.txt");
        
    }

    public static void leerArchivo(String rutaArchivo) {
        File archivo = new File(rutaArchivo);
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            System.out.println(br.readLine());
        
        }
        catch (IOException e) {
            System.out.println("Error: El archivo no existe o no se puede leer.");
        }
        catch (RuntimeException e) {
            System.out.println("Error inesperado al leer el archivo.");
        }
        Principal.enterParaContinuar();
    }
    //5. Uso de try-with-resources
    //Leer un archivo con BufferedReader    
    public static void leerArchivoConTry() {
        String ruta = "C:\\Users\\david\\Documentos\\TUPaD\\Cursada\\2° Cuatrimestre\\Programación 2\\8. Interfaces y Excepciones\\Punto 5 terminado.docx";
        File archivo = new File(ruta);
        System.out.println("\nLectura de archivo con try-with-resources:");
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        Principal.enterParaContinuar();
    }

    
}