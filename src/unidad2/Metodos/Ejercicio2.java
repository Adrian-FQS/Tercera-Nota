package unidad2.Metodos;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

    //Edades en un evento

        Scanner scanner = new Scanner(System.in);

             int cantidad = leerCantidad(scanner);
        int[] edades = new int[cantidad];

        cargarEdades(scanner, edades);

        int suma = calcularSuma(edades);
        int entre18y30 = contarEnRango(edades, 18, 30);
        int mayorA30 = contarEnRango(edades, 31, 120);

        mostrarResultados(entre18y30, mayorA30, suma);

        scanner.close();
    }

    public static int leerCantidad(Scanner scanner) {
        int cantidad = 0;

        do {
            System.out.print("Cantidad de personas: ");
            cantidad = scanner.nextInt();

            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser mayor que cero.");
            }
        } while (cantidad <= 0);

        return cantidad;
    }

    public static boolean esEdadValida(int edad) {
        return edad >= 0 && edad <= 120;
    }

    public static void cargarEdades(Scanner scanner, int[] edades) {
        for (int i = 0; i < edades.length; i++) {
            do {
                System.out.print("Edad de la persona " + (i + 1) + ": ");
                edades[i] = scanner.nextInt();

                if (!esEdadValida(edades[i])) {
                    System.out.println("Dato inválido. Ingrese una edad entre 0 y 120.");
                }
            } while (!esEdadValida(edades[i]));
        }
    }

    public static int calcularSuma(int[] edades) {
        int suma = 0;
        for (int i = 0; i < edades.length; i++) {
            suma += edades[i];
        }
        return suma;
    }

    public static int contarEnRango(int[] edades, int minimo, int maximo) {
        int contador = 0;
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] >= minimo && edades[i] <= maximo) {
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarResultados(int entre18y30, int mayorA30, int suma) {
        System.out.println("RESUMEN DEL EVENTO");
        System.out.println("Personas entre 18 y 30 años: " + entre18y30);
        System.out.println("Personas con más de 30 años: " + mayorA30);
        System.out.println("Suma total de las edades: " + suma);
    }
}















}
