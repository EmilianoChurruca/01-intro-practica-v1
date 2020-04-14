package ar.edu.unahur.Practica1.Ejercicio2;


public class Administrativo extends Persona {
    private int hsExtra;
    private int hsMes;

    public Administrativo(int dni, String nombre, String apellido, String mail, double sueldoBase, int hsExtra, int hsMes) {
        super(dni, nombre, apellido, mail, sueldoBase);
        this.hsExtra = hsExtra;
        this.hsMes = hsMes;
    }

    @Override
    public double getSueldoBase() {
        return  super.getSueldoBase() * ((hsExtra * 1.5)+hsMes) / hsMes;
    }

    public int getHsExtra() {
        return hsExtra;
    }

    public int getHsMes() {
        return hsMes;
    }
    @Override
    public String mostrar(){
       return ("\n DNI: " +super.getDni() +
               "\n Nombre: " +super.getNombre() +
               "\n Apellido: " + super.getApellido() +
               "\n Sueldo: " + this.getSueldoBase());
    }
}
