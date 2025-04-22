import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String nombreReceta, ingredientes, dificultad;
        int tiempoPreparacion;

        System.out.println("*** Recetas de Cocina ***");

        System.out.print("Ingrese el nombre de la receta: ");
        nombreReceta = consola.nextLine();

        System.out.print("Ingrese los ingredientes principales: ");
        ingredientes = consola.nextLine();
        
        System.out.print("Ingrese el tiempo de Preparacion(min): ");
        tiempoPreparacion = Integer.parseInt(consola.nextLine());
        
        System.out.print("Ingrese la dificultad: ");
        dificultad = consola.nextLine();
        
        consola.close();

        // Imprimir valores

        System.out.println("\n--- Receta de Cocina ---");
        System.out.println("Nombre de la receta: " + nombreReceta);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Tiempo de preparacion: " + tiempoPreparacion + " minutos");
        System.out.println("Dificultad(Facil/Medio/Dificil): " + dificultad);
    }
}
