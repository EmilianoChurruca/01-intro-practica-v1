package ar.edu.unahur.Practica1.Ejercicio1;

import java.util.Scanner;

public class Ejercicio1_6 {


   public static void main(String[] args) {
       int[][] mat = new int[0][0];
       Funciones matriz = new Funciones();
       Scanner teclado = new Scanner(System.in);
       System.out.print("ingrese la cantidad de filas: ");
       int fila = teclado.nextInt();
       System.out.print("Ingrese la cantidad de columnas: ");
       int columna = teclado.nextInt();
       mat = matriz.crearMatriz(fila, columna);
       matriz.mostrarMatriz2(mat);

   }


}





