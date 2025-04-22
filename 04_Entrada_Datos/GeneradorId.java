import java.util.Random;
import java.util.Scanner;

public class GeneradorId {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner consola = new Scanner(System.in);
        String nombre, apellido, idUnico = "";
        int fechaNac;

        // Pedir datos al usuario
        System.out.print("Ingrese su nombre: ");
        nombre = consola.nextLine();

        System.out.print("Ingrese su Apellido: ");
        apellido = consola.nextLine();

        System.out.print("Ingrese su Fecha de nacimiento(YYYY): ");
        fechaNac = Integer.parseInt(consola.nextLine());

        consola.close();

        // Normalizar los valores
        nombre = nombre.trim();
        apellido = apellido.trim();

        // Crear el ID Unico
        idUnico += (nombre.substring(0, 2) + apellido.substring(0, 2)).toUpperCase();
        idUnico += Integer.toString(fechaNac).substring(2, 4);
        idUnico += String.format("%04d", 1 + random.nextInt(9999));

        System.out.printf("""
                \nHola %s,
                \tTu nuevo numero de identificacion (ID) generado por el sistema es:
                \t%s
                \tFelicidades!
                """, nombre, idUnico);
    }
}
