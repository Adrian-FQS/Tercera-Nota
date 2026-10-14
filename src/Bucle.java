public class Bucle {
    public static void main(String[] args) {

        String[] names = {"Adrian", "Felipe", "quientero"};

        // for
        for (int index = 0; index < 5; index++) {
            System.out.println("Hola Adrian");

            // Bucle de adentro: recorre los nombres
            for (int i = 0; i < names.length; i++) {
                System.out.println(names[i]);
            }
        }

        // for-each
        for (String name : names) {
            System.out.println(name);
        }

        // while
        int index = 0;

        while (index < 5) {
            System.out.println("Hola Adrian");
            index++;
        }

        index = 0;
        while (index < names.length) {
            System.out.println(names[index]);
            if (names[index].equals("Adrian")) {
                System.out.println("Encontré a Adrin");
            }
            index++;
        }

        //do-while

        index = 0;
        do { 
            System.out.println("Adrian");
            index++;
        } while (index < 5);

       



    }
}