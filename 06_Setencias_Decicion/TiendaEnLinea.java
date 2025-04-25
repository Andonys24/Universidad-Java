import java.util.Scanner;

public class TiendaEnLinea {
    public static void main(String[] args) {
        float montoCompra, descuento, montoDescuento, montoTotal;
        boolean esMiembro;
        Scanner input = new Scanner(System.in);

        System.out.println("*** Tienda en Linea con Descuentos ***");

        System.out.print("Ingresa el monto de la compra: ");
        montoCompra = input.nextFloat();

        System.out.print("Eres Miembro de la tienda (true/false) ?: ");
        esMiembro = input.nextBoolean();

        input.close();

        if (montoCompra > 1000 && esMiembro) {
            descuento = 0.1F;
        } else if (esMiembro) {
            descuento = 0.05F;
        } else {
            descuento = 0F;
        }

        montoDescuento = montoCompra * descuento;
        montoTotal = montoCompra - montoDescuento;

        if (descuento > 0) {
            System.out.println("\nFelicidades, has obtenido un descuento del " + descuento * 100 + "%.");
            System.out.println("El monto de la compra: $" + montoCompra);
            System.out.println("El monto del descuento: $" + montoDescuento);
        } else {
            System.out.println("\nNo se obtuvo ningun tipo de descuento.");
            System.out.println("Te invitamos a hacerte miembro de la tienda.");

        }

        System.out.println("El monto final de la compra es: $" + montoTotal);

    }
}
