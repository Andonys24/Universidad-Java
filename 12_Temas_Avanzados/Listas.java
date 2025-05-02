import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
        // Crear una lista de cadenas
        String[] diasSemana = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
        int longitud = diasSemana.length;

        // Crear una lista de cadenas a partir de un array
        List<String> diasSemanaList = Arrays.asList(diasSemana);
        // Crear una lista de cadenas vacía con un tamaño inicial
        List<String> diasSemanaList2 = new ArrayList<>(longitud);

        // Agregar elementos a la lista diasSemanaList2
        for (String dia : diasSemana) {
            System.out.println("Agregando: " + dia);
            diasSemanaList2.add(dia);
        }

        // Modificar un elemento de la lista
        diasSemanaList.set(0, "Lunes Modificado");
        diasSemanaList2.set(6, "Domingo Modificado");

        // Eliminar un elemento de la lista
        diasSemanaList2.remove(0); // Eliminar el primer elemento
        diasSemanaList2.remove("Martes"); // Eliminar el elemento "Martes"

        // Funciones Lambda, recomendacion: (1 o 2 lineas de código)

        
        // Imprimir la listas con lambda
        System.out.println("\n*** Dias Semana List (Lambda) ***");
        diasSemanaList.forEach(elemento -> {
            System.out.println("Elemento: " + elemento);
        });

        System.out.println("\n*** Dias Semana List (Lambda) metodo estatico ***");
        diasSemanaList.forEach(System.out::println);

        System.out.println("\n*** Dias Semana List 2 (ForEach) ***");
        for (String elemento : diasSemanaList2) {
            System.out.println(elemento);
        }
    }
}
