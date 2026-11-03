package unidad2.Ejerciicos parcial;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        //Peso de paquetes

        Scanner sc = new Scanner(System.in);

     
        System.out.print("Cantidad de paquetes: ");
        int n = sc.nextInt();

        double[] pesos = new double[n];
        int entre1y20 = 0;
        int mayorA20 = 0;
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Peso del paquete " + (i + 1) + " (kg): ");
            double peso = sc.nextDouble();
            while (peso < 1 || peso > 50) {
                System.out.print("Peso inválido (1 a 50). Intenta de nuevo: ");
                peso = sc.nextDouble();
            }
            pesos[i] = peso;
        }

        for (int i = 0; i < n; i++) {
            total += pesos[i];
            if (pesos[i] <= 20) {
                entre1y20++;
            } else {
                mayorA20++;
            }
        }

        System.out.println("Paquetes entre 1 y 20 kg: " + entre1y20);
        System.out.println("Paquetes de más de 20 kg: " + mayorA20);
        System.out.printf("Peso total transportado: %.1f kg%n", total);

        sc.close();
    }
}