package deuda.Semana1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        // vocla consonante

          Scanner sc = new Scanner(System.in);

         System.out.println("Ingre una letra");

         char letra = sc.next().charAt(0);

          if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
         System.out.println("Es una vocal");
         } else {
          System.out.println("Es una consonante");
         } 
        
    }

}