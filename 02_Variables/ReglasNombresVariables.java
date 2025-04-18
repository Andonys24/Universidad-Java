public class ReglasNombresVariables {
    public static void main(String[] args) {
        String nombreCompleto = "Juan Carlos"; // Correcto, buenas practicas
        String NombreCompleto = "Carlos Miguel"; // Correcto, no aplica buenas practicas
        String nombre_cliente = "Luis Lopez"; // Correcto, no aplica buenas practicas
        String _apellido = "Perez"; // Correcto y aceptable
        String $apellido = "Juarez"; // Correcto y aceptable

        int totPzs = 10; // Correcto, no aplica buenas practicas
        int totalPiezas = 10; // Correcto, buenas practicas

        boolean casado = true; // Correcto, aun puede mejorar
        boolean esCasado = true; // Correcto, buenas practicas
        boolean tieneSaldo = true; // Correcto, buenas practicas

        System.out.println(nombreCompleto);
        System.out.println(NombreCompleto);
        System.out.println(nombre_cliente);
        System.out.println(_apellido);
        System.out.println($apellido);

        System.out.println(totPzs);
        System.out.println(totalPiezas);

        System.out.println(casado);
        System.out.println(esCasado);
        System.out.println(tieneSaldo);
    }
}