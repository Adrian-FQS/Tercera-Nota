package unidad2.Metodos;

import java.util.Scanner

public class Ejercicio5 {
    public static void main(String[] args) {

        //Consumo de agua

        Scanner sc = new Scanner(System.in);

            int n = ingresarCantidad(sc);
        double[] consumos = new double[n];

        subirConsumos(sc, consumos);

        double total = calcularTotal(consumos);
        int entre1y50 = contarEntre(consumos, 1, 50);
        int mayores50 = contarMayoresA(consumos, 50);

        mostrarResultados(entre1y50, mayores50, total);

        sc.close();
    }

    public static int ingresarCantidad(Scanner sc) {
        int n = 0;

        do {
            System.out.print("Ingrese la cantidad de apartamentos: ");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("La cantidad debe ser mayor que cero.");
            }
        } while (n <= 0);

        return n;
    }

    public static void subirConsumos(Scanner sc, double[] consumos) {
        for (int i = 0; i < consumos.length; i++) {
            System.out.print("Consumo del apartamento " + (i + 1) + " (m3): ");
            double consumo = sc.nextDouble();

            while (consumo < 1 || consumo > 100) {
                System.out.println("Dato inválido. Ingrese un consumo entre 1 y 100.");
                System.out.print("Consumo del apartamento " + (i + 1) + " (m3): ");
                consumo = sc.nextDouble();
            }

            consumos[i] = consumo;
        }
    }

    public static double calcularTotal(double[] consumos) {
        double total = 0;
        for (int i = 0; i < consumos.length; i++) {
            total += consumos[i];
        }
        return total;
    }

    public static int contarEntre(double[] consumos, double minimo, double maximo) {
        int contador = 0;
        for (int i = 0; i < consumos.length; i++) {
            if (consumos[i] >= minimo && consumos[i] <= maximo) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarMayoresA(double[] consumos, double limite) {
        int contador = 0;
        for (int i = 0; i < consumos.length; i++) {
            if (consumos[i] > limite) {
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarResultados(int entre1y50, int mayores50, double total) {
        System.out.println("\nRESULTADOS");
        System.out.println("Apartamentos entre 1 y 50 m3: " + entre1y50);
        System.out.println("Apartamentos con más de 50 m3: " + mayores50);
        System.out.printf("Consumo total de la unidad: %.1f m3%n", total);
    }
}