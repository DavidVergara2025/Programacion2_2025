package tp3.david_vergara;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final static int LIMITE_COMBUSTIBLE = 1000;

    public void despegar() {
        if (combustible > 0) {
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println("Combustible insuficiente para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int consumo = distancia; 
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " ha avanzado " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println("Combustible insuficiente para avanzar esa distancia.Necesira recargar "+ (consumo - combustible) + " unidades mas de combustible.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad < 0) {
            System.out.println("Cantidad invalida. No se puede recargar una cantidad negativa.");
            return;
        }
        if (combustible + cantidad > LIMITE_COMBUSTIBLE) {
            combustible = LIMITE_COMBUSTIBLE;
            System.out.println(nombre + " ha recargado hasta el limite. Combustible actual: " + combustible);
        } else {
            combustible += cantidad;
            System.out.println(nombre + " ha recargado " + cantidad + " unidades. Combustible actual: " + combustible);
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + ", Combustible: " + combustible + "/" + LIMITE_COMBUSTIBLE);
    }

}
