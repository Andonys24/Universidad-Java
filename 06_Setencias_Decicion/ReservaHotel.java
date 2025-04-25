import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {
        String nombre;
        int diasEstadia;
        float tarifaDiaria, costoTotal;
        boolean vistaAlMar;
        Scanner input = new Scanner(System.in);

        System.out.println("*** Sistema de Reserva de Hotel ***");

        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();

        System.out.print("Ingrese los dias de estadia: ");
        diasEstadia = Integer.parseInt(input.nextLine());

        System.out.print("Desea un cuarto con vista al mar (true/false)?: ");
        vistaAlMar = Boolean.parseBoolean(input.nextLine());

        input.close();

        if (!vistaAlMar) {
            tarifaDiaria = 150.50F;
        } else {
            tarifaDiaria = 190.50F;
        }

        costoTotal = diasEstadia * tarifaDiaria;

        System.out.printf("""
                %n------- Detalles de la Reservacion -------
                Cliente: %s
                Dias de estadia: %d
                Costo Total: $%.2f
                Habitacion con vista al mar: %s
                """, nombre, diasEstadia, costoTotal, ((vistaAlMar) ? "si :)" : "no :("));
    }
}
