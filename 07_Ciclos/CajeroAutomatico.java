import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float saldo = 1000, monto;
        boolean salir = false;

        while (!salir) {
            monto = 0F;
            System.out.println("""
                    \n*** Aplicacion de Cajero Automatico ***
                    1. Consultar Saldo
                    2. Retiro
                    3. Depositar
                    4. Salir
                    """);

            System.out.print("Ingrese una opcion: ");
            int opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    // Consultar el saldo
                    System.out.printf("Tu saldo actual es de: $%.2f%n", saldo);
                    break;
                case 2:
                    // Retirar
                    System.out.print("Ingrese el monto a retirar: ");
                    monto = input.nextFloat();

                    if (monto > 0) {
                        if (monto < saldo) {
                            saldo -= monto;
                            System.out.println("Saldo retirado exitosamente.");
                            System.out.printf("Tu nuevo saldo es: $%.2f%n", saldo);
                        } else {
                            System.out.printf("No cuenta con el saldo suficiente. Saldo actua es: $%.2f%n", saldo);
                        }
                    } else {
                        System.out.println("La cantidad del monto a retirar es Invalida.");
                    }
                    break;
                    case 3:
                    // Depositar
                    System.out.print("Ingrese el monto a depositar: ");
                    monto = input.nextFloat();
                    
                    if (monto > 0) {
                        saldo += monto;
                        System.out.println("Saldo depositado exitosamente.");
                        System.out.printf("Tu nuevo saldo es: $%.2f%n", saldo);
                    } else {
                        System.out.println("La cantidad de saldo a depositar no es valida.");
                    }
                    break;
                case 4:
                    // Salir
                    salir = true;
                    input.close();
                    break;
                default:
                    System.out.println("Opcion No valida.");
                    break;
            }
        }
        System.out.println("Fin del Programa...");
    }
}
