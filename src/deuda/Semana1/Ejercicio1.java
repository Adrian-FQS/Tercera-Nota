package deuda.Semana1;

import java.util.Scanner; 

public class Ejercicio1 {
    public static void main(String[] args) 

         //Positivo negativo cero
    
        {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: "); 
        int num3 = sc.nextInt();

        if (num3 > 0) {
            System.out.println("El numero es positivo");
        } else if (num3 < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero"); 
        }

        sc.close(); 
    }
}
