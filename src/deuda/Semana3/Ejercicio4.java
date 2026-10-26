package deuda.Semana3;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        //Cajero con billetes limitados

        ejercicio1(50000);
    }

    static void ejercicio1(int valor) {
        int[] denominaciones = {100000, 50000, 20000, 10000};
        int[] inventario = {5, 10, 10, 20};

        if (valor <= 0 || valor % 10000 != 0) {
            System.out.println("El valor debe ser mayor que cero y múltiplo de $10.000.");
            return;
        }

        int[] tempInventario = inventario.clone();
        int[] aEntregar = new int[denominaciones.length];
        int valorRestante = valor;

        for (int i = 0; i < denominaciones.length; i++) {
            aEntregar[i] = Math.min(valorRestante / denominaciones[i], tempInventario[i]);
            valorRestante -= aEntregar[i] * denominaciones[i];
            tempInventario[i] -= aEntregar[i];
        }

        if (valorRestante > 0) {
            System.out.println("No se pudo completar el retiro. Falta: $" + valorRestante);
        } else {
            System.arraycopy(tempInventario, 0, inventario, 0, inventario.length);
            System.out.println("Retiro completo. Entregar:");
            for (int i = 0; i < denominaciones.length; i++) {
                if (aEntregar[i] > 0) {
                    System.out.println("- " + aEntregar[i] + " billete(s) de $" + denominaciones[i]);
                }
            }
        }
    }
}