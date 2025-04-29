package aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo de Aritmetica ***\n");

        System.out.println("Objeto de Aritmetica1 con constructor\n");
        Aritmetica aritmetica1 = new Aritmetica(5, 7);
        // aritmetica1.operando1 = 5; // No se puede acceder directamente a los atributos privados
        // aritmetica1.operando2 = 7; // No se puede acceder directamente a los atributos privados
        aritmetica1.setOperando1(10);
        aritmetica1.setOperando2(15);
        aritmetica1.getOperadores();
        System.out.println("---------------------");
        aritmetica1.sumar();
        aritmetica1.restar();
        aritmetica1.multiplicar();
        aritmetica1.dividir();
        aritmetica1.getDirMemoria();
        System.out.println("Direccion de memoria de aritmetica1: " + aritmetica1);
        System.out.println("\nFin de objeto Aritmetica1\n---------------------\n");

        System.out.println("Objeto de Aritmetica2 con constructor\n");
        Aritmetica aritmetica2 = new Aritmetica(12, 16);
        // aritmetica2.operando1 = 12; // No se puede acceder directamente a los atributos privados
        // aritmetica2.operando2 = 16; // No se puede acceder directamente a los atributos privados
        aritmetica2.getOperadores();
        System.out.println("---------------------");
        aritmetica2.sumar();
        aritmetica2.restar();
        aritmetica2.multiplicar();
        aritmetica2.dividir();
        aritmetica2.getDirMemoria();
        System.out.println("Direccion de memoria de aritmetica2: " + aritmetica2);
        System.out.println("\nFin de objeto Aritmetica2\n---------------------\n");

        System.out.println("Objeto de Aritmetica con constructor por defecto\n");
        Aritmetica aritmetica3 = new Aritmetica();
        aritmetica3.getOperadores();
        System.out.println("---------------------");
        aritmetica3.sumar();
        aritmetica3.restar();
        aritmetica3.multiplicar();
        aritmetica3.dividir();
        System.out.println("\nFin de objeto Aritmetica3\n---------------------\n");
    }
}
