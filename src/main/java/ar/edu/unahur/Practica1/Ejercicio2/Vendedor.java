package ar.edu.unahur.Practica1.Ejercicio2;

public class Vendedor extends Persona{
    private double porcenComision;
    protected double totalVentas;

    public Vendedor(int dni, String nombre, String apellido, String mail, double sueldoBase, double porcenComision, double totalVentas) {
        super(dni, nombre, apellido, mail, sueldoBase);
        this.porcenComision = porcenComision;
        this.totalVentas = totalVentas;
    }

    public double getPorcenComision() {
        return porcenComision;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    @Override
    public double getSueldoBase() {
        return super.getSueldoBase()+(porcenComision*totalVentas)/100;
    }

    @Override
    public String mostrar(){
        return ("\n DNI: " +super.getDni() +
                "\n Nombre: " +super.getNombre() +
                "\n Apellido: " + super.getApellido() +
                "\n Sueldo: " + this.getSueldoBase());

    }
}
