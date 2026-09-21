package unidad1;

public class Ejercicio3{
    public static void main(String[] args) {
 
        // Declaración de variables
        String nombreProducto = "Mouse Gamer";
        int cantidadProducto = 10;
        double precioProducto = 95000.0;
        boolean estaDisponible = cantidadProducto > 0;

        // Cálculo del costo total
        double costoTotal = cantidadProducto * precioProducto;

        // Mostrar resultados
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Cantidad: " + cantidadProducto);
        System.out.println("Precio unitario: $" + precioProducto);
        System.out.println("Disponible: " + estaDisponible);
        System.out.println("Costo total: $" + costoTotal);
    }
}