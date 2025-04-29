package ventas;

public class Producto extends Object {
    private final int id;
    private String nombre;
    private double precio;
    private static int contador = 0;

    public Producto() { // Constructor por defecto
        this.id = ++Producto.contador;
        this.nombre = "Producto" + contador;
        this.precio = 0.0;
    }

    public Producto(String nombre, double precio) { // Constructor con parámetros
        this.id = ++Producto.contador;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Metodos Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContador() {
        return contador;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

}
