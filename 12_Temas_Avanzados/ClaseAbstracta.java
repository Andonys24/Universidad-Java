public class ClaseAbstracta {
    public static void main(String[] args) {
        // FiguraGeometrica figuraGeommetrica = new FiguraGeometrica(); // No se puede instanciar una clase abstracta
        FiguraGeometrica figuraGeometrica = new Rectangulo(); // Se puede instanciar una clase hija
        figuraGeometrica.dibujar(); // Se llama al método dibujar de la clase hija (Polimorfismo)
        figuraGeometrica = new Circulo(); // Se puede instanciar una clase hija
        figuraGeometrica.dibujar(); // Se llama al método dibujar de la clase hija (Polimorfismo)
    }
}

abstract class FiguraGeometrica{
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica {

    @Override
    public void dibujar(){
        System.out.println("Dibujando el Rectangulo...");
    }
}

class Circulo extends FiguraGeometrica {

    @Override
    public void dibujar(){
        System.out.println("Dibujando el Circulo...");
    }
}