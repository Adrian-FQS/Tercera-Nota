package unidad1;

public class ejercicio5 {
    public static void main(String[] args) throws Exception {
        
        int[][] matriz = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int longitudFilas = matriz.length;
        int longitudColumnas = matriz[0].length;

        // Mostrar que es una matriz 3x3
        System.out.println("La matriz es de " + longitudFilas + "x" + longitudColumnas);

        // Imprimir la matriz como tabla
        for (int i = 0; i < longitudFilas; i++) {
            for (int j = 0; j < longitudColumnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // salto de línea al terminar cada fila
        }
    }
}

