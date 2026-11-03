package unidad2.Ejerciicos parcial;


import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        //Consumo de agua

        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de apartamentos: ");
        int n = sc.nextInt();

        double[] consumos = new double[n];
        int entre1y50 = 0;
        int mayorA50 = 0;
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Consumo del apartamento " + (i + 1) + ": ");
            double consumo = sc.nextDouble();
            while (consumo < 1 || consumo > 100) {
                System.out.print("Consumo inválido (1 a 100). Intenta de nuevo: ");
                consumo = sc.nextDouble();
            }
            consumos[i] = consumo;
        }

        for (int i = 0; i < n; i++) {
            total += consumos[i];
            if (consumos[i] <= 50) {
                entre1y50++;
            } else {
                mayorA50++;
            }
        }

        System.out.println("Consumieron entre 1 y 50 m3: " + entre1y50);
        System.out.println("Consumieron más de 50 m3: " + mayorA50);
        System.out.printf("Consumo total de la unidad: %.1f m3%n", total);

        sc.close();
    }
}

