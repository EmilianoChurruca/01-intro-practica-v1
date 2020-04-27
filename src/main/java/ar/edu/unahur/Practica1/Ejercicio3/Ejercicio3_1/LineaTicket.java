package ar.edu.unahur.Practica1.Ejercicio3.Ejercicio3_1;

public class LineaTicket extends Ticket {

    private String nombre;
    private double precio;
    private int cantidad;


    LineaTicket(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "LineaTicket{" +
                "nombre= " + nombre +
                ",\t precio= " + precio +
                ",\t cantidad= " + cantidad +
                '}';
    }
}
