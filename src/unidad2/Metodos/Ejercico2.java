package unidad2.Metodos;

import java.util.Scanner;

public class Ejercicio2-5 {
        public static void main(String[] args) {

        // Edades en un evento

        Scanner sc = new Scanner(System.in);
100708
        int n = leerCantidad(sc);
        int[] edades = new int[n];

        cargarEdades(sc, edades);

        int sumaEdades = calcularSuma(edades);
        int entre18y30 = contarEnRango(edades, 18, 30);
        int mayores30 = contarEnRango(edades, 31, Integer.MAX_VALUE);

        mostrarResultados(entre18y30, mayores30, sumaEdades);

        sc.close();
    }

    public static int leerCantidad(Scanner sc) {
        System.out.print("Ingrese el número de personas: ");
        int n = sc.nextInt();
        return n;
    }

    public static void cargarEdades(Scanner sc, int[] edades) {
        for (int i = 0; i < edades.length; i++) {
            System.out.print("Ingrese su edad: ");
            edades[i] = sc.nextInt();
        }
    }

    public static int calcularSuma(int[] edades) {
        int sumaEdades = 0;
        for (int i = 0; i < edades.length; i++) {
            sumaEdades += edades[i];
        }
        return sumaEdades;
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

    public static void mostrarResultados(int entre18y30, int mayores30, int sumaEdades) {
        System.out.println("Personas entre 18 y 30 años: " + entre18y30);
        System.out.println("Personas mayores de 30 años: " + mayores30);
        System.out.println("Suma total de edades: " + sumaEdades);
    }
}
  