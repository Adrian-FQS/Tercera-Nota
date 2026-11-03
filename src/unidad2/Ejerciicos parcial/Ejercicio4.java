package unidad2.Ejerciicos

import java.util.Scanner;

parcial;

impro java.util.Scanner

public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        //Notas de estudiantes

        System.out.print("Cantidad de estudiantes: ");
        int n = sc.nextInt();

        double[] notas = new double[n];
        int entre3y4 = 0;
        int mayorA4 = 0;
        double suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Nota del estudiante " + (i + 1) + ": ");
            double nota = sc.nextDouble();
            while (nota < 0 || nota > 5) {
                System.out.print("Nota inválida (0 a 5). Intenta de nuevo: ");
                nota = sc.nextDouble();
            }
            notas[i] = nota;
        }

        for (int i = 0; i < n; i++) {
            suma += notas[i];
            if (notas[i] >= 3.0 && notas[i] <= 4.0) {
                entre3y4++;
            } else if (notas[i] > 4.0) {
                mayorA4++;
            }
        }

        System.out.println("Aprobaron entre 3.0 y 4.0: " + entre3y4);
        System.out.println("Aprobaron con más de 4.0: " + mayorA4);
        System.out.printf("Suma total de notas: %.1f%n", suma);

        sc.close();
    }
}