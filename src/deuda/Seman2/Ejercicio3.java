package deuda.Seman2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        //Triángulos

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el lado 1: ");
        double lado1 = leer.nextDouble();

        System.out.print("Ingrese el lado 2: ");
        double lado2 = leer.nextDouble();

        System.out.print("Ingrese el lado 3: ");
        double lado3 = leer.nextDouble();

        if (lado1 + lado2 > lado3 &&
            lado1 + lado3 > lado2 &&
            lado2 + lado3 > lado1) {

            System.out.println("Sí forman un triángulo.");

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triángulo equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triángulo isósceles");
            } else {
                System.out.println("Triángulo escaleno");
            }

        } else {
            System.out.println("No forman un triángulo.");
        }

        leer.close();
    }
}