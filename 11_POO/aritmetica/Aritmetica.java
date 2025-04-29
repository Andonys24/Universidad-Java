package aritmetica;

public class Aritmetica {
    private int operando1, operando2;

    // Constructor por defecto
    public Aritmetica() {
        this.operando1 = 0;
        this.operando2 = 0;
    }

    // Constructor
    public Aritmetica(int operando1, int operando2) {
        // Operador this
        // System.out.println("Ejecutando constructor");
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public void sumar() {
        int resultado = operando1 + operando2;
        System.out.println("La suma es: " + resultado);
    }

    public void restar() {
        int resultado = operando1 - operando2;
        System.out.println("La resta es: " + resultado);
    }

    public void multiplicar() {
        int resultado = operando1 * operando2;
        System.out.println("La multiplicacion es: " + resultado);
    }

    public void dividir() {
        if (operando2 != 0) {
            int resultado = operando1 / operando2;
            System.out.println("La division es: " + resultado);
        } else {
            System.out.println("No se puede dividir entre cero");
        }
    }

    // Getters y Setters
    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

    public void getOperadores() {
        System.out.println("Operando 1: " + getOperando1());
        System.out.println("Operando 2: " + getOperando2());
    }

    public void getDirMemoria() {
        System.out.println("Direccion de memoria de Aritmetica: " + this);
    }
}
