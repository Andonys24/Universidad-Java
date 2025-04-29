package animales;

public class Animal {
    protected void comer() {
        System.out.println("El animal está comiendo");
    }

    protected void dormir() {
        System.out.println("El animal está durmiendo");
    }

    protected void hacerSonido() {
        System.out.println("El animal está haciendo un sonido");
    }
}

class Perro extends Animal {

    @Override
    protected void hacerSonido() { // Sobrescribiendo el método hacerSonido
        System.out.println("El perro está ladrando");
    }

    @Override
    protected void dormir() { // Sobrescribiendo el método dormir
        System.out.println("El perro está durmiendo en su cama");
    }

    @Override
    protected void comer() { // Sobrescribiendo el método comer
        super.comer(); // Llamando al método dormir de la superclase
        System.out.println("El perro está comiendo croquetas");
    }

    // Métodos específicos de la clase Perro
    protected void correr() {
        System.out.println("El perro está corriendo");
    }

    protected void jugar() {
        System.out.println("El perro está jugando");
    }

}

class Gato extends Animal {

    @Override
    protected void hacerSonido() { // Sobrescribiendo el método hacerSonido
        System.out.println("El gato está maullando");
    }

    @Override
    protected void dormir() { // Sobrescribiendo el método dormir
        System.out.println("El gato está durmiendo en su cama");
    }

    @Override
    protected void comer() { // Sobrescribiendo el método comer
        System.out.println("El gato está comiendo croquetas");
    }

}
