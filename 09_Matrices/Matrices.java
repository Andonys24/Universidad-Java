import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        final int FILAS = 2;
        final int COLUMNAS = 3;
        int filas, columnas;
        Scanner input = new Scanner(System.in);
        // Definir una matriz
        int[][] matriz = new int[FILAS][COLUMNAS]; // Forma 1
        // var matriz = new int[FILAS][COLUMNAS]; // Forma 2
        var matriz2 = new int[][] {
                { 100, 200, 300 },
                { 400, 500, 600 }
        };

        int[][] matriz3 = null;

        // Modificar los valores de la matriz [fila][columna]
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        // Acceder a los valores
        System.out.println("Matrizp[0][0] = " + matriz[0][0]);
        System.out.println("Matrizp[1][1] = " + matriz[1][1]);

        // Recorrer la matriz
        System.out.println("\nRecorriendo los valores de la matriz...");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.println("matriz[" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }

        // Recorrer la matriz2
        System.out.println("\nRecorriendo los valores de la matriz2...");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.println("matriz2[" + i + "][" + j + "] = " + matriz2[i][j]);
            }
        }

        // Introducir valores a una matriz
        System.out.print("Ingrese la cantidad de filas: ");
        filas = input.nextInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        columnas = input.nextInt();

        // Definir cat de filas y columnas
        matriz3 = new int[filas][columnas];

        // Solicitar los valores
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor de matriz3[" + i + "][" + j + "]: ");
                matriz3[i][j] = input.nextInt();
            }
        }

        input.close();

        // Imprimir los valores
        System.out.println("\nRecorriendo los valores de la matriz3...");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("matriz[" + i + "][" + j + "] = " + matriz3[i][j]);
            }
        }
    }
}
