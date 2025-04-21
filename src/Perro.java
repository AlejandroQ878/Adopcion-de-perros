public class Perro {
    private String placa;
    private String nombre;
    private String raza;
    private int edad;
    private String tamaño;

    public Perro(String nombre, String raza, int edad, String tamaño) {
    }

    public Perro(java.lang.String placa, java.lang.String nombre, java.lang.String raza, int edad, java.lang.String tamaño) {
        this.placa = placa;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String gettamaño() {
        return tamaño;
    }

    public void settamaño(String tamaño) {
        tamaño = tamaño;
    }

    @Override
    public java.lang.String toString() {
        return "Perro{" +
                "placa='" + placa + '\'' +
                ", nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", String='" + tamaño + '\'' +
                '}';
    }
}
