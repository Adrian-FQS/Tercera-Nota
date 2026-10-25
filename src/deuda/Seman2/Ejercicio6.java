package deuda.Seman2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        //Nómina simple

        Scanner leer = new Scanner(System.in);

        final double SALARIO_MINIMO = 1300000;

          System.out.print("Horas trabajadas: ");
        int horas = leer.nextInt();

        System.out.print("Valor por hora: ");
        double valorHora = leer.nextDouble();

        double salarioBruto;

        if (horas <= 40) {
            salarioBruto = horas * valorHora;
        } else {
            int horasExtra = horas - 40;

            salarioBruto = (40 * valorHora) +
                            (horasExtra * valorHora * 1.5);
        }

        double descuento = 0;

        if (salarioBruto > SALARIO_MINIMO) {
            descuento = salarioBruto * 0.08;
        }

        double salarioNeto = salarioBruto - descuento;

        System.out.println("Salario bruto: $" + salarioBruto);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Salario neto: $" + salarioNeto);

        leer.close();


    }
}
