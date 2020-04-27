package ar.edu.unahur.Practica1.Ejercicio3.Ejercicio3_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ticket {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Set<LineaTicket> ticket = new HashSet<>();
        String nombre;
        double precio;
        int cantidad;
        int opcion;
        int acumulador = 0;
        //LineaTicket lineaTicket;

        System.out.println("Ingrese la opción: \n0: Finalizar carga  \n1:Agregar producto");
        opcion = teclado.nextInt();
        teclado.nextLine();
        while (opcion != 0) {
            System.out.print("Ingrese el producto: ");
            nombre = teclado.nextLine();
            System.out.print("Ingrese el precio: ");
            precio = teclado.nextDouble();
            teclado.nextLine();
            System.out.print("Ingrese la cantidad: ");
            cantidad = teclado.nextInt();
            teclado.nextLine();
            ticket.add(new LineaTicket(nombre, precio, cantidad));
            acumulador += precio * cantidad;

            System.out.println("Ingrese la opción: \n0: Finalizar carga  \n1:Agregar producto");
            opcion = teclado.nextInt();
            teclado.nextLine();
        }
        ticket.stream().forEach(l -> System.out.println(l));
        System.out.println("Precio total:\t" + acumulador);
    }

}
