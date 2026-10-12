package bases;

import java.util.ArrayList;

public class ArrayList {
    public static void main(String[] args) {
    
    //Declaracion

    ArrayList<String> name = new ArrayList<String>();
  

    //Anadir elementos

    System.out.println(name.size());

    name.add("Adrian");
    name.add ("Felipe");
      name.add ("Quintero");
    System.out.println (name.size());

    //acceder a los eleemntos

    System.out.println(name.getFirst());
     System.out.println(name.get(1));
    System.out.println(name.getLast());

    //modificar elementos 

    name.set(0, "Adri");
     System.out.println(name.get(0));

    //Eliminar
    name.remove(1);
     System.out.println(name.get(2));

    //busacar

    name.contains("Felipe");
      
    }
}
