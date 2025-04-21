import java.util.ArrayList;
import java.util.List;

public class Persona {
    public List<Perro> perros = new ArrayList<>();
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;

    public Persona() {
    }

    public Persona(List<Perro> perros, String nombre, String apellido, int edad, String documento) {
        this.perros = perros;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public void adoptarPerro(Perro perros){


        public String perroMasGrande(){
            return "";
        }

    }
    public List<Perro> getPerros() {
        return perros;
    }

    public void setPerros(List<Perro> perros) {
        this.perros = perros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "perros=" + perros +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", documento='" + documento + '\'' +
                '}';
    }
}
