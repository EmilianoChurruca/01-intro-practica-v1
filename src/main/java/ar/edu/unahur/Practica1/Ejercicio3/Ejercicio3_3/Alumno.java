package ar.edu.unahur.Practica1.Ejercicio3.Ejercicio3_3;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Alumno {

    int dni;
    String nombre;
    String apellido;
    String email;
    Set<Asignatura> asignaturasConMatricula = new HashSet<>();

    Alumno(int dni, String nombre, String apellido, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public int getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno)) return false;
        Alumno alumno = (Alumno) o;
        return getDni() == alumno.getDni();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDni());
    }
}
