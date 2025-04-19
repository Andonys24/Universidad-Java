public class Cadenas {
    public static void main(String[] args) {
        String cadena1 = "Hola";
        var cadena2 = new String("Mundo");
        var cadena3 = cadena1 + " " + cadena2;
        // Cadena multiples lineas (text block)
        var cadena4 = """
                Este es un texto
                multilinea
                """;
        
        System.out.println("*** Manejo de Cadenas ***");
        System.out.println("cadena1 = " + cadena1);
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena3 = " + cadena3);
        System.out.println("cadena4 = " + cadena4);
        

    }
}