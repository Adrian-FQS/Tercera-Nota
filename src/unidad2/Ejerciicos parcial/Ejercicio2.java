package unidad2.jerciicosparcial;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Edades en un evento

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de personas: ");
        int n = sc.nextInt();

        int[] edades = new int[n];

        int sumaEdades = 0;
        int entre18y30 = 0;
        int mayores30 = 0;

        for (int i = 0; i < n; i++) {

            System.out.print("Ingrese su edad: ");
            int edad = sc.nextInt();

            edades[i] = edad;

            sumaEdades += edad;

            if (edad >= 18 && edad <= 30) {
                entre18y30++;
            }

            if (edad > 30) {
                mayores30++;
            }
        }

        System.out.println("Personas entre 18 y 30 años: " + entre18y30);
        System.out.println("Personas mayores de 30 años: " + mayores30);
        System.out.println("Suma total de edades: " + sumaEdades);

        sc.close();
    }
}


            
    