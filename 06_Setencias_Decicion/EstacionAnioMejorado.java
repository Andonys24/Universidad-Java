import java.util.Scanner;

public class EstacionAnioMejorado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mes;
        String estacion = "";

        System.out.println("*** Estación del Año ***");

        System.out.print("Proporciona el valor del mes (1-12): ");
        mes = input.nextInt();
        // mes = Integer.parseInt(input.nextLine());

        input.close();

        estacion = switch (mes) {
            case 1, 2, 12 -> "Invierno";
            case 3, 4, 5 -> "Primavera";
            case 6, 7, 8 -> "Verano";
            case 9, 10, 11 -> "Otoño";
            default -> "Estación desconcida";
        };

        // Imprimimos el resultado
        System.out.printf("La estación para el mes %d es %s%n", mes, estacion);
    }
}
