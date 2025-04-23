public class OperadoresUnarios {
    public static void main(String[] args) {
        int a = 3, b = -2, resultado;

        System.out.println("*** Operadores Unarios ***");

        // Operador unario '+'
        resultado = +a;
        System.out.println("resultado +a = " + resultado);

        // Operador unario '-'
        resultado = -a;
        System.out.println("resultado -a = " + resultado);

        // *** Operadores unarios de incremento/decremento ***

        // Pre-Incremento: primero se incrementa el valor
        System.out.println("\n*** Pre-Incremento ***");
        resultado = ++a;
        System.out.println("resultado ++a = " + resultado);
        System.out.println("a ya se incremento = " + a);
        
        a = 3;

        // Post-Incremento: Primero se usa el valor y despues se incrementa
        System.out.println("\n*** Post-Incremento ***");
        resultado = a++;
        System.out.println("resultado a++ = " + resultado);
        System.out.println("a en este momento se incrementa = " + a);

        // Pre-Decremento: primero se decrementa el valor
        System.out.println("\n*** Pre-Decremento ***");
        resultado = --b;
        System.out.println("resultado --b = " + resultado);
        System.out.println("b ya se Decremento = " + b);

        b = -2;

        // Post-Decremento: Primero se usa el valor y despues se decrementa
        System.out.println("\n*** Post-Decremento ***");
        resultado = b--;
        System.out.println("resultado b-- = " + resultado);
        System.out.println("b en este momento se decremento = " + b);
    }
}
