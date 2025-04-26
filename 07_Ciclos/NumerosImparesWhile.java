public class NumerosImparesWhile {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("*** Numeros Impares ***");

        while (i <= 20) {
            if (i % 2 != 0) {
                System.out.println(i + " es Impar");
            }
            i++;
        }
    }
}
