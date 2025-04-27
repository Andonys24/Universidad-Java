public class FuncionSumar {

    static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int arg1 = 3, arg2 = 8, resultado = 0;

        resultado = sumar(arg1, arg2);
        
        System.out.println("El resultado de la suma es = " + sumar(arg1, arg2));
        System.out.println("resultado = " + resultado);
        
        resultado = sumar(arg2, arg2);
        System.out.println("resultado = " + resultado);
    }
}
