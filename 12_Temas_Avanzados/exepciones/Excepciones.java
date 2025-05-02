package exepciones;

public class Excepciones {
    public static void main(String[] args) {

        int valor1 = 10, valor2 = 0;
        double resultado = 0;

        System.out.println("*** Try-Catch Generico ***");
        try {
            resultado = valor1 / valor2;
            System.out.println("resultado = " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally { // Se ejecuta siempre
            System.out.println("Se reviso la division entre 0.");
        }

        System.out.println("\n*** Try-Catch con Aritmetica ***");
        try {
            resultado = Aritmetica.division(valor1, valor2);
            System.out.println("resultado = " + resultado);
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e);
        } finally {
            // Simpre se va a ejecutar
            System.out.println("Se reviso la division entre 0.");
        }

        System.out.println("\n*** Try-Catch Con diferentes Exepciones ***");
        try {
            resultado = valor1 / valor2;
            System.out.println("resultado = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division entre 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Acceso a un elemento fuera de rango");
        } catch (ClassCastException e) {
            System.out.println("Error: No se puede convertir el tipo de dato");
        } catch (NullPointerException e) {
            System.out.println("Error: Se intento acceder a un objeto nulo");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally { // Se ejecuta siempre
            System.out.println("Se reviso la division entre 0.");
        }

    }
}
