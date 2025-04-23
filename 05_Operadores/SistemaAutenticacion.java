import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        final var USUARIO_VALIDO = "admin";
        final var PASSWORD_VALIDO = "123";
        Scanner consola = new Scanner(System.in);
        String usuario, password;
        boolean esValido;
        
        
        System.out.println("*** Sistema de Autenticación ***");

        System.out.print("Ingrese su Usuario: ");
        usuario = consola.nextLine();

        System.out.print("Ingrese su Password: ");
        password = consola.nextLine();

        consola.close();

        esValido = usuario.equals(USUARIO_VALIDO) && password.equals(PASSWORD_VALIDO);

        System.out.println("Datos son correctos? " + esValido);
    }
}
