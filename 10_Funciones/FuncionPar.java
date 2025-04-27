import java.util.Scanner;

public class FuncionPar {
    static boolean esPar(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        num = input.nextInt();

        input.close();

        System.out.println("El numero ingresado es " + ((esPar(num)) ? "Par" : "Impar"));
    }
}
