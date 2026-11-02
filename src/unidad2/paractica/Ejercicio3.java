package unidad2.paractica;

import java.util.Scanner;

public class Ejercicio3 {

    // Método MCD
    
    public static int mcd(int a, int b) {

        int resultado = 1;

        for (int i = 1; i <= Math.min(a, b); i++) {

            if (a % i == 0 && b % i == 0) {
                resultado = i;
            }

        }

        return resultado;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numerador: ");
        int numerador = sc.nextInt();

        System.out.print("Ingrese el denominador: ");
        int denominador = sc.nextInt();

        int divisor = mcd(numerador, denominador);

        System.out.println("MCD: " + divisor);

        sc.close();
    }
}