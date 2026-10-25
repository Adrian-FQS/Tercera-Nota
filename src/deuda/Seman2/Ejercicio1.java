package deuda.Seman2;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int[] denominaciones = {
            50000, 20000, 10000, 5000,
            2000, 1000, 500, 200, 100
        };

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el valor en pesos: ");
        int valor = leer.nextInt();

        for (int i = 0; i < denominaciones.length; i++) {

            int cantidad = valor / denominaciones[i];
            valor = valor % denominaciones[i];

            if (cantidad > 0) {
                System.out.println(cantidad + " de $" + denominaciones[i]);
            }
        }

        leer.close();
    }
}