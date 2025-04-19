public class GeneradorEmails {
    public static void main(String[] args) {
        String nombre = " Juan Roberto Lopez ";
        String empresa = " Banco ICBC ";
        String dominio = "hn";
        String email = "";

        
        System.out.println("*** Generador de Emails ***");
        System.out.println();
        
        // Normalizar nombre
        nombre = nombre.strip(); // Quitar espacios de los lados
        nombre = nombre.replace(" ", "."); // Remplazar espacios por puntos

        // Normalizar Datos empresa
        empresa = empresa.strip();
        empresa = empresa.replace(" ", ".");

        // Normalizar dominio
        dominio = ".com." + dominio;

        // Crear Email
        email = email.concat(nombre).concat("@").concat(empresa).concat(dominio).toLowerCase();

        System.out.println("Email: " + email);
    }
}
