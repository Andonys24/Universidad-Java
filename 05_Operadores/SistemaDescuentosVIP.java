import java.util.Scanner;

public class SistemaDescuentosVIP {
    public static void main(String[] args) {
        final int NO_PRODUCTOS_DESCUENTO = 10;
        Scanner consola = new Scanner(System.in);
        int cantidadProductos;
        boolean tienesMembresia, esElegibleDescuento;

        System.out.println("*** Sistema de Descuentos VIP*** ");

        System.out.print("Cuántos productos compraste hoy? ");
        cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.print("Tienes la membresía de la tienda (true/false)? ");
        tienesMembresia = Boolean.parseBoolean(consola.nextLine());

        consola.close();

        esElegibleDescuento = cantidadProductos >= NO_PRODUCTOS_DESCUENTO && tienesMembresia;

        System.out.println("Tienes acceso al descuento VIP ? " + esElegibleDescuento);
    }
}
