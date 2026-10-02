package deuda.Semana1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        // Número en el rango de 1 a 100

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número entre 1 y 100: ");
        int number = sc.nextInt();

        if (number >= 1 && number <= 100) {
            System.out.println("El número está en el rango");
        } else {
            System.out.println("El número NO está en el rango");
        }

        sc.close(); 
    }
}
