package deuda.Seman2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        // Número invertido y palíndromo.
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int numero = leer.nextInt(); // Corregido: sc -> leer

        int original = numero;
        int invertido = 0;

        while (numero > 0) {
            int digito = numero % 10;

            invertido = invertido * 10 + digito;

            numero = numero / 10;
        }

        System.out.println("Número invertido: " + invertido);

        if (original == invertido) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }

        leer.close();
    } // Se eliminó la llave extra que sobraba
}