public class FormateoCadenas {
    public static void main(String[] args) {
        String nombre = "Matias", mensaje;
        int edad = 35, numEmpleado = 12;
        float salario = 21000.50F;

        System.out.println("*** Formateo de Cadenas ***");

        // String.format
        mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f", nombre, edad, salario);
        System.out.println("mensaje = " + mensaje);

        // Metodo printf
        System.out.printf("Nombre: %s, Edad: %s, Salario: $%.2f%n", nombre, edad, salario);

        // Formateo con text Block
        System.out.println("*** Formateo con text Block ***");

        mensaje = """
                %nDetalle Persona:\s
                --------------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d
                \tSalario: $%.2f
                """.formatted(nombre, numEmpleado, edad, salario);

        System.out.println("mensaje: " + mensaje);
        
        // Formateo con text Block y printf
        System.out.printf("""
                %nDetalle Persona:\s
                --------------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d
                \tSalario: $%.2f
                """, nombre, numEmpleado, edad, salario);

    }
}
