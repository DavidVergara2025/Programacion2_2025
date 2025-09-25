/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author david
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*GeneradorQR - Usuario - CódigoQR
a. Asociación unidireccional: CódigoQR → Usuario
b. Dependencia de creación: GeneradorQR.generar(String, Usuario)
Clases y atributos:
i. CodigoQR: valor.
ii. Usuario: nombre, email.
iii. GeneradorQR->método: void generar(String valor, Usuario usuario) */
        Usuario usuario = new Usuario("David Vergara", "davidvergara@gmail.com");
        GeneradorQR generadorQR = new GeneradorQR();
        generadorQR.generar("https://www.ejercicio13.com", usuario);
}
    
}
