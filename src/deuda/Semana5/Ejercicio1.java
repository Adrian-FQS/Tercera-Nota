package deuda.Semana5;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        // Reloj en segundos.

         Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de segundos: ");
        int segundosTotales = sc.nextInt();

        int dias = segundosTotales / 86400;
        segundosTotales %= 86400;

        int horas = segundosTotales / 3600;
        segundosTotales %= 3600;

        int minutos = segundosTotales / 60;
        int segundos = segundosTotales % 60;

        System.out.print("Equivale a: ");

        if (dias > 0) {
            System.out.print(dias + " día(s) ");
        }

        if (horas > 0) {
            System.out.print(horas + " hora(s) ");
        }

        if (minutos > 0) {
            System.out.print(minutos + " minuto(s) ");
        }

        if (segundos > 0) {
            System.out.print(segundos + " segundo(s)");
        }

        sc.close();
    }
}
    