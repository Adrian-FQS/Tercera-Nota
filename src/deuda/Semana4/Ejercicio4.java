package deuda.Semana4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        //Cuenta bancaria

         Scanner sc = new Scanner(System.in);
         
         double saldo = 0;
         int movimientos = 0;
         int opcion;
         double valor; 

         do{
            System.out.println("\n--- MENU BANCARIO ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar ");
            System.out.println("4. Ver movimientos");
            System.out.println("5. Salir");
 
            opcion = sc.nextInt();
              
            switch (opcion) {
                case 1:
                   System.out.println("Saldo actual: $" + saldo);
                   break;

                  case 2:
                    System.out.print("Valor a depositar: $");
                    valor = sc.nextDouble();

                    saldo += valor;
                    movimientos++;

                    System.out.println("Deposito realizado.");
                    break;

                case 3:
                    System.out.print("Valor a retirar: $");
                    valor = sc.nextDouble();

                    if (valor <= saldo) {
                        saldo -= valor;
                        movimientos++;
                        System.out.println("Retiro realizado.");
                    } else {
                        System.out.println("Fondos insuficientes.");
                    }
                    break;

                case 4:
                    System.out.println("Numero de movimientos: " + movimientos);
                    break;

                case 5:
                    System.out.println("Gracias por usar el sistema.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

         }while(opcion != 5);

         sc.close();


    }
}
