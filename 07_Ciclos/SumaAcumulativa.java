public class SumaAcumulativa {
    public static void main(String[] args) {
        final int MAX = 5;
        int i = 1, suma = 0;

        System.out.println("*** Suma Acumulativa ***");

        while (i <= MAX) {
            System.out.printf("(suma + contador) - > %d + %d%n", suma, i);
            suma += i++;
            System.out.printf("Suma parcial acumulada: %d%n%n", suma);
        }

        System.out.println("\nLa suma de los primeros " + MAX + " numeros es: " + suma);
    }
}
