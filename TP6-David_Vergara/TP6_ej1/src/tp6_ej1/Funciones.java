package tp6_ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class Funciones {
    public static void continuar() {
        System.out.println("\nPresione Enter para continuar...");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();  
    }    

    public static void crearInventario(Inventario inventario) {
        
        System.out.println("\n Creando 10 nuevos productos...");
        Producto p1 = new Producto("0001", "Arroz Lucchetti", 2500.0, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("0002", "Televisor LG", 350000.0, 20, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("0003", "Pantalón de vestir", 80000.0, 40, CategoriaProducto.ROPA);
        Producto p4 = new Producto("0004", "Microondas Samsung", 120000.0, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("0005", "Leche Entera", 1500.0, 100, CategoriaProducto.ALIMENTOS);
        Producto p6 = new Producto("0006", "Celular Samsung Galaxy S21", 250000.0, 30, CategoriaProducto.ELECTRONICA);
        Producto p7 = new Producto("0007", "Camisa blanca", 60000.0, 25, CategoriaProducto.ROPA);
        Producto p8 = new Producto("0008", "Aspiradora Philips", 90000.0, 10, CategoriaProducto.HOGAR);
        Producto p9 = new Producto("0009", "Pan Bimbo", 3000.0, 80, CategoriaProducto.ALIMENTOS);
        Producto p10 = new Producto("0010", "Auriculares Sony", 45000.0, 35, CategoriaProducto.ELECTRONICA);
        System.out.println("\n Agregando productos al inventario...");
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        inventario.agregarProducto(p6);
        inventario.agregarProducto(p7); 
        inventario.agregarProducto(p8);
        inventario.agregarProducto(p9);
        inventario.agregarProducto(p10);
        continuar();
    }

    public static void buscarPorID(Inventario inventario) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n--- Buscar Producto por ID ---");
        System.out.print("Ingrese el ID del producto a buscar: ");
        String idBuscar = sc.nextLine();
        Producto productoEncontrado = inventario.buscarProductoPorId(idBuscar);
        if (productoEncontrado != null) {
            System.out.println("Producto encontrado:");
            productoEncontrado.mostrarInfo();
        } else {
            System.out.println("Producto con ID " + idBuscar + " no encontrado.");
        }
        continuar();
    }
    public static void listarProductos(Inventario inventario) {
        System.out.println("\n--- Listado de Productos ---");
        inventario.listarProductos();
    }

    public static void eliminarProducto(Inventario inventario) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n--- Eliminar Producto por ID ---");
        System.out.print("Ingrese el ID del producto a eliminar: ");
        String idEliminar = sc.nextLine();
        inventario.eliminarProducto(idEliminar);
        continuar();
    }

    public static void actualizarStock(Inventario inventario) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n--- Actualizar Stock de un Producto ---");
        System.out.print("Ingrese el ID del producto para actualizar el stock: ");
        String idActualizar = sc.nextLine();
        System.out.print("Ingrese la nueva cantidad en stock: ");
        int nuevaCantidad = sc.nextInt();
        inventario.actualizarStock(idActualizar, nuevaCantidad);
        continuar();
    }

    public static void filtrarPorCategoria(Inventario inventario) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n--- Filtrar Productos por Categoría ---");
        System.out.println("Categorías disponibles:");// Mostrar las categorías disponibles numeradas y pedir el numero de la categoría
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println(categoria.ordinal() + 1 + ". " + categoria + " - " + categoria.getDescripcion());     
        }
        System.out.print("Ingrese el número de la categoría para filtrar: ");
        int opcionCategoria = Integer.parseInt(sc.nextLine());
        if (opcionCategoria < 1 || opcionCategoria > CategoriaProducto.values().length) {
            System.out.println("Opción inválida. No se realizará el filtrado.");
            return;
        }
        CategoriaProducto categoriaSeleccionada = CategoriaProducto.values()[opcionCategoria - 1];
        System.out.println("Productos en la categoría " + categoriaSeleccionada + ":");
        ArrayList<Producto> productosFiltrados = inventario.filtrarPorCategoria(categoriaSeleccionada);
        if (productosFiltrados.isEmpty()) {
            System.out.println("No se encontraron productos en esta categoría.");
        } else {
            for (Producto p : productosFiltrados) {
                p.mostrarInfo();
            }
        }
        continuar();
    }

    public static void mostrarStockTotal(Inventario inventario) {
        System.out.println("\n\n--- Total de Stock Disponible ---");
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("Total de stock disponible en el inventario: " + totalStock);
        continuar();
    }

    public static void mostrarProductoConMayorStock(Inventario inventario) {
        System.out.println("\n\n--- Producto con Mayor Stock ---");
        Producto productoMayorStock = inventario.obtenerProductoConMayorStock();
        if (productoMayorStock != null) {
            System.out.println("Producto con mayor stock:");
            productoMayorStock.mostrarInfo();
        } else {
            System.out.println("El inventario está vacío.");
        }
        continuar();
    }

    public static void filtrarProductosPorRangoDePrecio(Inventario inventario) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n--- Filtrar Productos por Rango de Precio ---");
        System.out.print("Ingrese el precio mínimo: ");
        double precioMin = sc.nextDouble();
        System.out.print("Ingrese el precio máximo: ");
        double precioMax = sc.nextDouble();
        ArrayList<Producto> productosFiltrados = inventario.filtrarProductosPorPrecio(precioMin, precioMax);
        if (productosFiltrados.isEmpty()) {
            System.out.println("No se encontraron productos en el rango de precio especificado.");
        } else {
            System.out.println("Productos en el rango de precio $" + precioMin + " - $" + precioMax + ":");
            for (Producto p : productosFiltrados) {
                p.mostrarInfo();
            }
        }
        continuar();
    }

    public static void mostrarCategoriasDisponibles(Inventario inventario) {
        System.out.println("\n\n--- Categorías Disponibles ---");
        inventario.mostrarCategoriasDisponibles();
        continuar();
    }
}
