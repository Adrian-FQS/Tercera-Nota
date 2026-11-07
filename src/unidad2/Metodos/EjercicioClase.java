package unidad2.Metodos;

import java.lang.classfile.instruction.ReturnInstruction;
import java.util.Scanner;

public class EjercicioClase {
    public static void main(String[] args) {
        
        //Empresa menajeria

        Scanner sc = new Scanner(System.in);

           int n = ingresarCantidad(sc);
           int[] tiempos = new int[n];

           subirTiempos(sc, tiempos);

           int total = calcularTotal(tiempos);
           double promedio = calcularPromedio(tiempos);
           int mayor = buscarMayor(tiempos);
           int entre10y60 = contarEntre(tiempos, 10, 60);
           int mayores60 = contarMayoresA(tiempos, 60);

           mostrarResultados(entre10y60, mayores60, total, promedio, mayor);
         
            sc.close();

    }

    public static int entregas(Scanner sc) {

        int n = 0;

        do { 
            System.our.println("ingrese n de entregas");
            n = sc.nextInt();

            if( n <= 0){
                System.out.println("dato invalido");
            }

        } while ( n <= 0 );
        
        return n;
    }

    public static void tiempo( Scanner sc ,int[] tiempo) {

        for (int i = 0; i < tiempo.length; i++) {
             System.out.println("ingrese el tiempo"+(i + 1)+':');
             int tiempo = sc.nextInt();
            }

        While( tiempo < 10 || tiempo > 120){
            System.out.println("dato invalido");
            tiempo = sc.nextInt();
        }

        tiempo[i] = tiempo;

    }

    public static int totalMinutos(int[] tiempo) {
        
        int total = 0;

        for (int i = 0; i < tiempo.length; i++) {
            total += tiempo[i];
        }
        return total;
        
    }

    public static double  promedio(int[] tiempo ) {

        int total = calcularTotal(tiempos);
        return (double) total / tiempos.length

    }

    public static int buscarMayorTiempo (int[] tiempos) {

        int mayor = tiempo[0];
        
        for (int i = 0; i < tiempo.length; i++) {
            if(tiempos[i] > mayor){
                 mayor = tiempos[i];
            }
        }

         return mayor;

    }

    public static int entre(int[] tiempos, int minimo, int maximo){

        int contador = 0;

        for (int i = 0; i < tiempo.length; i++) {
            if( tiempo[i] >= 10 && tiempo[i] <= 60 ){
                contador++

        }
        
     return contador;
 
    }
    
    public static int contarMayoresA(int[] tiempos, int limite) {

        int conatdor = 0;

        for (int i = 0; i < tiempo.length; i++) {
            if(tiempo[i] > limite);{
            contador++;
            }
            
        }
    
        return  conatdor;
    
    }

    public static int mostrarResultados( entre10y60, int mayores60, int total, double promedio, int mayor {
         System.out.println("Entregas entre 10 y 60 minutos: " + entre10y60);
         System.out.println("Entregas de más de 60 minutos: " + mayores60);
          System.out.println("Total de minutos empleados: " + total);
         System.out.printf("Promedio por entrega: %.1f minutos%n", promedio);
         System.out.println("Mayor tiempo registrado: " + mayor + " minutos");
    }

}
