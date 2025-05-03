package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "mi_archivo.txt";
        File archivo = new File(nombreArchivo);
        PrintWriter salida;

        try {
            if (archivo.exists()) {
                System.out.println("El archivo '" + nombreArchivo + "' ya existe");
            } else {
                System.out.println("Creando el archivo '" + nombreArchivo + "' ...");
                salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("El archivo '" + nombreArchivo + "' fue creado con exito");
            }
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}