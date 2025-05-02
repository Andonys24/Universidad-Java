package exepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {

        try {
            var resultado = Aritmetica.division(10, 2);
            System.out.println("resultado = " + resultado);
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e);
        } finally {
            // Simpre se va a ejecutar
            System.out.println("Se reviso la division entre 0.");
        }

    }
}
