package tp3.david_vergara;

/**
 *
 * @author david
 */


public class Mascota {
    String nombre;
    String especie;
    int edad;

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    public int cumplirAnios(){
        return edad ++;
    }
}
