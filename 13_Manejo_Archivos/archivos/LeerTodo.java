package archivos;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodo {
    public static void main(String[] args) {
        String nombreArchivo = "mi_archivo.txt";
        List<String> lineas;

        try {
            // Leer todas las lineas del archivo
            lineas = Files.readAllLines(Paths.get(nombreArchivo));

            System.out.println("*** Contenido del archivo ***");

            lineas.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e);
        }
    }
}
