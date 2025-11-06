/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6_ej1;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Inventario {
    
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }
    public void listarProductos() {
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
    public void eliminarProducto(String id) {
        if (buscarProductoPorId(id) != null) {
            productos.remove(buscarProductoPorId(id));
            System.out.println("Producto con ID " + id + " eliminado.");
            System.out.println("Productos restantes en el inventario:");
            listarProductos();
        } else {
            System.out.println("Producto con ID " + id + " no encontrado.");
        }
    }
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado :");
            p.mostrarInfo();
        }
    }
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }
        
    public Producto obtenerProductoConMayorStock() {
        Producto maxStockProducto = null;
        for (Producto p : productos) {
            if (maxStockProducto == null || p.getCantidad() > maxStockProducto.getCantidad()) {
                maxStockProducto = p;
            }
        }
        return maxStockProducto;
    }
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println(categoria + ": " + categoria.getDescripcion());
        }
    }
}
