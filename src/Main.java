import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();
        List<Perro> perros = new ArrayList<>();
        Persona persona1 = new Persona();
        int opc;

        do {
            System.out.println("""
                    ADOPTA TU MASCOTA
                    1.REGISTRAR PERSONA
                    2.REGISTRAR PERRO
                    3.MOSTRAR USUARIOS
                    4.MOSTRAR PERROS DISPONIBLES
                    5.ADOPTAR PERRO
                    6.CONSULTAR PERRO MAS VIEJO ADOPTADO
                    7 SALIR
                    """);
            opc = teclado.nextInt();
            switch(opc){

                case 1->{
                    String nombre;
                    String apellido;
                    int edad;
                    String documento;
                    teclado.nextLine();
                    System.out.println("INGRESE SU NOMBRE");
                    nombre = teclado.nextLine();
                    System.out.println("INGRESE SU APELLIDO");
                    apellido = teclado.nextLine();
                    System.out.println("INGRESE SU EDAD");
                    edad = teclado.nextInt();
                    System.out.println("INGRESE SU NUMERO DE DOCUMENTO");
                    documento = teclado.nextLine();

                    personas.add(new Persona());
                }

                case 2->{
                    String placa;
                    String nombre;
                    String raza;
                    int edad;
                    String tamaño;
                    System.out.println("INGRESE PLACA DEL PERRO");
                    placa = teclado.nextLine();
                    System.out.println("INGRESE NOMBRE DEL PERRO");
                    nombre = teclado.nextLine();
                    System.out.println("INGRESE LA RAZA DEL PERRO");
                    raza = teclado.nextLine();
                    System.out.println("INGRESE LA EDAD DE PERRO");
                    edad = teclado.nextInt();
                    System.out.println();
                    tamaño = teclado.nextLine();

                    perros.add(new Perro(nombre, raza, edad, tamaño));

                }

                case 3->{

                }

                case 4->{

                }

                case 5->{

                }

                case 6->{

                }


            }

        }while(opc!=7);
    }
}