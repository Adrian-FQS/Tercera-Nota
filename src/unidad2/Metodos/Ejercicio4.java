package unidad2.Metodos;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        //Notas de estudiantes

          Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int n = ingresarCantidad(sc);
        double[] notas = new double[n];

        subirNotas(sc, notas);

        double suma = calcularSuma(notas);
        int entre3y4 = contarEntre(notas, 3.0, 4.0);
        int mayores4 = contarMayoresA(notas, 4.0);

        mostrarResultados(entre3y4, mayores4, suma);

        sc.close();
    }

    public static int ingresarCantidad(Scanner sc) {
        int n = 0;

        do {
            System.out.print("Ingrese la cantidad de estudiantes: ");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("La cantidad debe ser mayor que cero.");
            }
        } while (n <= 0);

        return n;
    }

    public static void subirNotas(Scanner sc, double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota del estudiante " + (i + 1) + ": ");
            double nota = sc.nextDouble();

            while (nota < 0 || nota > 5) {
                System.out.println("Dato inválido. Ingrese una nota entre 0 y 5.");
                System.out.print("Nota del estudiante " + (i + 1) + ": ");
                nota = sc.nextDouble();
            }

            notas[i] = nota;
        }
    }

    public static double calcularSuma(double[] notas) {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma;
    }

    public static int contarEntre(double[] notas, double minimo, double maximo) {
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= minimo && notas[i] <= maximo) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarMayoresA(double[] notas, double limite) {
        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > limite) {
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarResultados(int entre3y4, int mayores4, double suma) {
        System.out.println("\nRESULTADOS");
        System.out.println("Aprobaron entre 3.0 y 4.0: " + entre3y4);
        System.out.println("Aprobaron con más de 4.0: " + mayores4);
        System.out.printf("Suma total de las notas: %.1f%n", suma);
    }
}
