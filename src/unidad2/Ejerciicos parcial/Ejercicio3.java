package unidad2.Ejerciicos parcial;

import java.util.Scanner;

public class Ejercicio3= {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de vendedores: ");
        int n = sc.nextInt();

        double[] ventas = new double[n];

        int entre50y500 = 0;
        int mayores500 = 0;
        double totalVendido = 0;

        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Ingrese la venta " + (i + 1) + ": ");
            ventas[i] = sc.nextDouble();
        }

        for (int i = 0; i < ventas.length; i++) {

            totalVendido += ventas[i];

            if (ventas[i] >= 50 && ventas[i] <= 500) {
                entre50y500++;
            }

            if (ventas[i] > 500) {
                mayores500++;
            }
        }

        System.out.println("\nRESULTADOS");
        System.out.println("Ventas entre $50 y $500: " + entre50y500);
        System.out.println("Ventas mayores a $500: " + mayores500);
        System.out.println("Total vendido: $" + totalVendido);

        sc.close();
    }
}