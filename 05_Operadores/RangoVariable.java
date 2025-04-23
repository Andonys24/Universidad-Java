import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int dato;
        boolean estaDentroRango, estaFueraRango;

        System.out.print("Proporciona un dato entero: ");
        dato = Integer.parseInt(consola.nextLine());

        // Revisamos si está dentro de rango (entre 1 y 10)
        estaDentroRango = dato >= 1 && dato <= 10;
        System.out.println("Variable dentro de rango (1 y 10) ? " + estaDentroRango);

        consola.close();

        // Revisar la logica inversa, si el dato está fuera de rango
        estaFueraRango = !estaDentroRango;
        System.out.println("Variable fuera de rango (1 y 10)? " + estaFueraRango);

    }
}
