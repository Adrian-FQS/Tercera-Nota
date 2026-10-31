package deuda.Semana5;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        // Juego de adivinar el número
        
        Scanner sc = new Scanner(System.in);

        String respuesta;

        do {
            int numeroSecreto = (int) (Math.random() * 100) + 1;

            boolean gano = false;
            int intentos = 0;

            System.out.println("=== ADIVINA EL NÚMERO ===");
            System.out.println("Debes adivinar un número entre 1 y 100.");
            System.out.println("Tienes 7 intentos.");

            while (intentos < 7 && !gano) {
                System.out.print("Intento " + (intentos + 1) + ": ");
                int numero = sc.nextInt();

                intentos++;

                if (numero == numeroSecreto) {
                    gano = true;
                } else if (numero > numeroSecreto) {
                    System.out.println("Muy alto.");
                } else {
                    System.out.println("Muy bajo.");
                }
            }

            if (gano) {
                System.out.println("¡Ganaste!");
                System.out.println("Usaste " + intentos + " intento(s).");
            } else {
                System.out.println("Perdiste.");
                System.out.println("El número era: " + numeroSecreto);
                System.out.println("Usaste los 7 intentos.");
            }

            System.out.print("¿Desea jugar otra vez? (s/n): ");
            respuesta = sc.next();

        } while (respuesta.equalsIgnoreCase("s"));

        System.out.println("Gracias por jugar.");
        sc.close();
    }
}
    

