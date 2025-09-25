/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author david
 */
public class CodigoQR {
    /*GeneradorQR - Usuario - CódigoQR
a. Asociación unidireccional: CódigoQR → Usuario
b. Dependencia de creación: GeneradorQR.generar(String, Usuario)
Clases y atributos:
i. CodigoQR: valor.
ii. Usuario: nombre, email.
iii. GeneradorQR->método: void generar(String valor, Usuario usuario) */
    private String valor;
    private Usuario usuario; // Asociación unidireccional a Usuario

    public CodigoQR(String valor) {
        this.valor = valor;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getValor() {
        return valor;
    }
}
