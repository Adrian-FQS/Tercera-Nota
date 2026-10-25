package deuda.Seman2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        // Estadística de temperaturas

         Scanner leer = new Scanner(System.in);
         double[] temperaturas = new double[7];

        double suma = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Ingrese la temperatura del día " + (i + 1) + ": ");
            temperaturas[i] = leer.nextDouble();

            suma += temperaturas[i];
        }

        double promedio = suma / temperaturas.length;

        int sobrePromedio = 0;

        double masFria = temperaturas[0];
        int diaMasFrio = 1;

        for (int i = 0; i < temperaturas.length; i++) {

            if (temperaturas[i] > promedio) {
                sobrePromedio++;
            }

            if (temperaturas[i] < masFria) {
                masFria = temperaturas[i];
                diaMasFrio = i + 1;
            }
        }

        System.out.println("Promedio: " + promedio);
        System.out.println("Días sobre el promedio: " + sobrePromedio);
        System.out.println("Día más frío: " + diaMasFrio);
        System.out.println("Temperatura más baja: " + masFria);

        leer.close();
    }
}


  
