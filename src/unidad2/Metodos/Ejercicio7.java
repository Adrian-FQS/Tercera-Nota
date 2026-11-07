package unidad2.Metodos;

import java.util.Scanner;

import.java.util.Scanner;

public class Ejerciico7 {
    public static void main(String[] args) {
        
        //7. Producción de una fábrica

           Scanner sc = new Scanner(System.in);

        int n = ingresarCantidad(sc);
        int[] produccion = new int[n];

        subirProduccion(sc, produccion);

        int total = calcularTotal(produccion);
        int entre10y100 = contarEntre(produccion, 10, 100);
        int mayores100 = contarMayoresA(produccion, 100);

        mostrarResultados(entre10y100, mayores100, total);

        sc.close();
    }

    public static int ingresarCantidad(Scanner sc) {
        int n = 0;

        do {
            System.out.print("Ingrese la cantidad de operarios: ");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("La cantidad debe ser mayor que cero.");
            }
        } while (n <= 0);

        return n;
    }

    public static void subirProduccion(Scanner sc, int[] produccion) {
        for (int i = 0; i < produccion.length; i++) {
            System.out.print("Producción del operario " + (i + 1) + ": ");
            int unidades = sc.nextInt();

            while (unidades < 10 || unidades > 200) {
                System.out.println("Dato inválido. Ingrese un valor entre 10 y 200.");
                System.out.print("Producción del operario " + (i + 1) + ": ");
                unidades = sc.nextInt();
            }

            produccion[i] = unidades;
        }
    }

    public static int calcularTotal(int[] produccion) {
        int total = 0;
        for (int i = 0; i < produccion.length; i++) {
            total += produccion[i];
        }
        return total;
    }

    public static int contarEntre(int[] produccion, int minimo, int maximo) {
        int contador = 0;
        for (int i = 0; i < produccion.length; i++) {
            if (produccion[i] >= minimo && produccion[i] <= maximo) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarMayoresA(int[] produccion, int limite) {
        int contador = 0;
        for (int i = 0; i < produccion.length; i++) {
            if (produccion[i] > limite) {
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarResultados(int entre10y100, int mayores100, int total) {
        System.out.println("\nRESULTADOS");
        System.out.println("Operarios entre 10 y 100 unidades: " + entre10y100);
        System.out.println("Operarios con más de 100 unidades: " + mayores100);
        System.out.println("Producción total de la fábrica: " + total);
    }
}



 
