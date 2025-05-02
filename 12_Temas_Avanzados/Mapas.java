import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        System.out.println("*** Maps ***");
        Map<String, String> persona = new HashMap<>();

        persona.put("nombre", "Diego");
        persona.put("apellido", "Florez");
        persona.put("edad", "31");

        System.out.println("\n*** Valores del mapa (forEach(llave, valor) - Java 8+) ***");
        persona.forEach((llave, valor) -> {
            System.out.println("llave: " + llave + ", Valor: " + valor);
        });

        // Modificar valor de la llave existente
        persona.put("edad", "35");

        System.out.println("\n*** Valores del mapa (llave, valor) ***");
        for (Map.Entry<String, String> entry : persona.entrySet()) {
            System.out.println("Llave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        System.out.println("\n*** Valores del mapa (llave) ***");
        for (String llave : persona.keySet()) {
            System.out.println("Llave: " + llave + ", Valor: " + persona.get(llave));
        }
    }
}
