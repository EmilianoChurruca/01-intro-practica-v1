package ar.edu.unahur.Practica1.Ejercicio1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1_4 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        Persona persona;
        String nombre;
        String apellido;
        List<Persona> personas = new ArrayList<>();
        System.out.println("Ingrese la operación:  \n1: Agregar persona: \n0: Finalizar");
        int op = teclado.nextInt();
        teclado.nextLine();

        // for para ingresar las personas
       while (op!=0){
            if (op!=1){
                System.out.println("Operación inválida");
            } else {
                System.out.print("Ingrese su nombre: ");
                nombre = teclado.nextLine();
                System.out.print("Ingrese su apellido: ");
                apellido = teclado.nextLine();
                personas.add(new Persona(nombre, apellido));
            }
           System.out.println("Ingrese la operación:  \n1: Agregar persona: \n0: Finalizar");
           op = teclado.nextInt();
           teclado.nextLine();

        }

        // ingreso de letra a comparar
        System.out.println("ingrese la letra a comparar: ");
        String letra = teclado.nextLine();

        // impresión de los nombres que comienzan con la letra ingresada
        System.out.println("Los nombres que coinciden con la letra son: ");
        System.out.print("{");
       for (Persona p :  personas){
            if (p.toString().charAt(0) == letra.charAt(0) ){

                System.out.print( p.toString() );
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

