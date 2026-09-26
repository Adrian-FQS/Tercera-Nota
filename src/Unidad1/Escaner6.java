package unidad1;

import java.util.Scanner;

public class Escaner6 {
    public static void main(String[] args) {

        // Suma de números

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int n = sc.nextInt();

        int suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int num = sc.nextInt();

            suma += num;
        }

        System.out.println("\nLa suma total es: " + suma);

        sc.close();
    }
}