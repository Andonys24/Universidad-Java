import java.util.Scanner;

public class SistemaAdministracionCuentas {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        boolean salir = false;
        // Comenzar con la iteracion del menu
        while (!salir) {
            System.out.print("""
                    *** Sistema de Administración de Cuentas ***
                    Menu:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir
                    Escoge una opción:\s""");
            int opcion = consola.nextInt();
            // Evaluar cada opción
            switch (opcion) {
                case 1 -> System.out.println("Creando tu cuenta...\n");
                case 2 -> System.out.println("Eliminando tu cuenta...\n");
                case 3 -> {
                    System.out.println("Saliendo del sistema. Hasta pronto!");
                    salir = true;
                    consola.close();
                }
                default -> System.out.println("Opción inválida...\n");
            }
        }
        System.out.println("Fin del Sistema de Administración de Cuentas");
    }
}
