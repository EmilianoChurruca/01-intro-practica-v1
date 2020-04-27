package ar.edu.unahur.Practica1.Ejercicio3.Ejercicio3_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int op;
        Set<Empresa> empresas = new HashSet<>();
        String nombreEmpresa;

        System.out.print("seleccione una opción del Menú: \n1. Crear nueva empresa." +
                "\n2. Añadir empleado a empresa ya existente. " +
                "\n3. Listado de empresas. " +
                "\n4. Listado detallado de empresas y empleados" +
                "\n5. Salir\n");
        op = teclado.nextInt();
        teclado.nextLine();

        while (op != 5) {
            switch (op) {
                case 1:
                    empresas.add(crearEmpresa());
                    break;
                case 2:
                    nombreEmpresa = nombreEmpresa();  // pido nombre de la empresa a cargar el empleado
                    for (Empresa p : empresas) {
                        if (nombreEmpresa.equals(p.getNombre())) { // agrego empleado a la empresa
                            p.empleados.add(crearEmpleado());
                        }
                    }
                    break;
                case 3:
                    empresas.stream().forEach(e -> System.out.println(e));
                    break;
                case 4:
                    for (Empresa empresa : empresas ) {
                        System.out.println(empresa);
                        empresa.empleados.stream().forEach(empleado -> System.out.println(empleado));
                    }
                case 5:
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
            System.out.print("seleccione una opción del Menú: \n1. Crear nueva empresa." +
                    "\n2. Añadir empleado a empresa ya existente. " +
                    "\n3. Listado de empresas. " +
                    "\n4. Listado detallado de empresas y empleados" +
                    "\n5. Salir\n");
            op = teclado.nextInt();
            teclado.nextLine();
        }


    }

    public static Empresa crearEmpresa(){

        Scanner teclado = new Scanner(System.in);
        String nombre;
        String anio;
        System.out.print("Ingrese el nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Ingrese el año de fundación: ");
        anio = teclado.nextLine();
        Empresa empresa = new Empresa(nombre, anio);
        return empresa;
    }

    public static Empleado crearEmpleado(){
        Scanner teclado = new Scanner(System.in);
        String nombreEmpleado;
        String apellido;
        String fechaNAcimiento;
        String fechaContrato;
        System.out.print("Ingrese el nombre del Empleado: ");
        nombreEmpleado = teclado.nextLine();
        System.out.print("Ingrese el apellido: ");
        apellido = teclado.nextLine();
        System.out.print("Ingrese la fecha de nacimiento: ");
        fechaNAcimiento = teclado.nextLine();
        System.out.print("Ingrese la fecha de contrato: ");
        fechaContrato = teclado.nextLine();
        Empleado empleado = new Empleado(nombreEmpleado, apellido, fechaNAcimiento, fechaContrato);
        return empleado;

    }

    public static String nombreEmpresa(){
        String empresa;
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese el nombre de la empresa para agregar al empledado: ");
        empresa = teclado.nextLine();
        return empresa;
    }

}
