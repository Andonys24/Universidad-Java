import java.util.Scanner;

public class ValorPositivo {
    public static void main(String[] args) {
        System.out.println("*** Valor Positivo ***");

        Scanner input = new Scanner(System.in);
        System.out.print("Proporciona un número: ");
        int numero = Integer.parseInt(input.nextLine());

        input.close();

        if (numero > 0) {
            System.out.println("Es positivo: " + numero);
        } else if (numero < 0) {
            System.out.println("Es negativo: " + numero);
        } else {
            System.out.println("Es cero: " + numero);
        }
    }
}
