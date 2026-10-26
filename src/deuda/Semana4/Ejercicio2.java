package deuda.Semana4;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        //Factura de servicios públicos
        
        Scanner sc = new Scanner(System.in);

        final double TARIFA_BASICA = 2500;
        final double CARGO_FIJO = 10000;
        final int LIMITE_BASICO = 20;
        final int LIMITE_SUBSIDIO = 15;
        final double PORCENTAJE_SUBSIDIO = 0.15;

        System.out.print("Ingrese el consumo de agua en m³: ");
        double consumo = sc.nextDouble();

        double costoConsumo;

        if (consumo <= LIMITE_BASICO) {
            costoConsumo = consumo * TARIFA_BASICA;
        } else {
            costoConsumo = (LIMITE_BASICO * TARIFA_BASICA)
                    + ((consumo - LIMITE_BASICO) * TARIFA_BASICA * 2);
        }

        double total = costoConsumo + CARGO_FIJO;

        if (consumo < LIMITE_SUBSIDIO) {
            total = total - (total * PORCENTAJE_SUBSIDIO);
            System.out.println("Se aplicó un subsidio del 15%.");
        }

        System.out.println("Valor total de la factura: $" + total);

        sc.close();
    }
}