package deuda.Semana4;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Conversión a binario

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = sc.nextInt();

        sc.close();

        if (numero <= 0) {
            System.out.println("Debe ingresar un número entero positivo.");
            return;
        }

        int temp = numero;
        String binario = "";
        int contadorUnos = 0;


        while (temp > 0) {
            int residuo = temp % 2; 
            
            if (residuo == 1) {
                contadorUnos++; 
            }
            
            binario = residuo + binario; 
            temp = temp / 2;            
        }

        // Resultados
        System.out.println("El número " + numero + " en binario es: " + binario);
        System.out.println("Cantidad de unos (1): " + contadorUnos);
    }
}