package unidad2.Metodos

import java.util import java.util.Scanner;
Scanner;

public class Ejerciico3 {
    public static void main(String[] args) {
        
        //Ventas de una tienda

    
        Scanner sc = new Scanner(System.in);

        int n = leerCantidad(sc);
        int[] ventas = new int[n];

        cargarVentas(sc, ventas);

        int total = calcularTotal(ventas);
        int entre50y500 = contarEnRango(ventas, 50, 500);
        int mayores500 = contarEnRango(ventas, 501, 1000);

        mostrarResultados(entre50y500, mayores500, total);

        sc.close();
    }

    public static int leerCantidad(Scanner sc) {
        int n = 0;

        do {
            System.out.print("Ingrese el número de vendedores: ");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("La cantidad debe ser mayor que cero.");
            }
        } while (n <= 0);

        return n;
    }

    public static boolean esVentaValida(int venta) {
        return venta >= 50 && venta <= 1000;
    }

    public static void cargarVentas(Scanner sc, int[] ventas) {
        for (int i = 0; i < ventas.length; i++) {
            do {
                System.out.print("Venta del vendedor " + (i + 1) + ": $");
                ventas[i] = sc.nextInt();

                if (!esVentaValida(ventas[i])) {
                    System.out.println("Dato inválido. Ingrese un valor entre 50 y 1000.");
                }
            } while (!esVentaValida(ventas[i]));
        }
    }

    public static int calcularTotal(int[] ventas) {
        int total = 0;
        for (int i = 0; i < ventas.length; i++) {
            total += ventas[i];
        }
        return total;
    }

    public static int contarEnRango(int[] ventas, int minimo, int maximo) {
        int contador = 0;
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] >= minimo && ventas[i] <= maximo) {
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarResultados(int entre50y500, int mayores500, int total) {
        System.out.println("Ventas entre $50 y $500: " + entre50y500);
        System.out.println("Ventas mayores a $500: " + mayores500);
        System.out.println("Total vendido por la tienda: $" + total);
    }
}









}
