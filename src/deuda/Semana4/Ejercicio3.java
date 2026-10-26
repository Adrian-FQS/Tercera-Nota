package deuda.Semana4;

import java.util.Scanner;

public class Ejercicio3 {

    //Estadística de notas

    public static void main(String[] args) {
        ejercicio7();
    }

    public static void ejercicio7() {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];

        double suma = 0;
        double notaMayor = 0;
        int posicionMayor = 0;
        int aprobados = 0;

        System.out.println("Ingrese las 10 notas:");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota del estudiante " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            suma += notas[i];

            if (i == 0 || notas[i] > notaMayor) {
                notaMayor = notas[i];
                posicionMayor = i;
            }

            if (notas[i] >= 3.0) {
                aprobados++;
            }
        }

        sc.close();

        double promedio = suma / notas.length;
        int reprobados = notas.length - aprobados;
        double porcentajeReprobados = (reprobados * 100.0) / notas.length;

        System.out.printf("%nPromedio del grupo: %.2f%n", promedio);
        System.out.printf("Nota más alta: %.2f%n", notaMayor);
        System.out.println("Posición de la nota más alta: " + (posicionMayor + 1));
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.printf("Porcentaje de reprobados: %.2f%%%n", porcentajeReprobados);
    }
}