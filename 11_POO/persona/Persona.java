package persona;

public class Persona extends Object {
    private static int contadorPersonas = 0;
    private int idPersona;
    private String nombre, apellido, email, celular;

    // Constructor por defecto
    public Persona() {
        this.nombre = "Sin nombre";
        this.apellido = "Sin apellido";
        this.email = "Sin email";
        this.celular = "Sin celular";
        this.idPersona = ++contadorPersonas;
    }

    // Constructor con parámetros
    public Persona(String nombre, String apellido, String email, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular = celular;
        this.idPersona = ++contadorPersonas;
    }

    // Sobrescritura del método toString
    @Override
    public String toString() {
        return "Persona{\n" +
                "\tidPersona : '" + this.idPersona + "',\n" +
                "\tnombre : '" + this.nombre + "',\n" +
                "\tapellido : '" + this.apellido + "'\n" +
                "\temail : '" + this.email + "',\n" +
                "\tcelular : '" + this.celular + "',\n" +
                "\tTipo : '" + super.toString() + "',\n" +
                "\n}";
    }

    // Getters y Setters
    public static int getContadorPersonas() {
        return Persona.contadorPersonas;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getEmail() {
        return this.email;
    }

    public String getCelular() {
        return this.celular;
    }

    public void getDatos() {
        System.out.println("====== Datos de " + this.nombre + " ======");
        System.out.println("ID: " + this.idPersona);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Email: " + this.email);
        System.out.println("Celular: " + this.celular);
        System.out.println();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

}