package unidad1;

public class Ejercico6 {
    public static void main(String[] args) {
         
        //Tienda de ropa con descuento
        
        // Precios originales

        double camiseta = 25;
        double pantalon = 30;

        // Descuento del 15%
        double camisetaDesc = camiseta - (camiseta * 0.15);
        double pantalonDesc = pantalon - (pantalon * 0.15);

        // Segunda camiseta: primero 15%, luego 5% adicional
        double segundaCamisetaDesc = camisetaDesc - (camisetaDesc * 0.05);

        // Total
        double total = camisetaDesc + pantalonDesc + segundaCamisetaDesc;

        System.out.println("Precio total: $" + total);
    }
}
