import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        int catCalif = 0;
        float[] calificaciones = null;
        float suma = 0, promedio = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("*** Promedio de Calificaciones ***\n");

        // Pedir cantidad de calificaciones
        System.out.print("Ingrese la cantidad de calificaciones a ingresar: ");
        catCalif = input.nextInt();

        // Crear nuevo arreglo
        calificaciones = new float[catCalif];

        // Pedir valor de cada calificacion
        for (int i = 0; i < catCalif; i++) {
            System.out.print("Ingrese la califiacion " + (i + 1) + ": ");
            calificaciones[i] = input.nextFloat();
        }

        input.close();
        
        // Sumar todos los valores
        for (int i = 0; i < catCalif; i++) {
            suma += calificaciones[i];
        }

        promedio = suma / catCalif;

        // Imprimir Promedio
        System.out.printf("El promedio de las calificaciones es: %.2f%% %n", promedio);

    }
}
