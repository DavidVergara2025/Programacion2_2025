/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author david
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Documento - FirmaDigital - Usuario*/
        
        Usuario usuario = new Usuario("Ramon Valdes", "ramonvaldes@gmail.com");
        Documento documento = new Documento("Contrato de trabajo", "Mucho texto...", "aaa111222333", "23/09/2025", usuario);
        documento.mostrarInfo();
    }
    
}
