package bases;

public class Condicionales {
    public static void main(String[] args) {

        var age = 14;

        System.out.println(age >= 18);

        if (age > 18) {
            System.out.println("El usuario es mayor de edad");
        } else if (age == 18) {
            System.out.println("El usuario acaba de cumplir los 18");
        } else {
            System.out.println("El usuario es menor de edad");
        }

        // switch

        var day = 2;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;

            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Miercoles");
                break;

            default:
                System.out.println("No es Lunes, Martes o Miercoles");
        }
    }
}