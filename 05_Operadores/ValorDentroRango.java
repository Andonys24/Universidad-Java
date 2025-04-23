import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        // Definimos los limites
        final int MINIMO = 0;
        final int MAXIMO = 5;
        int dato;
        boolean estaDentroRango;

        System.out.println("*** Valor Dentro Rango ***");
        // Solicitar un valor entre 0 y 5
        System.out.print("Proporciona un dato entre 0 y 5: ");
        dato = Integer.parseInt(consola.nextLine());
        consola.close();

        // Verificar si el dato esta dentro de rango
        estaDentroRango = (MINIMO <= dato) && (dato <= MAXIMO);
        System.out.println("estaDentroRango?  " + estaDentroRango);

        
    }
}
