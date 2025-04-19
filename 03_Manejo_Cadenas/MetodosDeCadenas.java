public class MetodosDeCadenas {
    public static void main(String[] args) {
        // Metodos de cadenas
        var cadena1 = "Hola Mundo";
        var cadena2 = "   Leo Reyes   ";

        // Metodos
        var longitud = cadena1.length(); // Obtener longitud de la cadena
        var nuevaCadena = cadena1.replace('o', 'a'); // Remplazar caracteres
        var mayusculas = cadena1.toUpperCase(); // Convertir a mayusculas
        var minusculas = mayusculas.toLowerCase(); // Convertir a minusculas

        System.out.println("Longitud Cadena 1 = " + longitud);
        System.out.println("nuevaCadena = " + nuevaCadena);
        System.out.println("mayusculas = " + mayusculas);
        System.out.println("minusculas = " + minusculas);
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena2 (sin espacios) = " + cadena2.trim());
    }
}
