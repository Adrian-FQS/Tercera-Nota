package deuda.Semana5;

import java.util.Scanner;

public class Ejercicio6 {

    // Cifrado César
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        System.out.print("Ingrese el desplazamiento: ");
        int desplazamiento = sc.nextInt();

        String resultado = "";

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            // Minúsculas
            if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + (c - 'a' + desplazamiento) % 26);
            }
            // Mayúsculas
            else if (c >= 'A' && c <= 'Z') {
                c = (char) ('A' + (c - 'A' + desplazamiento) % 26);
            }

            resultado += c;
        }

        System.out.println("Texto cifrado: " + resultado);

        sc.close();
    }
}
    
