package ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Ventas ***\n");

        Producto producto1 = new Producto("Blusa", 30.00);
        Producto producto2 = new Producto("Zapatos", 50.00);

        // Orden 1
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        System.out.println(orden1);

        // Orden 2
        Orden orden2 = new Orden();
        orden2.agregarProducto(new Producto("Pantalón", 40.00));
        orden2.agregarProducto(new Producto("Cinturón", 20.00));
        orden2.agregarProducto(new Producto("Camisa", 25.00));
        System.out.println(orden2);
    }
}
