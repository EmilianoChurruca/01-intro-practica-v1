package ar.edu.unahur.Practica1.Ejercicio1;

import java.util.Random;
import java.util.Scanner;


public class Funciones {

    // Crear vector dada su longitud
    public int[] crearVector(int longitud) {
        int vector[] = new int[longitud];
        Random random = new Random();  //creo el objeto random
        int num;

        for (int i = 0; i < vector.length; i++) {
            num = random.nextInt(20); //genero un entero random (0,20)
            vector[i] = num;
        }
        return vector;
    }

    // Función para mostrar vector
    public void mostrarVector(int vector[]) {
        int i;
        System.out.print("[");
        for (i = 0; i < vector.length - 1; i++) {
            System.out.print(vector[i] + "; ");
        }
        System.out.println(vector[i] + "]");
    }


    // Crear matriz aleatoriamente dada su dimensión
    public int[][] crearMatrizAleatoria(int fila, int columna) {

        int[][] matriz = new int[fila][columna];
        Random random = new Random();  //creo el objeto random
        int i;
        int j;

        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++)
                matriz[i][j] = random.nextInt(100);
        }
        return matriz;
    }

    // Crear matriz aleatoriamente dada su dimensión
    public int[][] crearMatriz(int fila, int columna) {

        int[][] matriz = new int[fila][columna];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print("\n Ingrese el valor de la posición a" + (i + 1) + "," + (j + 1) + ": ");
                matriz[i][j] = teclado.nextInt();
            }
        }
        return matriz;
    }

    public void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("|");
        }
    }

    public void mostrarMatriz2(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
