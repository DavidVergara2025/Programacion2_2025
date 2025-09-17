/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author david
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, String urlImagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(urlImagen, "jpg");
    }

    public void mostrar() {
        System.out.println("Número de pasaporte: " + numero);
        System.out.println("Fecha de emisión: " + fechaEmision);
        System.out.println("Foto (formato " + foto.getFormato() + "): " + foto.getImagen());
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }
    public Titular getTitular() {
        return titular;
    }
    public String getNumero() {
        return numero;
    }

}
