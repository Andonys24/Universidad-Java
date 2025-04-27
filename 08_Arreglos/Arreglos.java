import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        int largoElementos = 0;
        Scanner input = new Scanner(System.in);
        // Declarar y inicializar un arreglo
        int[] enteros = new int[5];
        // Forma simplificada de declara arreglos
        int[] numeros = { 100, 200, 300, 400, 500 };
        // var numeros = new int []{100, 200, 300, 400, 500};

        // Modificar los valores
        enteros[0] = 13;
        enteros[1] = 21;
        enteros[4] = 62;

        // Leer los valores del arreglo y iterar en ellos
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("enteros[" + i + "] = " + enteros[i]);
        }
        System.out.println();
        
        // Leer los valores del segundo arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }
        System.out.println();

        // Crear Arreglo de manera dinamica
        System.out.print("Ingrese el largo del arreglo: ");
        largoElementos = input.nextInt();
        var elementos = new int[largoElementos];

        // Solicitar valores del arreglo
        for (int i = 0; i < largoElementos; i++) {
            System.out.print("Ingrese el valor de elementos[" + i + "]:");
            elementos[i] = input.nextInt();
        }

        input.close();

        // Imprimir valores
        System.out.println("\nValores del arreglo de elementos");
        for (int i = 0; i < largoElementos; i++) {
            System.out.println("elementos[" + i + "] = " + elementos[i]);
        }
    }
}