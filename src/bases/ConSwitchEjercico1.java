package bases;
 
import java.util.Scanner;

public class ConSwitchEjercico1 {

    public static void main(String[] args) {
        
         //. Comparar dos números

         Scanner sc = new Scanner(System.in);

         System.out.println("   Ingrse un numero");
         int num1 = sc.nextInt();

         System.out.print("Ingresa el segundo número: ");
         int num2 = sc.nextInt();

         if(num1 > num2) {
         System.out.println("EL numero es mayor");
         }

         else if(num1 == num2) {
          System.out.println("EL numero es igual");
         }

         else{
         System.out.println("EL numero 2 es mayor");
         }

         sc.close();

    }
}
