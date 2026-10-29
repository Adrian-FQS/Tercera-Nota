package deuda.Semana4;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        //Estadísticas de ventas

        Scanner sc = new Scanner(System.in);

        int[]ventas = new int[8];

        int totalvendido =0;
        double promedio = 0;
        int mayor = 0;
        int posicion = 0;
        int superior= 0 ;
        int diasSinVentas = 0;

        for(int i = 0; i < ventas.length; i++) {
            System.out.println("Ingrese la venta del día " + (i + 1) + ": ");
            ventas [i] = sc.nextInt();

            totalvendido += ventas[i];

            if (ventas[i] > mayor) {
            mayor = ventas[i];
             posicion = i;
            }

            if (ventas[i] == 0) {
            diasSinVentas++;
            }

        }

        promedio = (double) totalvendido / ventas.length;

        for(int i = 0; i < ventas.length; i++) {
            if (ventas[i] > promedio) {
            superior++;
            }
        }

        System.out.println("Total vendido: " + totalvendido);
        System.out.println("Promedio: " + promedio);
        System.out.println("Mayor venta: " + mayor);
        System.out.println("Posicion: " + (posicion + 1));
        System.out.println("Dias sobre el promedio: " + superior);
        System.out.println("Dias sin ventas: " + diasSinVentas);

        sc.close();

    }
    
}
