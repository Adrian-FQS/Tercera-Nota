package unidad2.Ejerciicos parcial;

impor java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        //Recaudo de parqueaderos

        
        System.out.print("Cantidad de vehículos: ");
        int n = sc.nextInt();

        int[] pagos = new int[n];
        int entre2y20 = 0;
        int mayorA20 = 0;
        long total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Pago del vehículo " + (i + 1) + ": $");
            int pago = sc.nextInt();
            while (pago < 2000 || pago > 50000) {
                System.out.print("Pago inválido (2000 a 50000). Intenta de nuevo: $");
                pago = sc.nextInt();
            }
            pagos[i] = pago;
        }

        for (int i = 0; i < n; i++) {
            total += pagos[i];
            if (pagos[i] <= 20000) {
                entre2y20++;
            } else {
                mayorA20++;
            }
        }

        System.out.println("Vehículos entre $2.000 y $20.000: " + entre2y20);
        System.out.println("Vehículos con más de $20.000: " + mayorA20);
        System.out.println("Total recaudado por el parqueadero: $" + total);

        sc.close();
    }
}