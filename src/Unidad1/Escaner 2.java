import java.util.Scanner;

public class Operadores2 {
    public static void main(String[] args) {

      //pide 2 nuemro y hag 5 operadores aricmennticos

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        double numero1 = sc.nextDouble();

        System.out.println("Introduce el segundo número: ");
        double numero2 = sc.nextDouble();

        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;
        double modulo = numero1 % numero2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

        sc.close();
    }
}
