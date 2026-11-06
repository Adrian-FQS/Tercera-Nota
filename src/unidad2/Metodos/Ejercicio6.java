package unidad2.Metodos;

import java.util.Scanner;

impor java.util.Scanner
public class Ejercicio6 {
    public static void main(String[] args) {
        
        //Peso de paquetes

        Scanner sc = new Scanner(System.in);

            int n = ingresarCantidad(sc);
        double[] pesos = new double[n];

        subirPesos(sc, pesos);

        double total = calcularTotal(pesos);
        int entre1y20 = contarEntre(pesos, 1, 20);
        int mayores20 = contarMayoresA(pesos, 20);

        mostrarResultados(entre1y20, mayores20, total);

        sc.close();
    }

    public static int ingresarCantidad(Scanner sc) {
        int n = 0;

        do {
            System.out.print("Ingrese la cantidad de paquetes: ");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("La cantidad debe ser mayor que cero.");
            }
        } while (n <= 0);

        return n;
    }

    public static void subirPesos(Scanner sc, double[] pesos) {
        for (int i = 0; i < pesos.length; i++) {
            System.out.print("Peso del paquete " + (i + 1) + " (kg): ");
            double peso = sc.nextDouble();

            while (peso < 1 || peso > 50) {
                System.out.println("Dato inválido. Ingrese un peso entre 1 y 50.");
                System.out.print("Peso del paquete " + (i + 1) + " (kg): ");
                peso = sc.nextDouble();
            }

            pesos[i] = peso;
        }
    }

    public static double calcularTotal(double[] pesos) {
        double total = 0;
        for (int i = 0; i < pesos.length; i++) {
            total += pesos[i];
        }
        return total;
    }

    public static int contarEntre(double[] pesos, double minimo, double maximo) {
        int contador = 0;
        for (int i = 0; i < pesos.length; i++) {
            if (pesos[i] >= minimo && pesos[i] <= maximo) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarMayoresA(double[] pesos, double limite) {
        int contador = 0;
        for (int i = 0; i < pesos.length; i++) {
            if (pesos[i] > limite) {
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarResultados(int entre1y20, int mayores20, double total) {
        System.out.println("\nRESULTADOS");
        System.out.println("Paquetes entre 1 y 20 kg: " + entre1y20);
        System.out.println("Paquetes de más de 20 kg: " + mayores20);
        System.out.printf("Peso total transportado: %.1f kg%n", total);
    }
}