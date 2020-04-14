package ar.edu.unahur.Practica1.Ejercicio1;

import java.util.Random;

public class Ejercicio1_3 {
    public static void main(String args[]) {
        int[] dia = new int[24];
        float acumulador=0;
        float promedio;

        dia = crearVector(24);
        System.out.println("El resumen del día es ");
        mostrarVector(dia);
       // Pongo el primer valor del array como máximo y mínimo
        int maximo = dia[0];
        int minimo = dia[0];
        //Recorro el vector para sacar el valor máx, mín y promedio
        for (int i=0; i< dia.length;i++){
            acumulador += dia[i];
            if(dia[i]>maximo){
                maximo = dia[i];
            }else
            if(dia[i] < minimo) {
                minimo = dia[i];
            }
        }
        promedio = acumulador/dia.length;
        System.out.println("El pomedio del día es: " + promedio);
        System.out.println("La temperatura mas alta es: " + maximo);
        System.out.println("La temperatura mas baja es: " + minimo);
    }

    public static int[] crearVector(int longitud){
        int vector[] = new int[longitud];
        Random random = new Random();  //creo el objeto random
        int num;

        for (int i = 0; i < vector.length; i++) {
            num = random.nextInt(30); //genero un entero random (0,20)
            vector[i] =num;
        }
        return vector;
    }
    public static void mostrarVector(int vector[]){
        int i;

        for (i = 0; i < vector.length; i++) {
            System.out.print("A la hora " + i + "  ");
            for (int j = 0; j < vector[i] ; j++) {
                System.out.print("*");

            }
            System.out.println("  " + vector[i] + "°");
        }
    }
}
