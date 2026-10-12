package bases;

import java.util.Arrays;

public class EstructurasDeDatos {
    public static void main(String[] args) {

        // Arrays
        int[] number = new int[3];
        System.out.println(Arrays.toString(number));  // [0, 0, 0]

        String[] name = {"Adrian", "Felipe"};
        System.out.println(Arrays.toString(name));    // [Adrian, Felipe]

        // Acceso
        System.out.println(name[1]);     // Felipe
        System.out.println(number[0]);   // 0 (los int arrancan en 0)

        // Modificación
        number[0] = 1;
        number[1] = 10;
        System.out.println(number[0]);   // 1
        System.out.println(number[1]);   // 10

        // "Eliminar" datos
        name[1] = null;                  // posición válida (0 o 1)
        System.out.println(Arrays.toString(name));  // [Adrian, null]
        System.out.println(name.length); // 2
    }
}

