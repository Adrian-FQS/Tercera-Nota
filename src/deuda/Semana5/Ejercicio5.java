package deuda.Semana5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        //Ordenar y buscar
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Inicio: ");
        int inicio = sc.nextInt();

        System.out.print("Fin: ");
        int fin = sc.nextInt();

        if (inicio >= fin) {
            System.out.println("Error: inicio debe ser menor que fin.");
        } else {
            int cantidad = 0;
            int suma = 0;

            System.out.println("Números primos:");

            for (int i = inicio; i <= fin; i++) {
                boolean primo = true;

                if (i < 2) {
                    primo = false;
                } else {
                    // Optimización: j * j <= i (equivale a j <= Math.sqrt(i))
                    for (int j = 2; j * j <= i; j++) {
                        if (i % j == 0) {
                            primo = false;
                            break;
                        }
                    }
                }

                if (primo) {
                    System.out.println(i);
                    cantidad++;
                    suma += i;
                }
            }

            
            System.out.println("------------------------");
            System.out.println("Cantidad de primos encontrados: " + cantidad);
            System.out.println("Suma total de los primos: " + suma);
        } 

        sc.close(); 
    } 
