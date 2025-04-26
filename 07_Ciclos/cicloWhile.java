public class cicloWhile {
    public static void main(String[] args) {
        int contador = 1;
        System.out.println("*** Ciclo While ***");

        while (contador <= 5) {
            System.out.println("contador = " + contador++);
        }
    }
}