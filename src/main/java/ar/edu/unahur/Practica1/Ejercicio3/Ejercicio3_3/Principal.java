package ar.edu.unahur.Practica1.Ejercicio3.Ejercicio3_3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {

    public Principal() {
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int op;
        int dni;
        Alumno alumno;
        Asignatura asignatura;
        String nombreMateria;
        Set<Alumno> alumnos = new HashSet<>();
        Set<Asignatura> asignaturas = new HashSet<>();


        System.out.print("seleccione una opción del Menú: \n1. Crear nuevo alumno." +
                "\n2. Crear nueva asignatura. " +
                "\n3. Matricular alumno en asignatura. " +
                "\n4. Listado de alumnos matriculados en una asignatura" +
                "\n5. Listado de asignaturas en las que está matriculado un alumno y total de horas" +
                "\n6. Salir\nOpción: ");
        op = teclado.nextInt();
        teclado.nextLine();
        while (op != 6){
            switch (op){
                case 1:
                    alumnos.add(crearAlumno());  //crea un alumno y lo guarda
                    break;
                case 2:
                    asignaturas.add(crearAsignatura()); //crea y guarda una asignatura
                    break;
                case 3:
                    System.out.println("Para matricular se necesita el Dni y el nombre de la materia.");
                    dni = pedirDniAlumno();
                    nombreMateria = pedirNombreAsignatura();
                    alumno = encontrarAlumno(alumnos,dni);   //guardo el Alumno para matricular de la lista de alumnos
                    asignatura = encontrarAsignatura(asignaturas,nombreMateria); //guardo la materia

                    //Ahora le guardo al alumno la materia en que se maticuló
                    alumno.asignaturasConMatricula.add(asignatura);
                    // Guardo en la materia el alumno que se matriculó
                    asignatura.alumnos.add(alumno);
                    break;
                case 4:
                    nombreMateria = pedirNombreAsignatura();
                    asignatura = encontrarAsignatura(asignaturas,nombreMateria); //busco y guardo la signatura pedida
                    asignatura.alumnos.stream().forEach(alumno1 -> System.out.println(alumno1));
                    break;
                case 5:
                    int hsSemanales=0;
                    dni = pedirDniAlumno(); //pido el dni del alumno
                    alumno = encontrarAlumno(alumnos,dni);   //guardo el Alumno para mostrar sus materias
                    for (Asignatura a: alumno.asignaturasConMatricula) {
                        System.out.println(a);
                        hsSemanales += a.getHorasSemanales();
                    }
                    System.out.println("La cantidad de horas semanales de estudio es: " + hsSemanales + " horas");
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
            System.out.print("seleccione una opción del Menú: \n1. Crear nuevo alumno." +
                    "\n2. Crear nueva asignatura. " +
                    "\n3. Matricular alumno en asignatura. " +
                    "\n4. Listado de alumnos matriculados en una asignatura" +
                    "\n5. Listado de asignaturas en las que está matriculado un alumno y total de horas" +
                    "\n6. Salir\nOpción: ");
            op = teclado.nextInt();
            teclado.nextLine();
        }

    }
    public static Alumno crearAlumno(){

        Integer dni;
        String nombre;
        String apellido;
        String email;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el DNI: ");
        dni = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingrese el nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Ingrese el apellido: ");
        apellido = teclado.nextLine();
        System.out.print("Ingrese el email: ");
        email = teclado.nextLine();

        Alumno alumno = new Alumno(dni,nombre,apellido,email);
        return alumno;
    }

    public static Asignatura crearAsignatura(){

        String nombre;
        int hsSemanales;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Ingrese la cantidad de horas semanales: ");
        hsSemanales = teclado.nextInt();
        teclado.nextLine();

        Asignatura asignatura = new Asignatura(nombre, hsSemanales);
        return asignatura;
    }

    public static int pedirDniAlumno () {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el dni: ");
        int dni = teclado.nextInt();
        teclado.nextLine();

        return dni;
    }

    public static String pedirNombreAsignatura() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la asignatura: ");
        String nombre = teclado.nextLine();

        return nombre;
    }

    public static Alumno encontrarAlumno(Set<Alumno> alumnos, Integer dni){
        Alumno a = null;
        for (Alumno alumno:alumnos) {
            if(dni.equals(alumno.getDni())){
               a = alumno;
            }
        }
        return a;
    }

    public static Asignatura encontrarAsignatura(Set<Asignatura> asignaturas, String nombre){
        Asignatura materia=null;
        for(Asignatura asignatura : asignaturas){
            if(nombre.equals(asignatura.getNombre())){
                materia = asignatura;
            }
        }
        return materia;
    }

}
