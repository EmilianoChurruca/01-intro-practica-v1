package ar.edu.unahur.Practica1.Ejercicio3.Ejercicio3_3;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Asignatura {

    String nombre;
    int horasSemanales;
    Set<Alumno> alumnos= new HashSet<>();


    Asignatura(String nombre, int horasSemanales) {
        this.nombre = nombre;
        this.horasSemanales = horasSemanales;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Asignatura)) return false;
        Asignatura that = (Asignatura) o;
        return getNombre().equals(that.getNombre());
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre());
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", horasSemanales=" + horasSemanales +
                '}';
    }
}
