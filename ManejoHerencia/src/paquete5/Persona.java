package paquete5;

/**
 *
 * @author Alexito
 */
public class Persona {

    private String nombre;
    private String apellido;
    private String username;

    public Persona(String n, String a, String u) {
        nombre = n;
        apellido = a;
        username = u;
    }

    
    
    public void establecerApellido(String n) {
        apellido = n;
    }

    public void establecerUsername(String n) {
        username = n;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerUsername() {
        return username;
    }

    @Override
    public String toString() {

        return String.format("\tNombre: %s\n"
                + "\tApellido: %s\n"
                + "\tUsername: %s\n",nombre,apellido,username);
    }
}
