package unidad2.Metodos;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        
        //Gastos de clientes en un restaurante

        Scanner sc = new Scanner(System.in);

        int n = ingresarCantidad(sc);
        int[] gastos = new int[n];
        
        subirGastos(sc, gastos);

        int entre20y100 = 
        int masde100 =
        long total =

        mostrarResultados(entre20y100, mayores100, total);

     sc.close();
    }

    public static int clientes(Scanner.sc) {

        int n = 0;
        do { 
            System.out.println("ingrse el n de clientes");
            n = sc.nextInt();

            if ( n <= 20) {
                System.out.println("numero ivalido");
            }
        } while ( n <= 0 );
        
     Return = n;

    }

    public static void gastos(Scanner sc, int[]gasto) {
         for (int i = 0; i < gastos.length; i++) {
        System.out.print("Gasto del cliente " + (i + 1) + ": $");
        int gasto = sc.nextInt();

        while (gasto < 20000 || gasto > 200000) {
            System.out.println("Dato inválido. Ingrese un valor entre 20000 y 200000.");
            gasto = sc.nextInt();
        }

        gastos[i] = gasto;
    }

    public static long calcularTotal(int[] gastos) {

        long total= 0;

        for (int i = 0; i < gastos.length; i++) {
            total += gastos[i];
        }

        return total;

    }

    public static int conteo (int[] gastos, int minimo, int maximo) {

         int contador = 0;

        for (int i = 0; i < n; i++) {
            gastos[i] >= minimo && gastos[i] <= maximo) {
            contador++;
        }

        return contador;
        
    }public static int contarMayoresA(int[] gastos, int limite) {

         int contador = 0;

        for (int i = 0; i < gastos.length; i++) {
            if (gastos[i] > limite) {
              contador++;
            }
        }

    return contador;

    }

    public static void mostrarResultados(int entre20y100, int mayores100, long total) {
    System.out.println("\nRESULTADOS");
    System.out.println("Clientes entre $20.000 y $100.000: " + entre20y100);
    System.out.println("Clientes con más de $100.000: " + mayores100);
    System.out.println("Total recibido por el restaurante: $" + total);
    }
 
}
