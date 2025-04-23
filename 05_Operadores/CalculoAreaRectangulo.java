import java.util.Scanner;

public class CalculoAreaRectangulo {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int base, altura, area, perimetro;

        System.out.println("*** Cálculo del Área de un Rectángulo ***");

        System.out.print("Proporciona la base: ");
        base = Integer.parseInt(consola.nextLine());

        System.out.print("Proporciona la altura: ");
        altura = Integer.parseInt(consola.nextLine());

        consola.close();

        // Realizamos los calculos
        area = base * altura;
        perimetro = 2 * (base + altura);

        // imprimir resultado:
        System.out.println("\nÁrea del rectángulo: " + area + " u^2");
        System.out.println("Perímetro del rectángulo: " + perimetro + " u");
    }
}
