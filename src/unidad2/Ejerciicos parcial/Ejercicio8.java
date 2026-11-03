package unidad2.Ejerciicos parcial;

impor java.util.Scanner;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        
        //Gastos de clientes en un restaurante

        Scanner sc = new Scanner(System.in);

             System.out.print("Cantidad de clientes: ");
        int n = sc.nextInt();

        int[] gastos = new int[n];
        int entre20y100 = 0;
        int mayorA100 = 0;
        long total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Gasto del cliente " + (i + 1) + ": $");
            int gasto = sc.nextInt();
            while (gasto < 20000 || gasto > 200000) {
                System.out.print("Gasto inválido (20000 a 200000). Intenta de nuevo: $");
                gasto = sc.nextInt();
            }
            gastos[i] = gasto;
        }

        for (int i = 0; i < n; i++) {
            total += gastos[i];
            if (gastos[i] <= 100000) {
                entre20y100++;
            } else {
                mayorA100++;
            }
        }

        System.out.println("Clientes entre $20.000 y $100.000: " + entre20y100);
        System.out.println("Clientes con más de $100.000: " + mayorA100);
        System.out.println("Total recibido por el restaurante: $" + total);

        sc.close();
    }
}
