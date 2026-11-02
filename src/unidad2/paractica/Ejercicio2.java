package unidad2.paractica;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        // Índice de masa corporal

        Scanner sc = new Scanner(System.in);

        final double BAJO_PESO = 18.5;
        final double NORMAL = 25.0;
        final double SOBREPESO = 30.0;

        System.out.print("Ingrese su peso en kg: ");
        double peso = sc.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Su IMC es: " + imc);

        if (imc < BAJO_PESO) {
            System.out.println("Bajo peso");
        } else if (imc < NORMAL) {
            System.out.println("Peso normal");
        } else if (imc < SOBREPESO) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }

        sc.close();
    }
}