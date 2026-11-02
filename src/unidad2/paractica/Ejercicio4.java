package unidad2.paractica;

public class Ejercicio4 {

    // Método que suma los divisores propios
    
    public static int sumaDivisores(int numero) {

        int suma = 0;

        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }

        return suma;
    }

    public static void main(String[] args) {

        System.out.println("Parejas de números amigos menores que 10000:");

        for (int a = 1; a < 10000; a++) {

            int b = sumaDivisores(a);

            if (b > a && b < 10000) {

                if (sumaDivisores(b) == a) {
                    System.out.println(a + " y " + b);
                }

            }
        }
    }
}