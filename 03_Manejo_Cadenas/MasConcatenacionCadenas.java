public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        String cadena1 = "Hola", cadena2 = "Mundo";
        String cadena3 = cadena1 + " " + cadena2;
        var constructorCadenas = new StringBuilder();
        var resultado = "";
        var stringBuffer = new StringBuffer();
        
        System.out.println("cadena3 usando + = " + cadena3);
        
        // Metodo concat
        cadena3 = cadena1.concat(" ").concat(cadena2);
        
        System.out.println("cadena3 usando concat = " + cadena3);
        
        // StringBuilder
        // constructorCadenas.append(cadena1).append(" ").append(cadena2).toString();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);

        resultado = constructorCadenas.toString();
        System.out.println("resultado StringBuilder = " + resultado);
        
        // StringBuffer
        stringBuffer.append(cadena1).append(" ").append(cadena2);

        resultado = stringBuffer.toString();
        System.out.println("resultado StringBuffer = " + resultado);
        
        // Join
        resultado = String.join(" ", cadena1, cadena2, "Adios");
        System.out.println("resultado Join = " + resultado);
    }
}
