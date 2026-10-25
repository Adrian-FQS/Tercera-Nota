package deuda.Seman2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        // A suma total y conteo de pares

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero:");
        int numero = sc.nextInt(); 

        int suma = 0;
        int pares = 0;
        
        int numeroOriginal = numero;

        while (numero > 0) {
           
            int digito = numero % 10;

            suma += digito;

            if (digito % 2 == 0) {
                pares++;
            }

            numero = numero / 10;
        }

        System.out.println("Numero ingresado: " + numeroOriginal);
        System.out.println("Suma de dígitos: " + suma);
        System.out.println("Cantidad de dígitos pares: " + pares);

        sc.close();
    }
}