package ar.edu.unahur.Practica1.Ejercicio1;


public class Ejercicio1_7 {


    public static void main(String[] args) {
        Funciones matriz = new Funciones();
        int[][] m = new int[10][10];
        m = matriz.crearMatrizAleatoria(10,10);
        matriz.mostrarMatriz(m);
    }
}
