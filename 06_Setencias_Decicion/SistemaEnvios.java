import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        String destino;
        double peso, costoEnvio;
        Scanner input = new Scanner(System.in);

        System.out.println("*** Sistema de Envios ***");

        System.out.print("Ingrese el destino del paquete (nacional/internacional): ");
        destino = input.nextLine();

        System.out.print("Ingrese el peso del paquete (en kg): ");
        peso = input.nextDouble();

        input.close();

        costoEnvio = switch (destino) {
            case "nacional" -> 10.0 * peso;
            case "internacional" -> 20.0 * peso;
            default -> {
                System.out.println("Destino invalido.");
                yield 0.0;
            }
        };

        if (costoEnvio != 0.0) {
            System.out.printf("El costo del envio del paquete es: $%.2f%n", costoEnvio);
        }
    }
}
