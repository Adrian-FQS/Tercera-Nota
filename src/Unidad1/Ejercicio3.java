package Unidad1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        
        Scanner leer = new Scanner(System.in);
        byte[] edades = new byte[5];

        // Pedir las edades
        for (int i = 0; i < edades.length; i++) {3
            System.out.println("Ingrese la edad de la persona " + (i + 1) + " : ");
            edades[i] = leer.nextByte();
        }

        // Mostrar las posiciones y valores
        int longitudEdades = edades.length;
        for (int i = 0; i < longitudEdades; i++) {
            System.out.println("Posición " + i + ": " + edades[i]);
        }

        leer.close();
    }
}
