package bases;

public class ExtructurasLIstaEjercicios {
    public static void main(String[] args) {
        
       //Crea un Array con 5 valores e imprime su longitud

        int [] number ={10, 20 ,30 ,40,50} ;
       System.out.println(number.length);

       //Modifica uno de los valores e imprime el valor del índice...

        number[2] = 99; // Cambiamos el valor en la posición 2 del arreglo 'number'
        System.out.println("Valor en índice 2: " + number[2]);
    
    }
}
