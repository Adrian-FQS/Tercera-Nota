package unidad2.Metodos;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        
        //Kilómetros recorridos por vehículos

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int n = ingresarCantidad(sc);
        double[] kilometros = new double[n];

        subirKilometros(sc, kilometros);

        double total = calcularTotal(kilometros);
        int entre10y300 = contarEntre(kilometros, 10, 300);
        int mayores300 = contarMayoresA(kilometros, 300);

        mostrarResultados(entre10y300, mayores300, total);

        sc.close();
    }

    public static int ingresarCantidad(Scanner sc) {
        int n = 0;

        do {
            System.out.print("Ingrese la cantidad de vehículos: ");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("La cantidad debe ser mayor que cero.");
            }
        } while (n <= 0);

        return n;
    }

    public static void subirKilometros(Scanner sc, double[] kilometros) {
        for (int i = 0; i < kilometros.length; i++) {
            System.out.print("Kilómetros del vehículo " + (i + 1) + ": ");
            double km = sc.nextDouble();

            while (km < 10 || km > 500) {
                System.out.println("Dato inválido. Ingrese un valor entre 10 y 500.");
                System.out.print("Kilómetros del vehículo " + (i + 1) + ": ");
                km = sc.nextDouble();
            }

            kilometros[i] = km;
        }
    }

    public static double calcularTotal(double[] kilometros) {
        double total = 0;
        for (int i = 0; i < kilometros.length; i++) {
            total += kilometros[i];
        }
        return total;
    }

    public static int contarEntre(double[] kilometros, double minimo, double maximo) {
        int contador = 0;
        for (int i = 0; i < kilometros.length; i++) {
            if (kilometros[i] >= minimo && kilometros[i] <= maximo) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarMayoresA(double[] kilometros, double limite) {
        int contador = 0;
        for (int i = 0; i < kilometros.length; i++) {
            if (kilometros[i] > limite) {
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarResultados(int entre10y300, int mayores300, double total) {
        System.out.println("\nRESULTADOS");
        System.out.println("Vehículos entre 10 y 300 km: " + entre10y300);
        System.out.println("Vehículos con más de 300 km: " + mayores300);
        System.out.printf("Total de kilómetros de la flota: %.1f km%n", total);
    }
}

  