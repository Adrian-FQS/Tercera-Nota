package deuda.Semana5;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        //MCD y MCM

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();

        int num1 = a;
        int num2 = b;

        while (num2 != 0) {
            int residuo = num1 % num2;
            num1 = num2;
            num2 = residuo;
        }

        int mcd = num1;
        int mcm = (a * b) / mcd;

        System.out.println("MCD = " + mcd);
        System.out.println("MCM = " + mcm);

        sc.close();
    }
}
    

