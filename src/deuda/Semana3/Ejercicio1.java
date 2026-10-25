package deuda.Semana3;

import java.util.Scanner;

public class Ejercicio1 {

    //Menú con switch

    static final double KM_A_MILLAS = 0.621371;
    static final double KG_A_LIBRAS = 2.20462;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Convertir km a millas");
            System.out.println("2. Convertir kg a libras");
            System.out.println("3. Convertir C a F");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa los kilómetros: ");
                    double km = sc.nextDouble();
                    System.out.printf("%.2f km = %.2f millas%n",
                            km, km * KM_A_MILLAS);
                    break;

                case 2:
                    System.out.print("Ingresa los kilogramos: ");
                    double kg = sc.nextDouble();
                    System.out.printf("%.2f kg = %.2f libras%n",
                            kg, kg * KG_A_LIBRAS);
                    break;

                case 3:
                    System.out.print("Ingresa los grados Celsius: ");
                    double c = sc.nextDouble();
                    double f = (c * 9.0 / 5.0) + 32;
                    System.out.printf("%.2f C = %.2f F%n", c, f);
                    break;

                case 4:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta nuevamente.");
            }

        } while (opcion != 4);

        sc.close();
    }
}