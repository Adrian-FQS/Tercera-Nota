package unidad2.Metodos;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        
        // Recaudo de parqueaderos

          Scanner sc = new Scanner(System.in);

        int n = ingresarCantidad(sc);
        int[] pagos = new int[n];

        subirPagos(sc, pagos);

        long total = calcularTotal(pagos);
        int entre2y20 = contarEntre(pagos, 2000, 20000);
        int mayores20 = contarMayoresA(pagos, 20000);

        mostrarResultados(entre2y20, mayores20, total);

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

    public static void subirPagos(Scanner sc, int[] pagos) {
        for (int i = 0; i < pagos.length; i++) {
            System.out.print("Pago del vehículo " + (i + 1) + ": $");
            int pago = sc.nextInt();

            while (pago < 2000 || pago > 50000) {
                System.out.println("Dato inválido. Ingrese un valor entre 2000 y 50000.");
                System.out.print("Pago del vehículo " + (i + 1) + ": $");
                pago = sc.nextInt();
            }

            pagos[i] = pago;
        }
    }

    public static long calcularTotal(int[] pagos) {
        long total = 0;
        for (int i = 0; i < pagos.length; i++) {
            total += pagos[i];
        }
        return total;
    }

    public static int contarEntre(int[] pagos, int minimo, int maximo) {
        int contador = 0;
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] >= minimo && pagos[i] <= maximo) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarMayoresA(int[] pagos, int limite) {
        int contador = 0;
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] > limite) {
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarResultados(int entre2y20, int mayores20, long total) {
        System.out.println("\nRESULTADOS");
        System.out.println("Vehículos entre $2.000 y $20.000: " + entre2y20);
        System.out.println("Vehículos con más de $20.000: " + mayores20);
        System.out.println("Total recaudado por el parqueadero: $" + total);
    }
}