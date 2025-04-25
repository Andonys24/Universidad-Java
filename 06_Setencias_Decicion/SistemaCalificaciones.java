import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        float nota;
        char letra;
        Scanner input = new Scanner(System.in);

        System.out.println("*** Sistema de calificaciones ***");
        System.out.print("Ingrese su nota [0, 10]: ");
        nota = input.nextFloat();
        
        input.close();
        
        // Revisar valores
        if (nota >= 9 && nota <= 10) {
            letra = 'A';
        } else if (nota >= 8 & nota < 9) {
            letra = 'B';
        } else if (nota >= 7 && nota < 8) {
            letra = 'C';
        } else if (nota >= 6 && nota < 7) {
            letra = 'D';
        } else if (nota >= 0 && nota < 6) {
            letra = 'F';
        } else {
            letra = '\0';
            System.out.println("Calificacion incorrecta.");
        }

        if (nota != '\0') {
            System.out.printf("Calificación %.2f es equivalente a %c%n", nota, letra);
        }
    }
}
