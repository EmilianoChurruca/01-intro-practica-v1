package ar.edu.unahur.Practica1.Ejercicio1;
import java.util.Scanner;

public class Ejercicio1_4 {
    public static void main(String args[]) {
        Scanner nom = new Scanner(System.in);
        Persona persona = new Persona();
        String nombre = " ";
        String apellido = " ";
        int cantidad = 0;
        System.out.println("ingrese la cantidad de estudiantes: ");
        cantidad = nom.nextInt();
        Persona[] array = new Persona[cantidad];

        // for para ingresar las personas
        for (int i=0; i < array.length; i++){
            System.out.print("Ingrese su nombre: ") ;
            nombre = nom.nextLine();
            System.out.print("Ingrese su apellido: ");
            apellido = nom.nextLine();
            array[i]=new Persona(nombre, apellido);
        }

        // ingreso de letra a comparar
        System.out.println("ingrese la letra a comparar: ");
        String letra = nom.nextLine();

        // impresión de los nombres que comienzan con la letra ingresada
        System.out.println("Los nombres que coinciden con la letra son: ");
        System.out.print("{");
       for (int j=0; j < array.length; j++){
            if (array[j].toString().charAt(0) == letra.charAt(0) ){

                System.out.print( array[j].toString() );
            }
        }
        System.out.print("}");
    }

}






  class  Persona {
        
       private String nombre;
       private String apellido;

        Persona(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
        }
        Persona(){};

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
      @Override
      public  String toString(){
          return nombre + " " + apellido + "; ";
      }

    }

