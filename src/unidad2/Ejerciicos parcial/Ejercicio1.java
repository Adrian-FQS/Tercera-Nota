package unidad2.jerciicos parcial;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        // Sueldos de empleados
        Scanner sc = new Scanner(System.in);

        // Constantes
        final int SUELDO_MINIMO = 100;
        final int SUELDO_MAXIMO = 500;
        final int LIMITE = 300;

        // Paso 1: cantidad de empleados
        System.out.println("Ingrese la cantidad de empleados:");
        int n = sc.nextInt();

        // Paso 2: arreglo
        int[] sueldos = new int[n];

        // Paso 3: carga con validación
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el sueldo del empleado " + (i + 1) + ":");
            sueldos[i] = sc.nextInt();

            while (sueldos[i] < SUELDO_MINIMO || sueldos[i] > SUELDO_MAXIMO) {
                System.out.println("Sueldo inválido, ingrese un valor entre "
                        + SUELDO_MINIMO + " y " + SUELDO_MAXIMO + ":");
                sueldos[i] = sc.nextInt();
            }
        }

        // Paso 4: acumuladores
        int contadorHasta300 = 0;
        int contadorMasDe300 = 0;
        int total = 0;

        // Paso 5: recorrido
        for (int i = 0; i < n; i++) {
            total = total + sueldos[i];

            if (sueldos[i] <= LIMITE) {
                contadorHasta300++;
            } else {
                contadorMasDe300++;
            }
        }

        // Paso 6: resultados
        System.out.println("Empleados que cobran entre $" + SUELDO_MINIMO + " y $" + LIMITE + ": " + contadorHasta300);
        System.out.println("Empleados que cobran más de $" + LIMITE + ": " + contadorMasDe300);
        System.out.println("Total gastado en sueldos: $" + total);

        sc.close();
    }
}



        


