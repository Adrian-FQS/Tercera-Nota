package deuda.Semana3;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        // Números perfectos y divisores
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = sc.nextInt();

        sc.close();

        if (numero <= 0) {
            System.out.println("Debe ingresar un número positivo.");
            return;
        }

        int sumaDivisoresPropios = 0;

        System.out.println("Divisores de " + numero + ":");

        for (int i = 1; i < numero; i++) { 
            if (numero % i == 0) {
                System.out.print(i + " ");
                sumaDivisoresPropios += i;
            }
        }

        System.out.println();
        System.out.println("Suma de divisores propios: " + sumaDivisoresPropios);

        if (sumaDivisoresPropios == numero) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }
    }
}