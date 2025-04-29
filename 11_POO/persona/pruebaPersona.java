package persona;

public class pruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creacion de Clase y Objetos Persona ***\n");
        // Creacion de obj persona con el constructor por defecto
        Persona persona1 = new Persona();

        // Creacion de obj persona con el constructor con argumentos
        Persona persona2 = new Persona("Juanito", "Perez", "correro@correo.com", "123456789");

        // Imprimir los datos de la persona 1
        System.out.println("Persona 1:");
        persona1.getDatos();

        // Imprimir los datos de la persona 2
        System.out.println("Persona 2:");
        persona2.getDatos();
        System.out.println();

        // Modificar los datos de la persona 1
        persona1.setNombre("Juan");
        persona1.setApellido("Pérez");
        persona1.setEmail("juanperez@corre.com");
        persona1.setCelular("987654321");

        // Imprimir los datos de la persona 1
        System.out.println("Persona 1 Modificada:");
        persona1.getDatos();

        // Imprimir la modificacion del metodo toString
        System.out.println("Persona 1 Modificada:");
        System.out.println(persona1.toString());

        // Imprmir el total de personas creadas
        System.out.println("\nTotal de personas creadas: " + Persona.getContadorPersonas());
        
    }
}
