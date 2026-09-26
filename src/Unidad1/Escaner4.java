package unidad1;

import java.util.Scanner;

public class Escaner4 {
    public static void main(String[] args) {

          //Positivos, negativos y ceros


      Scanner sc = new Scanner(System.in);

       int positivo = 0;
       int negativo = 0;
       int cero = 0;

             for (int i = 1; i <= 10; i++) {
              System.out.print("ingrese el numero " + i + ": ");
             int num = sc.nextInt();

             if (num > 0) {
                positivo++;
             } else if (num < 0) {
                negativo++;
             } else {
                cero++;
             }
            }

        System.out.println("\nResultados:");
        System.out.println("Positivos: " + positivo);
        System.out.println("Negativos: " + negativo);
        System.out.println("Ceros: " + cero);

        sc.close();
    }
}
