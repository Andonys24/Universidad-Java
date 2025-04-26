import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = 1 + random.nextInt(50), intentos = 10;
        boolean finJuego = false;

        System.out.println("*** Adivinar el numero Secreto ***");

        while (!finJuego) {
            int opc = 0;

            System.out.print("Adivina el numero secreto [1, 50]: ");
            opc = input.nextInt();

            if (opc > numeroSecreto) {
                System.out.println("El numero secreto es menor de " + opc);
                intentos--;
            } else if (opc < numeroSecreto) {
                System.out.println("El numero secreto es mayor de " + opc);
                intentos--;
            } else {
                System.out.println("\n---Felicidades, has adivinado el numero secreto! ---");
                finJuego = true;
            }

            if (intentos <= 0 && !finJuego) {
                System.out.println("\nVaya!, te has quedado sin intentos...");
                System.out.println("El numero secreto era: " + numeroSecreto);
                finJuego = true;
            } else {
                System.out.println("Intentos Restantes: " + intentos + "\n");
            }
        }
        input.close();
        System.out.println("Fin del juego, Gracias por jugar!.");
    }
}
