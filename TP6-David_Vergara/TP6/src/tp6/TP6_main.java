/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6;

/**
 *
 * @author david
 */
public class TP6_main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  OBJETIVO GENERAL
Desarrollar estructuras de datos dinámicas en Java mediante el uso de colecciones (ArrayList) y enumeraciones (enum), implementando un sistema de stock con funcionalidades progresivas que refuerzan conceptos clave de la programación orientada a objetos..
MARCO TEÓRICO Concepto Aplicación en el proyecto ArrayList Estructura principal para almacenar productos en el inventario.
Enumeraciones (enum)
Representan las categorías de productos con valores predefinidos. Relaciones 1 a N Relación entre Inventario (1) y múltiples Productos (N).
Métodos en enum
Inclusión de descripciones dentro del enum para mejorar legibilidad. Ciclo for-each Recorre colecciones de productos para listado, búsqueda o filtrado.
Búsqueda y filtrado
Por ID y por categoría, aplicando condiciones. Ordenamientos y reportes Permiten organizar la información y mostrar estadísticas útiles.
Encapsulamiento
Restringir el acceso directo a los atributos de una clase

Caso Práctico 1
1. Descripción general
Se debe desarrollar un sistema de stock que permita gestionar productos en una tienda, controlando su disponibilidad, precios y categorías. La información se modelará utilizando clases, colecciones dinámicas y enumeraciones en Java.
2. Clases a implementar Clase Producto
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
● HOGAR

Método adicional:
java public enum CategoriaProducto {
ALIMENTOS("Productos comestibles"),
ELECTRONICA("Dispositivos electrónicos"),
ROPA("Prendas de vestir"), HOGAR("Artículos para el hogar"); private final String descripcion; CategoriaProducto(String descripcion) { this.descripcion = descripcion;
}
public String getDescripcion() { return descripcion;
}
}

Clase Inventario
Atributo:
● ArrayList<Producto> productos Métodos requeridos:
● agregarProducto(Producto p)
● listarProductos()
● buscarProductoPorId(String id)
● eliminarProducto(String id)
● actualizarStock(String id, int nuevaCantidad)
● filtrarPorCategoria(CategoriaProducto categoria)
● obtenerTotalStock()
● obtenerProductoConMayorStock()
● filtrarProductosPorPrecio(double min, double max)
● mostrarCategoriasDisponibles()
3. Tareas a realizar
1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
2. Listar todos los productos mostrando su información y categoría.
3. Buscar un producto por ID y mostrar su información.
4. Filtrar y mostrar productos que pertenezcan a una categoría específica.
5. Eliminar un producto por su ID y listar los productos restantes.
6. Actualizar el stock de un producto existente.
7. Mostrar el total de stock disponible.
8. Obtener y mostrar el producto con mayor stock.
9. Filtrar productos con precios entre $1000 y $3000.
10. Mostrar las categorías disponibles con sus descripciones.

CONCLUSIONES ESPERADAS
● Comprender el uso de this para acceder a atributos de instancia.
● Aplicar constructores sobrecargados para flexibilizar la creación de objetos.
● Implementar métodos con el mismo nombre y distintos parámetros.
● Representar objetos con toString() para mejorar la depuración.
● Diferenciar y aplicar atributos y métodos estáticos en Java.
Reforzar el diseño modular y reutilizable mediante el paradigma orientado a objetos.*/
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

