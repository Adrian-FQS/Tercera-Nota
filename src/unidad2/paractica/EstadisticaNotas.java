import java.util.Scanner;

public class EstadisticaNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de estudiantes: ");
        int n = sc.nextInt();

        double[] notas = new double[n];

        int aprobados = 0;
        int reprobados = 0;
        double suma = 0;
        double mayor = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota del estudiante " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            suma += notas[i];

            if (notas[i] >= 3.0) {
                aprobados++;
            } else {
                reprobados++;
            }

            if (notas[i] > mayor) {
                mayor = notas[i];
            }
        }

        double promedio = suma / n;

        System.out.println("\nRESULTADOS");
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);
        System.out.println("Promedio: " + promedio);
        System.out.println("Nota más alta: " + mayor);

        sc.close();
    }
}