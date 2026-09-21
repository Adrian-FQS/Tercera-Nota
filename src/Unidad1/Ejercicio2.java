package unidad1;

public class Ejercicio2 {
    public static void main(String[] args) {

        // Mensaje inicial
        System.out.println("Hola Adrian, este es mi primer ejercicio en Java");

        // Notas de estudiantes
        float notaestudiante1 = 4.2f;
        float notaestudiante2 = 3.5f;
        float notaestudiante3 = 2.9f;
        float notaestudiante4 = 3.7f;
        float notaestudiante5 = 3.0f;

        // Arreglo de notas
        float[] notas = new float[5];
        notas[0] = notaestudiante1;
        notas[1] = notaestudiante2;
        notas[2] = notaestudiante3;
        notas[3] = notaestudiante4;
        notas[4] = notaestudiante5;

        System.out.println("Notas de los estudiantes:");
        for (float nota : notas) {
            System.out.println(nota);
        }

        // Arreglo de números
        int[] numeros = {18, 22, 43, 55, 31};
        System.out.println("Número en posición 4: " + numeros[4]);
    }
}
