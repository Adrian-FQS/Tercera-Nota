package unidad2.Ejerciicos parcial;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        //Producción de una fábrica

        Scanner sc = new Scanner(System.in);

                System.out.print("Cantidad de operarios: ");
        int n = sc.nextInt();

        int[] produccion = new int[n];
        int entre10y100 = 0;
        int mayorA100 = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Producción del operario " + (i + 1) + ": ");
            int unidades = sc.nextInt();
            while (unidades < 10 || unidades > 200) {
                System.out.print("Producción inválida (10 a 200). Intenta de nuevo: ");
                unidades = sc.nextInt();
            }
            produccion[i] = unidades;
        }

        for (int i = 0; i < n; i++) {
            total += produccion[i];
            if (produccion[i] <= 100) {
                entre10y100++;
            } else {
                mayorA100++;
            }
        }

        System.out.println("Operarios entre 10 y 100 unidades: " + entre10y100);
        System.out.println("Operarios con más de 100 unidades: " + mayorA100);
        System.out.println("Producción total de la fábrica: " + total);

        sc.close();
    }
}


    