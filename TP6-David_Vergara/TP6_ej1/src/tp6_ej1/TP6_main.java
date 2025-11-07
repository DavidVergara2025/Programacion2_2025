/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6_ej1;

/**
 *
 * @author david
 */
public class TP6_main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\n---------- TRABAJO PRACTICO 6 - PROGRAMACION 2 - DAVID VERGARA ----------");
        Inventario inventario = new Inventario();
        Funciones.crearInventario(inventario);
        Funciones.listarProductos(inventario);
        Funciones.buscarPorID(inventario);
        Funciones.filtrarPorCategoria(inventario);
        Funciones.eliminarProducto(inventario);
        Funciones.actualizarStock(inventario);
        Funciones.mostrarStockTotal(inventario);
        Funciones.mostrarProductoConMayorStock(inventario);
        Funciones.filtrarProductosPorRangoDePrecio(inventario);
        Funciones.mostrarCategoriasDisponibles(inventario);
        System.out.println("\n---------- FIN DEL PROGRAMA ----------");

    }

    
}

