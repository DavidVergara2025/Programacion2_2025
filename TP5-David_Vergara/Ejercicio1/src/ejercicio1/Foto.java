/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author david
 */
public class Foto {
    private String imagen;
    private String formato;
    
    public Foto(String urlImagen, String formato) {
        this.imagen = urlImagen;
        this.formato = formato;
    }
    public String getImagen() {
        return imagen;
    }
    public String getFormato() {
        return formato;
    }
}
