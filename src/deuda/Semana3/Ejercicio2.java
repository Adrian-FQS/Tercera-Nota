package deuda.Semana3;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        //Contador de vocales
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe una frase: ");
        String frase = sc.nextLine().toLowerCase();

        int vocales = 0;
        int consonantes = 0;
        int espacios = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c == ' ') {
                espacios++;
            } else if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú' || c == 'ü') {
                vocales++;
            } else if ((c >= 'a' && c <= 'z') || c == 'ñ') {
                consonantes++;
            }
        }

        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
        System.out.println("Espacios: " + espacios);

        sc.close();
    }
}