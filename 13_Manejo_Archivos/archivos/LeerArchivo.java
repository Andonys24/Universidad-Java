package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "mi_archivo.txt", linea = "";
        File archivo = new File(nombreArchivo);
        BufferedReader entrada;

        try {
            System.out.println("Contenido del archivo: ");
            entrada = new BufferedReader(new FileReader(archivo));
            // Leer todas las lineas del archivo
            linea = entrada.readLine();

            while (linea != null) {
                System.out.println(linea);
                linea = entrada.readLine();
            }

            entrada.close(); // cerrar archivo

        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e);
        }
    }
}
