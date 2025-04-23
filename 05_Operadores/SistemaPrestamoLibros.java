import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        final var DISTANCIA_PERMITIDA_KM = 3;
        Scanner consola = new Scanner(System.in);
        boolean tieneCrendencial, esElegiblePrestamo;
        int distanciaKm;

        System.out.println("*** Sistema Prestamo Libros ***");

        System.out.print("Cuentas con credencial de estudiante (true/false)? ");
        tieneCrendencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print("A cuanto km vives de la biblioteca? ");
        distanciaKm = Integer.parseInt(consola.nextLine());

        consola.close();

        esElegiblePrestamo = tieneCrendencial || distanciaKm <= DISTANCIA_PERMITIDA_KM;

        System.out.println("Eres elegible para prestamo de libros? " + esElegiblePrestamo);

    }
}
