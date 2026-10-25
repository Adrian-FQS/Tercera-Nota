package deuda.Seman2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        // Constantes del Índice de Masa Corporal (IMC)
        final double BAJO_PESO = 18.5;
        final double PESO_NORMAL = 25.0;
        final double SOBREPESO = 30.0;

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese su peso (kg): ");
        double peso = leer.nextDouble();

        System.out.print("Ingrese su altura (m): ");
        double altura = leer.nextDouble();

        // Cálculo del IMC: peso / altura^2
        double imc = peso / (altura * altura);

        System.out.printf("Su IMC es: %.2f\n", imc);

        // Clasificación
        if (imc < BAJO_PESO) {
            System.out.println("Clasificación: Bajo peso");
        } else if (imc < PESO_NORMAL) {
            System.out.println("Clasificación: Normal");
        } else if (imc < SOBREPESO) {
            System.out.println("Clasificación: Sobrepeso");
        } else {
            System.out.println("Clasificación: Obesidad");
        }

        leer.close();
    }
}