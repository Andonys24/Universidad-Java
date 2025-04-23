public class OperadoresAsignacion {
    public static void main(String[] args) {
        // Asignacion de variables multiples
        int miNumero = 10, a = 10, b = 15, c = 20;

        System.out.println("*** Operadores de Asignacion ***");

        // Suma y Asignacion '+='
        miNumero += 5;
        System.out.println("miNumero = " + miNumero);

        // Resta y Asignacion '-='
        miNumero -= 3;
        System.out.println("miNumero = " + miNumero);

        // Multiplicacion y Asignacion '*='
        miNumero *= 2;
        System.out.println("miNumero = " + miNumero);

        // Division y Asignacion '/='
        miNumero /= 2;
        System.out.println("miNumero = " + miNumero);

        // Modulo y Asignacion '%='
        miNumero %= 2;
        System.out.println("miNumero = " + miNumero);

        // Imprmir variables

        System.out.printf("a = %d, b = %d, c = %d %n", a, b, c);

    }
}
