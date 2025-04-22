import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("*** Numeros Aleatorios ***");
        Random random = new Random();
        int numeroAleatorio, dado;
        float flotanteAleatorio;

        // Generar un numero aleatorio entre 0 y 9
        numeroAleatorio = random.nextInt(10);
        System.out.println("numeroAleatorio = " + numeroAleatorio);
        
        // Generar un numero aleatorio entre 1 y 10
        numeroAleatorio = 1 + random.nextInt(10);
        System.out.println("numeroAleatorio = " + numeroAleatorio);

        // Generar un numero aleatorio entre 0.0 y 1.0
        flotanteAleatorio = random.nextFloat();
        System.out.println("flotanteAleatorio = " + flotanteAleatorio);

        // Simular el lanzamiento de un dado (1, 6)
        dado = 1 + random.nextInt(6);
        System.out.println("dado = " + dado);
    }
}
