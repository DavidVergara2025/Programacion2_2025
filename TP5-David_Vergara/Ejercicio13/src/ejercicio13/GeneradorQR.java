/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author david
 */
public class GeneradorQR {
    /*GeneradorQR - Usuario - CódigoQR
a. Asociación unidireccional: CódigoQR → Usuario
b. Dependencia de creación: GeneradorQR.generar(String, Usuario)
Clases y atributos:
i. CodigoQR: valor.
ii. Usuario: nombre, email.
iii. GeneradorQR->método: void generar(String valor, Usuario usuario) */
    public void generar(String valor, Usuario usuario) {
        CodigoQR codigoQR = new CodigoQR(valor);
        codigoQR.setUsuario(usuario);
        System.out.println("\nCódigo QR generado para el usuario: " + usuario.getNombre() + " con valor: " + codigoQR.getValor());

    }
}
