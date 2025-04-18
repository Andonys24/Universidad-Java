public class TiposDatos {
    public static void main(String[] args) {

        // Enteros - default = 0
        byte tipoByte = 127;
        short tipoShort = 32000;
        int tipoInt = 2147483647;
        long tipoLong = 987654321987654321L;

        // Flotantes - default = 0.0
        float tipoFloat = 3.14F;
        double tipoDouble = 3.1415D;

        // Caracter - default = '\u0000'
        char tipoChar = 'A';
        char tipoChar2 = 65;

        // Booleanos - default = false
        boolean tipoBoolean = true;

        // Tipo Object (referencia) - default = null
        String nombre = "Juan Perez";

        // Imprimir valores
        System.out.println("tipoByte = " + tipoByte);
        System.out.println("tipoShort = " + tipoShort);
        System.out.println("tipoInt = " + tipoInt);
        System.out.println("tipoLong = " + tipoLong);
        System.out.println("tipoFloar = " + tipoFloat);
        System.out.println("tipoDouble = " + tipoDouble);
        System.out.println("tipoChar = " + tipoChar);
        System.out.println("tipoChar 2 = " + tipoChar2);
        System.out.println("tipoBoolean = " + tipoBoolean);
        System.out.println("nombre = " + nombre);
        
    }
}
