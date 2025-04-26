import java.util.Scanner;

public class DibujaTriangulo {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int numeroFilas;

        System.out.println("*** Dibuja un Triángulo ***");

        System.out.print("Proporciona el número de filas: ");
        numeroFilas = consola.nextInt();

        consola.close();

        // Iteramos sobre cada fila del triángulo
        for (int fila = 1; fila <= numeroFilas; fila++) {
            String espaciosBlanco = " ".repeat(numeroFilas - fila);
            String asteriscos = "*".repeat(2 * fila - 1);
            System.out.println(espaciosBlanco + asteriscos);
        }
    }
}
