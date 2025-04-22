import java.util.Scanner;

public class ManejoConsola {
    public static void main(String[] args) {
        // Introducir valores por consola
        var nombre = "";
        var consola = new Scanner(System.in); // in de input
        System.out.print("Escribe tu nombre: ");
        nombre = consola.nextLine();
        System.out.println("Nombre ingresado: " + nombre);
        consola.close();
    }
}
