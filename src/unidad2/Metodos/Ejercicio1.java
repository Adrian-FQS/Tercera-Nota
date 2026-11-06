package unidad2.Metodos;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        //SueldosEmpleados

               int cantidad = leerCantidad(scanner);
        int[] sueldos = new int[cantidad];

        cargarSueldos(scanner, sueldos);

        int total = calcularTotal(sueldos);
        int entre100y300 = contarEnRango(sueldos, 100, 300);
        int mayorA300 = contarEnRango(sueldos, 301, 500);

        mostrarResultados(entre100y300, mayorA300, total);

        scanner.close();
    }

    public static int leerCantidad(Scanner scanner) {
        int cantidad = 0;

        do {
            System.out.print("Cantidad de empleados: ");
            cantidad = scanner.nextInt();

            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser mayor que cero.");
            }
        } while (cantidad <= 0);

        return cantidad;
    }

    public static boolean esSueldoValido(int sueldo) {
        return sueldo >= 100 && sueldo <= 500;
    }

    public static void cargarSueldos(Scanner scanner, int[] sueldos) {
        for (int i = 0; i < sueldos.length; i++) {
            do {
                System.out.print("Sueldo del empleado " + (i + 1) + ": $");
                sueldos[i] = scanner.nextInt();

                if (!esSueldoValido(sueldos[i])) {
                    System.out.println("Dato inválido. Ingrese un valor entre 100 y 500.");
                }
            } while (!esSueldoValido(sueldos[i]));
        }
    }

    public static int calcularTotal(int[] sueldos) {
        int total = 0;
        for (int i = 0; i < sueldos.length; i++) {
            total += sueldos[i];
        }
        return total;
    }

    public static int contarEnRango(int[] sueldos, int minimo, int maximo) {
        int contador = 0;
        for (int i = 0; i < sueldos.length; i++) {
            if (sueldos[i] >= minimo && sueldos[i] <= maximo) {
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarResultados(int entre100y300, int mayorA300, int total) {
        System.out.println("RESUMEN DE SUELDOS");
        System.out.println("Empleados que cobran entre $100 y $300: " + entre100y300);
        System.out.println("Empleados que cobran más de $300: " + mayorA300);
        System.out.println("Total gastado en sueldos: $" + total);
    }
}

