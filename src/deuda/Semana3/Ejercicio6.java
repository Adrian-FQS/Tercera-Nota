package deuda.Semana3;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        // Año bisiesto y días del mes.
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el mes (1-12): ");
        int mes = sc.nextInt();

        System.out.print("Ingrese el año: ");
        int anio = sc.nextInt();

        sc.close();

        if (mes < 1 || mes > 12 || anio <= 0) {
            System.out.println("Datos inválidos.");
            return;
        }

        boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

        int dias;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;

            case 2:
                dias = bisiesto ? 29 : 28;
                break;

            default:
                dias = 0;
        }

        System.out.println("El mes tiene " + dias + " días.");

        if (bisiesto) {
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("El año no es bisiesto.");
        }
    }
}