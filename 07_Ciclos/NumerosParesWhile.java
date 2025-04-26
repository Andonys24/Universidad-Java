public class NumerosParesWhile {
    public static void main(String[] args) {
        int contador = 1;

        System.out.println("*** Numeros pares del 1 al 20 ***");

        while (contador <= 20) {
            if (contador % 2 == 0) {
                System.out.println("El numero " + contador + " es Par.");
            }
            contador++;
        }
    }
}
