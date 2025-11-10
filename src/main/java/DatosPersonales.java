import java.util.ArrayList;

public class DatosPersonales {
    private String nombre;
    private int edad;
    private String email;
    private Direccion direccion;
    private ArrayList<String> lenguajes;

    public DatosPersonales(String nombre, int edad, String email, Direccion direccion, ArrayList<String> lenguajes) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.direccion = direccion;
        this.lenguajes = lenguajes;
    }

    public DatosPersonales() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public ArrayList<String> getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(ArrayList<String> lenguajes) {
        this.lenguajes = lenguajes;
    }

    @Override
    public String toString() {
        return "DatosPersonales{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                ", direccion=" + direccion +
                ", lenguajes=" + lenguajes +
                '}';
    }
}
