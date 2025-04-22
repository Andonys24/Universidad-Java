import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        String nombreEmpleado;
        int edadEmpleado;
        float salarioEmpleado;
        boolean esJefeDepartamento;

        System.out.println("*** Sistema de Empleados ***");

        // Nombre del empleado
        System.out.print("Nombre del empleado: ");
        nombreEmpleado = consola.nextLine();

        
        // Edad del empleado
        System.out.print("Edad del empleado: ");
        edadEmpleado = Integer.parseInt(consola.nextLine());
        
        // Salario del Empleado
        System.out.print("Salario del empleado: ");
        salarioEmpleado = Float.parseFloat(consola.nextLine());

        // Es jefe de Departamento
        System.out.print("Es jefe de departamento (true/false)?:");
        esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        consola.close();

        // Imprimir valores del empleado
        System.out.println("\nDatos del empleado:");
        System.out.println("\tNombre: " + nombreEmpleado);
        System.out.println("\tEdad: " + edadEmpleado + " años");
        // System.out.println("\tSalario: $" + salarioEmpleado);
        System.out.printf("\tSalario: $%.2f%n", salarioEmpleado);
        System.out.println("\tEs jefe de Departamento?: " + esJefeDepartamento);
    }
}
