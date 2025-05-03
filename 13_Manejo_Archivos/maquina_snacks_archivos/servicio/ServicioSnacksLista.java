package maquina_snacks_archivos.servicio;

import java.util.ArrayList;
import java.util.List;

import maquina_snacks_archivos.dominio.Snack;

public class ServicioSnacksLista implements IServicioSnacks {
    private static final List<Snack> snacks;

    // Bloque static inicializado
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 70));
        snacks.add(new Snack("Refresco", 50));
        snacks.add(new Snack("Sandwich", 120));
    }

    public void agregarSnack(Snack snack) {
        snacks.add(snack);
    }

    public void mostrarSnacks() {
        System.out.println("----- Snacks en el Inventario -----");
        var inventario = "";
        for (var snack : snacks) {
            inventario += snack.toString() + "\n";
        }

        System.out.println(inventario);
    }

    public List<Snack> getSnacks() {
        return snacks;
    }
}
