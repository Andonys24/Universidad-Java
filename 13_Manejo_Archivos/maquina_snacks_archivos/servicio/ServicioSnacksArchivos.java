package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivos implements IServicioSnacks {

    private final String NOMBRE_ARCHIVO = "snacks.csv";

    // Crear lista de snacks
    private List<Snack> snacks = new ArrayList<>();

    // Constructor de la clase
    public ServicioSnacksArchivos() {
        // Crear el archivo si no existe
        File archivo = new File(NOMBRE_ARCHIVO);
        boolean existe = false;

        try {
            existe = archivo.exists();
            if (existe) {
                this.snacks = obtenerSnacks();
            } else {
                // Crear el archivo
                PrintWriter salida = new PrintWriter(new FileWriter(archivo));
                salida.close(); // Guardar el archivo en Disco
                System.out.println("Se ha creado el archivo.");
            }
        } catch (Exception e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }

        // Si no existia el archivo cargar algunos snack iniciales
        if (!existe) {
            cargarSnacksIniciales();
        }
    }

    private void cargarSnacksIniciales() {
        this.agregarSnack(new Snack("Papas", 70));
        this.agregarSnack(new Snack("Refresco", 50));
        this.agregarSnack(new Snack("Sandwich", 120));
    }

    private List<Snack> obtenerSnacks() {
        List<Snack> snackList = new ArrayList<>();
        List<String> lineas;
        int idSnack;
        Double precioSnack;
        String nombreSnack;

        try {
            lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));

            for (String linea : lineas) {
                String[] lineaSnack = linea.split(",");
                idSnack = Integer.parseInt(lineaSnack[0]);
                nombreSnack = lineaSnack[1];
                precioSnack = Double.parseDouble(lineaSnack[2]);
                snackList.add(new Snack(nombreSnack, precioSnack));

            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo snacks: " + e.getMessage());
            e.printStackTrace();
        }

        return snackList;
    }

    @Override
    public void agregarSnack(Snack snack) {
        // 1. Pasar a la lista en memoria
        this.snacks.add(snack);
        // 2. Guardar el nuevo snack en el archivo
        this.agregarSnackArchivo(snack);
    }

    private void agregarSnackArchivo(Snack snack) {
        boolean anexar = false;
        File archivo = new File(NOMBRE_ARCHIVO);
        PrintWriter salida;

        try {
            anexar = archivo.exists();
            salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(snack.escribirSnack());
            salida.close(); // Se escribe la info en el archivo
        } catch (Exception e) {
            System.out.println("Error al agregar el snack: " + e.getMessage());
        }
    }

    @Override
    public void mostrarSnacks() {
        System.out.println("\n----- Snacks en el Inventario -----\n");
        
        for (Snack snack : snacks) {
            System.out.println(snack.toString());
        }

        System.out.println("\n--- Fin Snacks en el Inventario ---\n");
    }

    // @Override
    public List<Snack> getSnacks() {
        return this.snacks;
    }
}
