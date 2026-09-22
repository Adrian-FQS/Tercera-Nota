package unidad1;

import java.util.Scanner;

public class Escaner3 {
    public static void main(String[] args) {
        
        // Crear objeto Scanner
        Scanner sc = new Scanner(System.in);

        String nombre;
        int edad;
        double altura;

        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();

        System.out.print("Ingrese su altura en metros: ");
        altura = sc.nextDouble();

        // Mostrar mensaje personalizado
        System.out.println("Hola " + nombre + 
                           ", tienes " + edad + " años" + 
                           " y mides " + altura + " metros.");

        sc.close();
    }
}





