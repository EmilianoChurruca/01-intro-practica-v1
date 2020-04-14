package ar.edu.unahur.Practica1.Ejercicio1;


import java.util.Random;

public class Ejercicio1_2 {

    public static void main(String args[]){

        Random random = new Random();
        Funciones vector = new Funciones();
        int longitud = 20;
        int[] v = new int[longitud];
        int valor = random.nextInt(20);  //valor a comparar
        System.out.println("El valor a comparar es: "+ valor);
        // genero y muestro el vector
        System.out.println("El vector es: ");
        v = vector.crearVector(longitud);
        vector.mostrarVector(v);
        System.out.println("Los valores mayores a " + valor +" son:");
        numerosmayores(valor, v);
    }


    public static void numerosmayores(int num, int[] vector){
        System.out.print("[");
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] > num){
                System.out.print(vector[i] + ", ");
            }
        }
        System.out.println("]");
    }

}

