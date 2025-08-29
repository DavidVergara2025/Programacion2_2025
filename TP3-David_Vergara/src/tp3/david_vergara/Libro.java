package tp3.david_vergara;

import java.util.Scanner;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public void getTitulo() {
        System.out.println("Titulo : " + titulo);
    }
    
    public void getAutor() {
        System.out.println("Autor : " + autor);
    }
    
    public void getAnioPublicacion() {
        System.out.println("Año de publicacion : " + anioPublicacion);
    }

    public void mostrarInfo(){
        getTitulo();
        getAutor();
        getAnioPublicacion();
    }
    
    public void setTitulo(){
        System.out.println("Ingrese el titulo del libro: ");
        Scanner input = new Scanner(System.in);
        this.titulo = input.nextLine();
    }

    public void setAutor(){
        System.out.println("Ingrese el autor del libro: ");
        Scanner input = new Scanner(System.in);
        this.autor = input.nextLine();
    }

    public void setAnioPublicacion(){
        System.out.println("Ingrese el año de publicacion del libro (entre 1000 y 2025): ");
        Scanner input = new Scanner(System.in);
        int anio = Integer.parseInt(input.nextLine());
        while (anio < 1000 || anio > 2025 ) {
            System.out.println("Año invalido. Ingrese un año entre 1000 y 2025: ");
            anio = Integer.parseInt(input.nextLine());
        }
        this.anioPublicacion = anio;
    }
    
    

}
