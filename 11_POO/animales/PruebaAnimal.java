package animales;

public class PruebaAnimal {
    static void imprimirSonido(Animal animal) {
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        System.out.println("\n*** Ejemplo de Herencia ***\n");
        System.out.println("Creando un objeto de la clase Animal (superclase)");
        Animal animal = new Animal();
        animal.comer();
        animal.dormir();
        animal.hacerSonido();

        System.out.println("\nCreando un objeto de la clase Perro (subclase)");
        Perro perro = new Perro();
        perro.comer();
        perro.dormir();
        perro.hacerSonido();
        perro.correr();
        perro.jugar();

        System.out.println("\nCreando un objeto de la clase Gato (subclase)");
        Gato gato = new Gato();
        gato.comer();
        gato.dormir();
        gato.hacerSonido();

        System.out.println("\n*** Ejemplo de Polimorfismo ***\n");

        // Polimorfismo: se puede usar un objeto de la subclase como si fuera de la
        // superclase
        imprimirSonido(animal);
        imprimirSonido(perro);
        imprimirSonido(gato);

    }
}