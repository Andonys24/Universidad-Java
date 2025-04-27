import java.util.Random;
import java.util.Scanner;

public class SumaDiagonal {
    public static void main(String[] args) {
        int filasColumnas, suma = 0;
        int[][] matriz = null;
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese la cantidad de (filas/columnas): ");
        filasColumnas = input.nextInt();
        input.close();

        matriz = new int[filasColumnas][filasColumnas];

        // Llenar la matriz con valores randoms
        for (int i = 0; i < filasColumnas; i++) {
            for (int j = 0; j < filasColumnas; j++) {
                matriz[i][j] = 10 + random.nextInt(89); // Llenar con valores entre [1, 100]
            }
        }

        // Imprimir Matriz
        System.out.println("Imprimiendo los valores de la matriz...\n");
        for (int i = 0; i < filasColumnas; i++) {
            System.out.print("| ");
            for (int j = 0; j < filasColumnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }

        // Sumas los elementos de la Diagonal principal
        for (int i = 0; i < filasColumnas; i++) {
            suma += matriz[i][i];
        }

        // Imprimir resultado
        System.out.println("\nLa suma de los valores de la diagonal principal es: " + suma);
    }
}
