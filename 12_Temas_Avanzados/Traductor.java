public interface Traductor {
    // Public y Abstract
    public void traducir();

    // Metodos con implementacion por default
    default void iniciarTraduccion() {
        System.out.println("Iniciando traductor...");
    }
}

class Ingles implements Traductor {
    @Override
    public void traducir() {
        System.out.println("Traduciendo a Ingles...");
    }
}
class Frances implements Traductor {
    @Override
    public void traducir() {
        System.out.println("Traduciendo a Frances...");
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        Traductor frances = new Frances();

        ingles.iniciarTraduccion();
        ingles.traducir();
        frances.traducir();
    }
}