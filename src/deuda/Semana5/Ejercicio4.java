package deuda.Semana5;

public class Ejercicio4 {
      public static void main(String[] args) {
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
                    for (int j = 2; j < i; j++) {
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
    
}
