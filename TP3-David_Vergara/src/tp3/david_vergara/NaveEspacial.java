package tp3.david_vergara;

import java.util.Scanner;

public class NaveEspacial {
    private String nombre = "Apollo 14";
    private int combustible;
    private final static int LIMITE_COMBUSTIBLE = 50;

    public boolean despegar(boolean enAire) {
        if (enAire) {
            System.out.println("La nave ya esta en el aire.");
            return true;
        }
        if (combustible > 0) {
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
            return true;
        } else {
            System.out.println("Combustible insuficiente para despegar.");
            opcionRecargar();
            return false;
        }
    }

    public void avanzar(boolean enAire) {
        if (!enAire) {
            System.out.println("La nave debe despegar primero.");
            return;
        }
        System.out.println("Ingrese la distancia a avanzar: ");
        Scanner input = new Scanner(System.in);
        int distancia = Integer.parseInt(input.nextLine());
         while (distancia < 0) {
            System.out.println("Distancia invalida. Ingrese un numero positivo: ");
            distancia = Integer.parseInt(input.nextLine());
        }
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " ha avanzado " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println("Combustible insuficiente para avanzar esa distancia.Necesita recargar "+ (distancia - combustible) + " unidades mas de combustible.");
            opcionRecargar();
        }
    }
    

    public void recargarCombustible() {
        System.out.println("Ingrese la cantidad de combustible a recargar: ");
        Scanner input = new Scanner(System.in);
        
        int cantidad = Integer.parseInt(input.nextLine());
        while (cantidad < 0) {
            System.out.println("Cantidad invalida. Ingrese un numero positivo: ");
            cantidad = Integer.parseInt(input.nextLine());
        }
        if (combustible + cantidad > LIMITE_COMBUSTIBLE) {
            combustible = LIMITE_COMBUSTIBLE;
            System.out.println("\n" + nombre + " ha recargado hasta el limite. Combustible actual: " + combustible);
        } else {
            combustible += cantidad;
            System.out.println("\n" + nombre + " ha recargado " + cantidad + " unidades. Combustible actual: " + combustible);
        }
    }

    public void mostrarEstado() {
        System.out.println("\nNave: " + nombre + "\nCombustible: " + combustible + "/" + LIMITE_COMBUSTIBLE);
    }

    public void opcionRecargar(){
        System.out.println("Desea recargar ahora? (s/n)");
        Scanner input = new Scanner(System.in);
        String respuesta = input.nextLine();
        while (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n")) {
            System.out.println("Respuesta invalida. Ingrese 's' para si o 'n' para no: ");
            respuesta = input.nextLine();
        }
        if (respuesta.equalsIgnoreCase("s")) {
            recargarCombustible();
        } else {
            System.out.println("Operacion cancelada. Combustible actual: " + combustible);
        }
    }
}
