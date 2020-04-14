package ar.edu.unahur.Practica1.Ejercicio2;

public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private String mail;
    private double sueldoBase;

    public Persona(){}
    public Persona(int dni, String nombre, String apellido, String mail, double sueldoBase) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.sueldoBase = sueldoBase;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMail() {
        return mail;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public String mostrar(){
        return "";
    }






}


