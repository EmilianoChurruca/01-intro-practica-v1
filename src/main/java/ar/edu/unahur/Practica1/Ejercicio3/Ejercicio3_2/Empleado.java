package ar.edu.unahur.Practica1.Ejercicio3.Ejercicio3_2;

public class Empleado {

    String nombre;
    String apellido;
    String fechaNAcimiento;
    String fechaContrato;

    @Override
    public String toString() {
        return "nombre: " + nombre +
                ", apellido: " + apellido +
                ", fechaNAcimiento: " + fechaNAcimiento +
                ", fechaContrato: " + fechaContrato +
                '}';
    }

    Empleado(String nombre, String apellido, String fechaNAcimiento, String fechaContrato) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNAcimiento = fechaNAcimiento;
        this.fechaContrato = fechaContrato;


    }
}
