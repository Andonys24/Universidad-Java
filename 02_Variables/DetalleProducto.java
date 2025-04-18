public class DetalleProducto {
    public static void main(String[] args) {
        String nombreProducto = "Laptop DELL";
        float precio = 15399.99F;
        int cantidadDisponible = 10;
        boolean disponible = true;

        System.out.println("*** Tienda en Linea (Detalle Producto) ***");
        
        System.out.println();
        System.out.println("*** Producto 1 ***");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Precio: " + precio + "$");
        System.out.println("Cantidad Disponibles: " + cantidadDisponible);
        System.out.println("Disponible: " + disponible);
        
        nombreProducto = "Laptop HP";
        precio = 13299.99F;
        cantidadDisponible = 20;
        disponible = false;
        
        System.out.println();
        System.out.println("*** Producto 2 ***");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Precio: " + precio + "$");
        System.out.println("Cantidad Disponibles: " + cantidadDisponible);
        System.out.println("Disponible: " + disponible);
    }
}
