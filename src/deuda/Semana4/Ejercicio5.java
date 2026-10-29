package deuda.Semana4;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {

        // Análisis de contraseña\
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una contraseña: ");
        String contrasena = sc.nextLine();

        int mayusculas = 0;
        int minusculas = 0;
        int digitos = 0;
        int simbolos = 0; 

      
        for (int i = 0; i < contrasena.length(); i++) {

            char c = contrasena.charAt(i);

            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                digitos++;
            } else {
                simbolos++;
            }
        }

        System.out.println("\nMayúsculas: " + mayusculas);
        System.out.println("Minúsculas: " + minusculas);
        System.out.println("Dígitos: " + digitos);
        System.out.println("Símbolos: " + simbolos);

      
        if (contrasena.length() >= 8 &&
            mayusculas > 0 &&
            minusculas > 0 &&
            digitos > 0 &&
            simbolos > 0) {

            System.out.println("La contraseña es SEGURA.");

        } else {

            System.out.println("La contraseña NO es segura.");
        }

        sc.close();
    }
}