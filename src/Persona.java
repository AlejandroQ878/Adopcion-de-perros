import java.util.ArrayList;
import java.util.List;

public class Persona {
    private List<Perro> perroAdoptado = new ArrayList<>();
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String documento) {
        this.perroAdoptado = perroAdoptado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public void adoptarPerro(Perro perro){
        if(perroAdoptado.size()<3){
            perroAdoptado.add(perro);
            perro.setEstado(false);
            System.out.println("ADOPTO A "+perro.getNombre());
        }else{
            System.out.println("YA NO PUEDES ADOPTAR MAS PERROS");
        }
    }

    public String perroMasGrande(){
        if (perroAdoptado.get(0).getEdad()>=perroAdoptado.get(1).getEdad()&&perroAdoptado.get(0).getEdad()>=perroAdoptado.get(2).getEdad()){
            return perroAdoptado.get(0).getNombre();
        }
        else if (perroAdoptado.get(1).getEdad()>=perroAdoptado.get(0).getEdad()&&perroAdoptado.get(1).getEdad()>=perroAdoptado.get(2).getEdad()){
            return perroAdoptado.get(1).getNombre();
        }
        else if (perroAdoptado.get(2).getEdad()>=perroAdoptado.get(1).getEdad()&&perroAdoptado.get(2).getEdad()>=perroAdoptado.get(0).getEdad()){
            return perroAdoptado.get(2).getNombre();
        }else return "0";
    }

    public List<Perro> getPerro() {
        return perroAdoptado;
    }

    public void setPerro(List<Perro> perro) {
        this.perroAdoptado = perro;
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
                "perros=" +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", documento='" + documento + '\'' +
                '}';
    }
}
