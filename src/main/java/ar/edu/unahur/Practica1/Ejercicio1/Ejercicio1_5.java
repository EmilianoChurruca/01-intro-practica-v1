package ar.edu.unahur.Practica1.Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1_5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String abecedario = "abcdefghijklmnñopqrstuvwxyz ";
        String texto;
        int cantidad = 0;
        List<LetrasEncontradas> letraHallada = new ArrayList<>();
        LetrasEncontradas letra;
        System.out.println("Ingrese el texto: ");
        texto = teclado.nextLine();


        for (int i=0; i<abecedario.length(); i++ ){
            for(int j=0; j<texto.length(); j++){

                if(abecedario.charAt(i) == texto.charAt(j)){
                    cantidad++;
                }
            }
            if (cantidad > 0){
                letraHallada.add(new LetrasEncontradas(abecedario.charAt(i),cantidad));
                cantidad = 0;
            }
        }


           letraHallada.stream().forEach(l-> System.out.println(l));

    }

  public static class  LetrasEncontradas{
       private char letra;
       private int cantidad;

        LetrasEncontradas(char letra, int cantidad) {
            this.letra = letra;
            this.cantidad = cantidad;
        }

        public void setLetra(char letra) {
            this.letra = letra;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

        @Override
        public String toString() {
            return  "{letra= " + letra +
                    ", cantidad= " + cantidad +
                    "}";
        }
    }
}