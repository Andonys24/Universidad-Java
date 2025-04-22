import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        int edad, entero;
        float flotante;
        double altura;
        String nombre, enteroString, floatString;

        // Leer tipo int
        System.out.print("Ingresa tu edad: ");
        edad = consola.nextInt();
        
        // Leer tipo double
        System.out.print("Ingresa tu altura: ");
        altura = consola.nextDouble();

        // Consumir el caracter del salto de linea
        // consola.nextLine();
        
        // Leer tipo String
        System.out.print("Ingresa tu nombre: ");
        // nombre = consola.nextLine();
        nombre = consola.next();

        // Conversion de datos - Tipo Int
        System.out.print("Proporciona un valor entero: ");
        enteroString = consola.next();
        entero = Integer.parseInt(enteroString);
        
        // Conversion de datos - Tipo float
        System.out.print("Proporciona un valor flotante: ");
        floatString = consola.next();
        flotante = Float.parseFloat(floatString);

        consola.close();

        // Imprimir resultados
        System.out.println("\nDatos Almacenados en memoria:");
        System.out.println("edad = " + edad);
        System.out.println("altura = " + altura);
        System.out.println("nombre = " + nombre);
        System.out.println("enteroString = " + entero);
        System.out.println("floatString = " + flotante);
    }
}
