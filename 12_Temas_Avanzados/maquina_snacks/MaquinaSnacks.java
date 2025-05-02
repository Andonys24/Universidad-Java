package maquina_snacks;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }

    private static void limpiarConsola() {
        try {
            String sistemaOperativo = System.getProperty("os.name").toLowerCase();
            if (sistemaOperativo.contains("win")) {
                // Comando para Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Comando para Linux/Mac
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("No se pudo limpiar la consola: " + e.getMessage());
        }
    }

    private static int validarEntrada(Scanner input, String mensaje) {
        int entrada = 0;
        while (true) {
            try {
                System.out.print(mensaje + ": ");
                entrada = input.nextInt();
                input.nextLine(); // Limpiar buffer para evitar bucle infinito
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un numero entero");
                input.nextLine(); // Limpiar buffer para evitar bucle infinito
            }
        }

        return entrada;
    }

    public static void maquinaSnacks() {
        boolean salir = false;
        Scanner input = new Scanner(System.in);

        // Crear lista de productos de tipo snack
        List<Snack> productos = new ArrayList<>();

        System.out.println("*** Maquina de Snacks ***");
        Snacks.mostrarSnacks(); // Mostrar el inventario

        while (!salir) {
            try {
                int opcion = mostrarMenu(input);
                salir = ejecutarOpciones(opcion, input, productos);
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            } finally {
                System.out.println();
            }
        }
    }

    private static int mostrarMenu(Scanner input) {
        limpiarConsola();
        System.out.print("""
                *** Menu ***
                1. Comparar Snack
                2. Mostrar Ticket
                3. Agregar Nuevo Snack
                4. Salir
                """);

        // Leer y retornar opcion seleccionada
        return validarEntrada(input, "Ingrese una opcion");
    }

    private static boolean ejecutarOpciones(int opcion, Scanner input, List<Snack> productos) {
        boolean salir = false;

        switch (opcion) {
            case 1 -> comprarSnack(input, productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(input);
            case 4 -> {
                System.out.println("Regresa Pronto!");
                salir = true;
            }
            default -> System.out.println("Opcion no valida.");
        }

        System.out.print("Presione una tecla para continuar...");
        input.nextLine();

        return salir;
    }

    private static void comprarSnack(Scanner input, List<Snack> productos) {
        int id = 0;
        boolean snackEncontrado = false;

        id = validarEntrada(input, "Que snack quieres comprar (id)?");

        for (Snack snack : Snacks.getSnacks()) {
            if (id == snack.getId()) {
                // Agregar snack a la lista de productos
                productos.add(snack);
                System.out.println("Ok, Snack agregado: " + snack);
                snackEncontrado = true;
                break;
            }
        }

        if (!snackEncontrado) {
            System.out.println("ID del snack no encontrado: " + id);
        }

    }

    private static void mostrarTicket(List<Snack> productos) {
        String ticket = "\n---------- Ticket de venta ----------\n";
        double total = 0.0;

        ticket += String.format("%-20s%-10s\n", "Producto", "Precio");

        for (Snack producto : productos) {
            ticket += String.format("%-20s$%-10.2f\n", producto.getNombre(), producto.getPrecio());
            total += producto.getPrecio();
        }

        ticket += String.format("\n%-20s$%-10.2f", "Total compra:", total);
        ticket += "\n\n-------- Fin Ticket de venta --------";

        System.out.println(ticket);
    }

    private static void agregarSnack(Scanner input) {
        String nombre = "";
        double precio = 0.0;

        System.out.print("Ingrese el nombre del nuevo snack: ");
        nombre = input.nextLine();
        System.out.print("Ingrese el precio del nuevo snack: ");
        precio = input.nextDouble();

        Snacks.agregarSnack(new Snack(nombre, precio));
        System.out.println("tu snack se ha agregado correctamente");
        Snacks.mostrarSnacks();
    }
}
