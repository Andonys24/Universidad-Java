import java.util.Scanner;

public class EstacionAnio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mes;
        String estacion = "";

        System.out.println("*** Estación del Año ***");


        System.out.print("Proporciona el valor del mes (1-12): ");
        mes = input.nextInt();
        // mes = Integer.parseInt(input.nextLine());

        input.close();
        if(mes == 1 || mes == 2 || mes == 12)
            estacion = "Invierno";
        else if(mes >= 3 && mes <= 5)
            estacion = "Primavera";
        else if(mes >= 6 && mes <= 8)
            estacion = "Verano";
        else if(mes >= 9 && mes <= 11)
            estacion = "Otoño";
        else
            estacion = "Estación desconcida";

        // Imprimimos el resultado
        System.out.printf("La estación para el mes %d es %s%n", mes, estacion);
    }
}
