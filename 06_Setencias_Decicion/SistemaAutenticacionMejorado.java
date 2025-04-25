import java.util.Scanner;

public class SistemaAutenticacionMejorado {
    public static void main(String[] args) {
        final var USUARIO_VALIDO = "admin";
        final var PASSWORD_VALIDO = "123";
        String usuario, password, mensajeAutenticacion;
        Scanner input = new Scanner(System.in);
        
        System.out.println("*** Sistema de Autenticación ***");

        System.out.print("Ingresa tu usuario: ");
        usuario = input.nextLine().strip();

        System.out.print("Ingresa tu password: ");
        password = input.nextLine().strip();

        input.close();

        // Cada caso de validacion de usuario y password
        mensajeAutenticacion = switch (usuario) {
            case USUARIO_VALIDO -> {
                if (PASSWORD_VALIDO.equals(password))
                    yield "Bienvenido al Sistema!";
                else
                    yield "Password incorrecto, intentelo denuevo!";
            }
            default -> {
                if (PASSWORD_VALIDO.equals(password))
                    yield "Usuario incorrecto, intentelo denuvo!";
                else
                    yield "Usuario y password incorrectos, intentelo denuevo!";
            }
        };
        // Imprimir el mensaje
        System.out.println(mensajeAutenticacion);
    }
}
