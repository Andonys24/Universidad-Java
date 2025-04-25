import java.util.Scanner;

public class MayordosNumeros {
    public static void main(String[] args) {
        double num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.println("*** Mayor de dos numeros ***");

        System.out.print("Ingrese el primer numero: ");
        num1 = input.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        num2 = input.nextDouble();

        input.close();

        if (num1 > num2) {
            System.out.println("El numero mayor es: " + num1);
        } else if (num1 < num2) {
            System.out.println("El numero mayor es: " + num2);
        } else {
            System.out.println("Ambos numeros tiene el mismo valor.");
        }

    }
}
