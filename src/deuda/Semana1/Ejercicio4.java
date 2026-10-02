package deuda.Semana1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        // Sistema de notas (0 a 5.0)

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la nota (0-5.0): ");
        double nota = sc.nextDouble();

        if (nota >= 4.5 && nota <= 5.0) {
            System.out.println("Sobresaliente");

        } else if (nota >= 3.0 && nota < 4.5) {
            System.out.println("Aprobado");

        } else if (nota >= 0 && nota < 3.0) {
            System.out.println("Insuficiente");
            
        } else {
            System.out.println("Nota inválida");
        }

        sc.close(); 
}
