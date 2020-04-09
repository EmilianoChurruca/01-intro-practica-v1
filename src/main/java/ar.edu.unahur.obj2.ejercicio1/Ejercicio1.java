package ar.edu.unahur.obj2.ejercicio1;


import java.util.Random;

public class Ejercicio1 {

    public static void main(String args[]) {
        //int v[] = new int[];
       // int w[] = new int[];
       int[] v = crearVector(10);
        System.out.println("El vector es: ");
        mostrarVector(v);
        //ahora creo el vector invertido y lo muestro
       int[] w = invertirVector(v);
        System.out.println("El vector invertido es: ");
        mostrarVector(w);



    }

    // Función para crear vector dada su longitud
    public static int[] crearVector(int longitud){
        int vector[] = new int[longitud];
        Random random = new Random();  //creo el objeto random
        int num;

        for (int i = 0; i < vector.length; i++) {
            num = random.nextInt(20); //genero un entero random (0,20)
            vector[i] =num;
        }
        return vector;
    }

    // Función para mostrar vector
    public static void mostrarVector(int vector[]){
        int i;
            System.out.print("[");
        for (i = 0; i < vector.length-1; i++){
            System.out.print(vector[i]+", ");
        }
            System.out.println(vector[i] + "]");
    }

//Ejercicio 1 => invertir el orden de un vector de longitud 10

    public static int[] invertirVector(int[] vector){
        int vInvertido[] = new int[vector.length];
        int j=0;

        for (int i=vector.length-1 ; i>=0 ; i-- ){
            vInvertido[j]=vector[i];
            j++;
        }
        return vInvertido;
    }

}
