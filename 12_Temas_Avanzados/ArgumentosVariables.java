public class ArgumentosVariables {
    public static void main(String[] args) {
        variosParametros("Karla", 1, 3, 12, 45, 78);
    }

    static void variosParametros(String nombre, int... numeros) {
        System.out.println("Nombre: " + nombre);
        imprirmirNumeros(numeros);
    }

    static void imprirmirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros_" + i + " = " + numeros[i]);
        }
    }
}