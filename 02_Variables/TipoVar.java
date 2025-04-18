public class TipoVar {
    public static void main(String[] args) {
        String nombre1 = "Juan";

        // Con el uso de var - Se debe definir su valor
        var nombre2 = "Carlos";
        var edad = 19; // Se infiere tipo Int
        var sueldo = 5000.5F; // Se infiere tipo Float
        var esCasado = false; // Se infiere tipo boolean
        // Cuando no se define el tipo de dato o un valor valido
        // var precio;
        // var apellido = null;

        System.out.println("*** Uso de la variable Var ***");

        System.out.println();
        System.out.println("Nombre 1: " + nombre1);
        System.out.println("Nombre 2: " + nombre2);
        System.out.println("Edad: " + edad);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Casado: " + esCasado);
    }
}
