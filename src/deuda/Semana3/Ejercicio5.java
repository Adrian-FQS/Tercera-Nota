package deuda.Semana3;

import java.util.Scanner;

public class Ejercicio5 {
    
    // calificacion final de notas
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicio2();
    }

    public static void ejercicio2() {
        final double NOTA1 = 0.30;
        final double NOTA2 = 0.30;
        final double NOTA3 = 0.40;

        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();

        System.out.print("Nota 3: ");
        double n3 = sc.nextDouble();

        double definitiva = (n1 * NOTA1) + (n2 * NOTA2) + (n3 * NOTA3);

        System.out.printf("Nota definitiva: %.2f%n", definitiva);

        if (definitiva < 3.0) {
            System.out.println("Reprobado");
        } else if (definitiva < 4.0) {
            System.out.println("Aceptable");
        } else if (definitiva <= 4.5) {
            System.out.println("Bueno");
        } else {
            System.out.println("Sobresaliente");
        }
    }
}