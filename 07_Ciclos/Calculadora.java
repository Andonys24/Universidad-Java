import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        boolean fin = false;
        Scanner input = new Scanner(System.in);

        while (!fin) {
            double a = 0, b = 0, resultado = 0;
            String operacionRealizada = "";

            System.out.print("""
                    *** Calculadora en Java ***
                        1. Suma
                        2. Resta
                        3. Multiplicacion
                        4. Division
                        5. Salir
                        """);
            System.out.print("Ingrese una opcion: ");
            int opc = input.nextInt();

            if (opc >= 1 && opc <= 4) {
                System.out.print("Ingrese el valor de a: ");
                a = input.nextDouble();

                System.out.print("Ingrese el valor de b: ");
                b = input.nextDouble();
            }

            switch (opc) {
                case 1:
                    // Suma
                    resultado = a + b;
                    operacionRealizada = "suma";
                    break;
                case 2:
                    // Resta
                    resultado = a - b;
                    operacionRealizada = "resta";
                    break;
                case 3:
                    // Multiplicacion
                    resultado = a * b;
                    operacionRealizada = "multiplicacion";
                    break;
                case 4:
                    // Division
                    if (b != 0) {
                        resultado = a / b;
                    } else {
                        System.out.println("Error: Division por cero.");
                        resultado = 0;
                    }
                    operacionRealizada = "division";
                    break;
                case 5:
                    // Salir del programa
                    fin = true;
                    input.close();
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida.\n");
                    break;
            }

            if (!fin && (opc >= 1 && opc <= 4)) {
                System.out.printf("El resultado de la %s es: %.2f%n%n", operacionRealizada, resultado);
            }
        }
        System.out.println("Fin del programa.");

    }
}
