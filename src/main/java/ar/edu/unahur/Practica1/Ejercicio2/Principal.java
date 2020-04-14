package ar.edu.unahur.Practica1.Ejercicio2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre = " ";
        String apellido = " ";
        int dni = 0;
        String mail = " ";
        double sueldobase = 0;
        int hsExtra = 0;
        int hsMes = 0;
        double porcentaje = 0;
        double totalVenta = 0;

        int operacion;
        Set<Persona> personas = new HashSet<Persona>();

        System.out.println("Menú de opciones: \n1: Agregar Vendedor \n2: Agregar Administrativo " +
                "\n0: Terminar de cargar \nIngrese su opción: ");
        operacion = teclado.nextInt();
        while (operacion != 0) {
            if (operacion != 1 & operacion != 2) {
                System.out.println("La opción elegida no es válida");
            } else {
                System.out.print("Ingrese su dni: ");
                dni = teclado.nextInt();
                System.out.print("\nIngrese su Nombre: ");
                nombre = teclado.next();
                System.out.print("\nIngrese su apellido: ");
                apellido = teclado.next();
                System.out.print("\nIngrese su Mail: ");
                mail = teclado.next();
                System.out.print("\nIngrese su Sueldo: ");
                sueldobase = teclado.nextDouble();
                if (operacion == 1) {
                    System.out.print("\nIngrese su Porcentaje de comisión: ");
                    porcentaje = teclado.nextDouble();
                    System.out.print("\nIngrese el total de ventas: ");
                    totalVenta = teclado.nextDouble();
                    personas.add(new Vendedor(dni, nombre, apellido, mail, sueldobase, porcentaje, totalVenta));
                } else if (operacion == 2) {
                    System.out.print("\nIngrese sus horas extra: ");
                    hsExtra = teclado.nextInt();
                    System.out.print("\nIngrese el total de horas al mes: ");
                    hsMes = teclado.nextInt();
                    personas.add(new Administrativo(dni, nombre, apellido, mail, sueldobase, hsExtra, hsMes));
                }
            }

                System.out.println("Menú de opciones: \n1: Agregar Vendedor \n2: Agregar Administrativo " +
                        "\n0: Terminar de cargar \nIngrese su opción: ");
                operacion = teclado.nextInt();
            }

        for (Persona lista : personas)
             {
                 System.out.println(lista.mostrar());
        }

        }

}
