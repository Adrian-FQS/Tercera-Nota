package unidad2.Ejerciicos parcial;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        
        //Kilómetros recorridos por vehículos

        
        System.out.print("Cantidad de vehículos: ");
        int n = sc.nextInt();

        double[] km = new double[n];
        int entre10y300 = 0;
        int mayorA300 = 0;
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Kilómetros del vehículo " + (i + 1) + ": ");
            double recorrido = sc.nextDouble();
            while (recorrido < 10 || recorrido > 500) {
                System.out.print("Valor inválido (10 a 500). Intenta de nuevo: ");
                recorrido = sc.nextDouble();
            }
            km[i] = recorrido;
        }

        for (int i = 0; i < n; i++) {
            total += km[i];
            if (km[i] <= 300) {
                entre10y300++;
            } else {
                mayorA300++;
            }
        }

        System.out.println("Vehículos entre 10 y 300 km: " + entre10y300);
        System.out.println("Vehículos con más de 300 km: " + mayorA300);
        System.out.printf("Total de kilómetros de la flota: %.1f km%n", total);

        sc.close();
    }
}