package bases;

public class StringsCo {
    public static void main(String[] args) {
        
        //strings

        String name = "Adrian";
        var surname = new String("Felipe");

        //Cocateancion

        System.out.println(name + surname);

        //lengh

        System.out.println(name.length()   );

        //charAt
        System.out.println(name.charAt(1));

        //Substring

        System.out.println(name.substring(2 ) );
          System.out.println(name.substring(1, 3 ) );

          //toUpperCase/tolowerCase(MAYUSCULA MINUSCULA)

          System.out.println(name.toUpperCase());
          System.out.println(name.toLowerCase());

          //Contains

          System.out.println("Hola java".contains("Adrian"));
           System.out.println("Hola java".contains("ava"));

           //equals

           System.out.println(name. equals ("Adrian"));
            System.out.println(name. equalsIgnoreCase("adrian"));

            //Trim 

            System.out.println("Hola me llamo Adrian". trim());

            //Relpace

              System.out.println("Hola me llamo Adrian". replace(olChat:"", ));

            











    }
}
