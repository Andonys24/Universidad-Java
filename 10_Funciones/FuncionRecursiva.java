public class FuncionRecursiva {
    // Imprimir los numeros del num al 1 usando una funcion recursiva
    static void recursividad(int num){
        System.out.println(num + " ");

        if (num <= 1) return;

        recursividad(num - 1);
    }
    public static void main(String[] args) {
        recursividad(5);
    }
}
