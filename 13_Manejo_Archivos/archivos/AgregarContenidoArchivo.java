package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AgregarContenidoArchivo {
    public static void main(String[] args) {
        boolean anexar = false;
        String nombreArchivo = "mi_archivo.txt", nuevoContenido;
        File archivo = new File(nombreArchivo);
        PrintWriter salida;

        try {
            anexar = archivo.exists();
            salida = new PrintWriter(new FileWriter(archivo, anexar));
            nuevoContenido = "Nuevo\nContenido\nDel\nArchivo\nde\nTexto.";
            salida.println(nuevoContenido);
            salida.close();
            System.out.println("Se agrego el contenido al archivo...");
        } catch (Exception e) {
            System.out.println("Error al editar el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
