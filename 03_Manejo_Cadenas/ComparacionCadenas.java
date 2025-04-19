public class ComparacionCadenas {
    public static void main(String[] args) {
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        // Comparacion de cadenas (comparar la referencia)
        System.out.print("cadena1 es igual en referencia a cadena2: ");
        System.out.println(cadena1 == cadena2);
        
        System.out.print("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1 == cadena3);
        
        // Comparacion de cadenas (compara el contenido)
        System.out.print("cadena1 es igual al contenido de la cadena2: ");
        System.out.println(cadena1.equals(cadena2));
        
        System.out.print("cadena1 es igual al contenido de la cadena3: ");
        System.out.println(cadena1.equals(cadena3));
    }
}
