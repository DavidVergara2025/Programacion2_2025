/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author david
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EditorVideo editor = new EditorVideo();
        Proyecto proyecto = new Proyecto("Proyecto_Ejercicio_14", 10.5);
        editor.exportar("MP4", proyecto);

    }
    
}
