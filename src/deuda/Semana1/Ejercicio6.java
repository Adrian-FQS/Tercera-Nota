package deuda.Semana1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        // Entrada a la película

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        System.out.print("¿Estas acompañado por un adulto? (true/false): ");
        boolean acompanado = sc.nextBoolean();

        if (edad >= 13 || (edad < 13 && acompanado)) {
            System.out.println("Puede entrar a la pelicula");
        } else {
            System.out.println("No puede entrar a la pelicula");
        }

        sc.close(); 
    }
}
