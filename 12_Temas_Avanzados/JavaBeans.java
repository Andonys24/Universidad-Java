import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("karla");
        persona.setApellido("Lara");

        System.out.println("persona = " + persona);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
    }
}

// Implementar la interface serializable
class Persona implements Serializable {
    // Aplicar concepto de encapsulamiento
    private String nombre;
    private String apellido;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Debe tenr un constructor vacio (puede tener mas constructores)
    public Persona() {
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + this.nombre + "\'" +
                ", apellido='" + this.apellido + "\'" +
                "}";
    }

}