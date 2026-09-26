package unidad1;

import java.util.Scanner;

public class Escaner5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        // Solicitar 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);

        sc.close();
    }
}