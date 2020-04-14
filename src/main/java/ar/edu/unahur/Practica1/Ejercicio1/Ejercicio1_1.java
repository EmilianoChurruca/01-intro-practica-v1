package ar.edu.unahur.Practica1.Ejercicio1;


public class Ejercicio1_1 {

    public static void main(String args[]) {
        Funciones vector = new Funciones();
        int longitud = 10;
        int[] v = new int[longitud];
        int[] w = new int[longitud];
        // Creo y muestro el vector
        v = vector.crearVector(longitud);
        System.out.println("El vector es: ");
        vector.mostrarVector(v);
        //ahora creo el vector invertido y lo muestro
        w = invertirVector(v);
        System.out.println("El vector invertido es: ");
        vector.mostrarVector(w);
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
