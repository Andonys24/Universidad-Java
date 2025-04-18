public class Variables {
    public static void main(String[] args) {
        int edad = 19;
        double precio = 19.99;
        boolean esEstudiante = true;
        char genero;

        genero = 'M';

        // Acceder a las variables
        System.out.println("Edad: " + edad);
        edad = 20;
        System.out.println("Edad: " + edad);
        System.out.println("Precio: " + precio);
        precio = 20.99;
        System.out.println("Precio: " + precio);
        System.out.println("Es estudiante: " + esEstudiante);
        System.out.println("Género: " + genero);
    }
}