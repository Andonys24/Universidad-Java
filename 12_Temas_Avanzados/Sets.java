import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        System.out.println("*** Sets en Java ***");
        Set<String> conjunto = new TreeSet<>();

        // Agregar Elementos
        conjunto.add("Carlos");
        conjunto.add("Carlos"); // Los sets no permiten elementos Duplicados
        conjunto.add("Karla");
        conjunto.add("Victoria");

        
        System.out.println("\n*** Elementos del Set ***");
        conjunto.forEach(System.out::println);
        
        // Eliminar elemento
        conjunto.remove("Karla");
        conjunto.remove("Victoria");

        System.out.println("\n*** Elementos nuevos del Set ***");
        conjunto.forEach(System.out::println);
    }
}
