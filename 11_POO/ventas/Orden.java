package ventas;

public class Orden {

    private final int id;
    private Producto[] productos;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    private static int contadorOrdenes;

    // Constructor default
    public Orden() {
        this.id = ++contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("No se pueden agregar más productos a la orden.");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("====================================");
        System.out.println("ID de la orden: " + this.id);
        System.out.println("\tProductos de la orden:");

        for (int i = 0; i < this.contadorProductos; i++)
            System.out.println("\t\t" + this.productos[i]);

        System.out.println("\tTotal de la orden: $" + this.calcularTotal());
        System.out.println("====================================");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("====================================\n");
        sb.append("Orden ID: ").append(this.id).append("\n");
        sb.append("Productos:\n");
        for (int i = 0; i < this.contadorProductos; i++) {
            sb.append("\t").append(this.productos[i]).append("\n");
        }
        sb.append("Total: $").append(this.calcularTotal()).append("\n");
        sb.append("====================================\n");
        return sb.toString();
    }
}
