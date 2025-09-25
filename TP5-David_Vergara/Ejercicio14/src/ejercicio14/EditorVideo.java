/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author david
 */
public class EditorVideo {
    /*EditorVideo - Proyecto - Render
a. Asociación unidireccional: Render → Proyecto
b. Dependencia de creación: EditorVideo.exportar(String, Proyecto)
c. Clases y atributos:
i. Render: formato.
ii. Proyecto: nombre, duracionMin.
iii. EditorVideo->método: void exportar(String formato, Proyecto proyecto) */
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato);
        render.setProyecto(proyecto);
        // Lógica para exportar el proyecto en el formato especificado
        System.out.println("\nExportando el proyecto " + proyecto.getNombre() + " en formato " + render.getFormato());
    }
}
