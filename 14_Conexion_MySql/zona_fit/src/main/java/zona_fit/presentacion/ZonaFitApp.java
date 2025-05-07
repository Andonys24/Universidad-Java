package zona_fit.presentacion;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

public class ZonaFitApp {
    public static void main(String[] args) {
        zonaFitApp();
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

    private static void generarTitulo(String titulo) {
        String asteriscos = "*".repeat(titulo.length() * 3);
        String espacios = " ".repeat(titulo.length() - 1);

        limpiarConsola();
        System.out.println("\n" + asteriscos);
        System.out.println("*" + espacios + titulo + espacios + "*");
        System.out.println(asteriscos + "\n");
    }

    private static void zonaFitApp() {
        boolean salir = false;
        int opcion;
        Scanner input = new Scanner(System.in);

        // Crear un objeto de la clase clienteDao
        IClienteDAO clienteDao = new ClienteDAO();

        while (!salir) {
            try {
                opcion = mostrarMenu(input);
                salir = ejecutarOpciones(input, opcion, clienteDao);
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }

        input.close();
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

    private static int mostrarMenu(Scanner input) {
        generarTitulo("Zona Fit (GYM)");
        System.out.println("""
                1. Listar Clientes
                2. Buscar Clientes
                3. Agregar Cliente
                4. Modificar cliente
                5. Eliminar Cliente
                6. Salir
                """);

        return validarEntrada(input, "Ingrese una ocpion");
    }

    private static boolean ejecutarOpciones(Scanner input, int opcion, IClienteDAO clienteDAO) {
        boolean salir = false;

        switch (opcion) {
            case 1 -> {// Listar clientes
                generarTitulo("Listado de Clientes");
                List<Cliente> clientes = clienteDAO.listaClientes();
                clientes.forEach(System.out::println);
            }
            case 2 -> {
                generarTitulo("Busqueda de Cliente");
                int idCliente = validarEntrada(input, "Ingrese el id del cliente a buscar");
                Cliente cliente = new Cliente(idCliente);
                boolean encontrado = clienteDAO.buscarClienteId(cliente);

                if (encontrado) {
                    System.out.println("\n*** cliente encontrado ***\n");
                    System.out.println("ID: " + cliente.getId());
                    System.out.println("Nombre: " + cliente.getNombre());
                    System.out.println("Apellido: " + cliente.getApellido());
                    System.out.println("Membresia: " + cliente.getMembresia());
                } else {
                    System.out.println("Cliente no encontrado.");
                }
            }
            case 3 -> {
                generarTitulo("Agregar Cliente");
                System.out.print("Nombre: ");
                String nombre = input.nextLine();
                System.out.print("Apellido: ");
                String apellido = input.nextLine();
                int membresia = validarEntrada(input, "Membresia");

                // Crear objeto de cliente sin el id
                Cliente cliente = new Cliente(nombre, apellido, membresia);
                boolean agregado = clienteDAO.agregarCliente(cliente);

                if (agregado) {
                    System.out.println("Cliente Agregado con exito: " + cliente);
                } else {
                    System.out.println("Cliente NO Agregado");
                }

            }
            case 4 -> {
                generarTitulo("Modificar Cliente");
                int idCLiente = validarEntrada(input, "Ingrese el id del cliente a editar");
                Cliente cliente = new Cliente(idCLiente);
                boolean existe = clienteDAO.buscarClienteId(cliente);

                if (existe) {
                    System.out.println("\n*** Datos Actuales del Cliente ***\n");
                    System.out.println("ID: " + cliente.getId());
                    System.out.println("Nombre: " + cliente.getNombre());
                    System.out.println("Apellido: " + cliente.getApellido());
                    System.out.println("Membresia: " + cliente.getMembresia());
                    System.out.println("\n*** Fin Datos del Cliente ***\n");

                    System.out.print("Nombre: ");
                    String nombre = input.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = input.nextLine();
                    int membresia = validarEntrada(input, "Membresia");
                    String membString = String.valueOf(membresia);

                    cliente.setNombre((nombre.isEmpty() ? cliente.getNombre() : nombre));
                    cliente.setApellido((apellido.isEmpty() ? cliente.getApellido() : apellido));
                    cliente.setMembresia((membString.length() != 0 ? membresia : cliente.getMembresia()));

                    boolean modificado = clienteDAO.modificarCliente(cliente);

                    if (modificado) {
                        System.out.println("Cliente modificado correctamente: " + cliente);
                    } else {
                        System.out.println("Cliente modificado correctamente: " + cliente);
                    }

                } else {
                    System.out.println("Cliente no encontrado.");
                }

            }
            case 5 -> {
                generarTitulo("Eliminar Cliente");
                int idCliente = validarEntrada(input, "Ingrese el id del cliente a eliminar");
                Cliente cliente = new Cliente(idCliente);
                boolean existe = clienteDAO.buscarClienteId(cliente), eliminado = false;

                if (existe) {
                    eliminado = clienteDAO.eliminarCliente(cliente);

                    if (eliminado) {
                        System.out.println("Cliente eliminado exitosamente: " + cliente);
                    } else {
                        System.out.println("No se elimino el cliente: " + cliente);
                    }
                } else {
                    System.out.println("Cliente no encontrado.");
                }
            }
            case 6 -> {
                salir = true;
                System.out.println("Hasta Pronto!");
            }
            default -> System.out.println("Opcion no valida.");
        }

        System.out.print("\nPresione una tecla para " + (salir ? "salir" : "continuar") + ". . . ");
        input.nextLine();

        return salir;
    }
}
