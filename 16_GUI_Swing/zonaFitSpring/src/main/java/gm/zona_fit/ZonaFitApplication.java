package gm.zona_fit;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import gm.zona_fit.model.Cliente;
import gm.zona_fit.service.IClienteService;

@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner {

	@Autowired
	private IClienteService clienteService;

	private static final Logger logger = LoggerFactory.getLogger(ZonaFitApplication.class);

	String nl = System.lineSeparator();

	public static void main(String[] args) {
		logger.info("\nIniciando la aplicacion...\n");
		SpringApplication.run(ZonaFitApplication.class, args);
		logger.info("\nFinalizando la aplicaciones...\n");
	}

	@Override
	public void run(String... args) throws Exception {
		zonaFitApp();
	}

	private void zonaFitApp() {
		logger.info("\n\n*** Aplicacion Zona Fit (GYM) ***\n\n");
		boolean salir = false;
		Scanner input = new Scanner(System.in);

		while (!salir) {
			int opcion = mostrarMenu(input);
			salir = ejecutarOpciones(input, opcion);
			logger.info(nl);
		}

		input.close();
	}

	private int validarEntrada(Scanner input, String mensaje) {
		int entrada = 0;
		while (true) {
			try {
				logger.info(mensaje + ": ");
				entrada = input.nextInt();
				input.nextLine(); // Limpiar buffer para evitar bucle infinito
				break;
			} catch (InputMismatchException e) {
				logger.info("\nError: Debes ingresar un numero entero\n\n");
				input.nextLine(); // Limpiar buffer para evitar bucle infinito
			}
		}

		return entrada;
	}

	private int mostrarMenu(Scanner input) {
		logger.info("""
				1. Listar Clientes
				2. Buscar Cliente
				3. Agregar Cliente
				4. Modificar Cliente
				5. Eliminar Cliente
				6. Salir
					""");

		return validarEntrada(input, "Ingrese una opcion");
	}

	private boolean ejecutarOpciones(Scanner input, final int opcion) {
		boolean salir = false;

		switch (opcion) {
			case 1 -> {
				// Listar clientes
				logger.info("\n\n--- Listado de clientes ---\n\n");
				List<Cliente> clientes = clienteService.listatClientes();
				clientes.forEach(cliente -> logger.info(cliente.toString() + nl));
			}
			case 2 -> {
				// Buscar cliente
				logger.info("\n\n--- Buscar Cliente por Id ---\n\n");
				int idCliente = validarEntrada(input, "Ingrese el id del cliente a buscar");
				Cliente cliente = clienteService.buscarClienteId(idCliente);

				if (cliente != null) {
					logger.info("Cliente encontrado: " + cliente.toString());
					logger.info(nl);
				} else {
					logger.info("Cliente no encontrado...\n");
				}
			}
			case 3 -> {
				// Agregar CLiente
				logger.info("\n\n--- Agregar Cliente ---\n\n");

				logger.info("Nombre: ");
				String nombre = input.nextLine();
				logger.info("Apellido: ");
				String apellido = input.nextLine();
				int membresia = validarEntrada(input, "Membresia");

				// Crear objeto y llenarlo de datos
				Cliente cliente = new Cliente();
				cliente.setNombre(nombre);
				cliente.setApellido(apellido);
				cliente.setMembresia(membresia);

				// Guardar cliente en la bd
				clienteService.guardarCliente(cliente);
				logger.info("Cliente agregado correctamente!\n");

			}
			case 4 -> {
				// Modificar Cliente
				logger.info("\n\n--- Modificar Cliente ---\n\n");

				int idCliente = validarEntrada(input, "Ingrese el id del cliente");

				Cliente cliente = clienteService.buscarClienteId(idCliente);

				if (cliente != null) {
					logger.info("\nDatos actuales del cliente: " + cliente.toString() + nl);
					logger.info("Nombre: ");
					String nombre = input.nextLine();
					logger.info("Apellido: ");
					String apellido = input.nextLine();
					int membresia = validarEntrada(input, "Membresia");

					cliente.setNombre(nombre);
					cliente.setApellido(apellido);
					cliente.setMembresia(membresia);
					clienteService.guardarCliente(cliente);
					logger.info("\nCliente Modificado correctamente!\n\n");

				} else {
					logger.info("\nCliente No encotrado!\n\n");
				}

			}
			case 5 -> {
				// Eliminar Cliente
				logger.info("\n\n--- Eliminar Cliente ---\n\n");

				int idCliente = validarEntrada(input, "Ingrese el id del cliente");

				Cliente cliente = clienteService.buscarClienteId(idCliente);

				if (cliente != null) {
					clienteService.eliminarCliente(cliente);
					logger.info("\n\nCLiente eliminado correctamente!\n\n");
				} else {
					logger.info("\nCliente No encotrado!\n\n");
				}
			}
			case 6 -> {
				// Salir del programa
				logger.info("Hasta Pronto!\n");
				salir = true;
			}

			default -> {
				logger.info("\n\nOpcion no valida.\n\n");
			}
		}

		logger.info("\nPresione una tecla para ");
		logger.info((salir ? "salir" : "continuar") + " . . . ");
		input.nextLine();

		return salir;
	}

}
