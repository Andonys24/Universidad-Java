public class ReservaHoteles {
    public static void main(String[] args) {
        var nombreCliente = "Miguel Fiqueroa";
        var diasEntrada = 7;
        var tarifaDiaria = 1300.00F;
        var tieneVistaAlMar = true;

        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Dias de Entrada: " + diasEntrada);
        System.out.println("Taria Diaria: " + tarifaDiaria + "$");
        System.out.println("Vista al Mar: " + ((tieneVistaAlMar) ? "Si" : "No"));
        
        // Modificar Valores
        diasEntrada = 5;
        tarifaDiaria = 900.00F;
        tieneVistaAlMar = false;
        System.out.println();
        System.out.println("Nuevos datos de la reservacion");
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Dias de Entrada: " + diasEntrada);
        System.out.println("Taria Diaria: " + tarifaDiaria + "$");
        System.out.println("Vista al Mar: " + ((tieneVistaAlMar) ? "Si" : "No"));
    }
}
