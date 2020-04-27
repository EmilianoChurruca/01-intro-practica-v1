package ar.edu.unahur.Practica1.Ejercicio3.Ejercicio3_2;

import java.util.HashSet;
import java.util.Set;

public class Empresa  {

    String nombre;
    String anyoFundacion;
    Set<Empleado> empleados = new HashSet<>();

    Empresa(String nombre, String anyoFundacion) {
        this.nombre = nombre;
        this.anyoFundacion = anyoFundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAnyoFundacion() {
        return anyoFundacion;
    }

    @Override
    public String toString() {
        return  "nombre: " + nombre +
                ", año de fundación='" + anyoFundacion + '\'';
    }



}
