/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6;

/**
 *
 * @author david
 */
public class Producto {
    /*Clase Producto
Atributos:
● id (String) → Identificador único del producto.
● nombre (String) → Nombre del producto.
● precio (double) → Precio del producto.
● cantidad (int) → Cantidad en stock.
● categoria (CategoriaProducto) → Categoría del producto.
Métodos:
● mostrarInfo() → Muestra en consola la información del producto.
Enum CategoriaProducto Valores:
● ALIMENTOS
● ELECTRONICA
● ROPA
● HOGAR */
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    public String getId() {
        return id;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad en stock: " + cantidad);
        System.out.println("Categoría: " + categoria + " - " + categoria.getDescripcion());
        System.out.println("---------------------------");
    }
}
