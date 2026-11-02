package unidad2.paractica;


import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        // Cambio de monedas
        
        Scanner sc = new Scanner(System.in);

        int[] denominaciones = {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100};

        System.out.println("ingrse un valor");
        int valor = sc.nextInt();

        for(int i =0;i < denominaciones.length; i++){
           int cantidad = valor / denominaciones[i];
           if (cantidad > 0) {
                System.out.println(denominaciones[i] + ": " + cantidad);
            }

            valor = valor % denominaciones[i];
        }

        sc.close();
    }
}



        