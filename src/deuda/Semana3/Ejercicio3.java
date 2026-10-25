package deuda.Semana3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        //Patrón de números
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de filas (N): ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {          // filas
            for (int j = 1; j <= i; j++) {      // columnas de cada fila
                System.out.print(j + " ");
            }
            System.out.println();               // salto de línea
        }

        sc.close();
    }
}