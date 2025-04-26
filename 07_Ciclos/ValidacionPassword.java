import java.util.Scanner;

public class ValidacionPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "";

        System.out.println("*** Validación de Password ***");

        // Validar el password
        do {
            System.out.print("Ingresa un password (de al menos 6 caracteres): ");
            password = input.nextLine();

            if (password.length() < 6) {
                System.out.println("El password no cumple con los requisitos. Debe tener al menos 6 caracteres");
                System.out.println("Intente Denuevo.\n");
            }
        } while (password.length() < 6);

        System.out.println("El valor de password es válido: " + password);

        input.close();
    }
}
