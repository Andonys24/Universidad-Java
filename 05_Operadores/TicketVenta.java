import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        double precioLeche, precioPan, precioLechuga, precioPlatanos;
        double subtotal, impuesto, costoTotalCompra;
        double subtotalConDescuento, descuento, descuentoPorcentaje;
        
        System.out.println("*** Generación Ticket de Venta ***");

        System.out.print("Precio leche: ");
        precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio pan: ");
        precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Precio lechuga: ");
        precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.print("Precio plátanos: ");
        precioPlatanos = Double.parseDouble(consola.nextLine());

        System.out.print("Aplicar algún descuento (%)? ");
        descuentoPorcentaje = Integer.parseInt(consola.nextLine());

        consola.close();

        // Cálculo del subtotal (sin impuestos)
        subtotal = precioLeche + precioPan + precioLechuga + precioPlatanos;

         // Aplicar el descuento
        descuento = subtotal * (descuentoPorcentaje / 100.0);

        // Subtotal con descuento
        subtotalConDescuento = subtotal - descuento;

        // Cálculo con impuestos (16%)
        impuesto = subtotalConDescuento * 0.16;

        // Cálculo total de la compra (con impuestos)
        costoTotalCompra = subtotalConDescuento + impuesto;

        // Imprimir el ticket de venta
        System.out.printf("""
                %nTicket de Venta
                ---------------
                Subtotal: $%.2f
                Descuento: $%.2f (%d%%)
                Impuesto (16%%): $%.2f
                Costo total de la compra: $%.2f
                """, subtotal, descuento, descuentoPorcentaje,
                impuesto, costoTotalCompra);
    }
}
