import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();
        List<Perro> perro = new ArrayList<>();
        Persona persona1 = new Persona();

        int opc;

        do {
            System.out.println("""
                    ADOPTA TU MASCOTA
                    1.REGISTRAR PERSONA
                    2.REGISTRAR PERRO DISPONIBLES
                    3.MOSTRAR USUARIOS
                    4.MOSTRAR PERROS DISPONIBLES
                    5.ADOPTAR PERRO
                    6.CONSULTAR PERRO MAS VIEJO ADOPTADO
                    7 SALIR
                    """);
            opc = teclado.nextInt();
            switch (opc) {

                case 1 -> {
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
                    teclado.nextLine();
                    documento = teclado.nextLine();

                    personas.add(new Persona(nombre, apellido, edad, documento));
                }

                case 2 -> {
                    String placa;
                    String nombre;
                    String raza;
                    int edad;
                    String tamaño;

                    System.out.println("INGRESE PLACA DEL PERRO");
                    placa = teclado.next();
                    System.out.println("INGRESE NOMBRE DEL PERRO");
                    nombre = teclado.next();
                    System.out.println("INGRESE LA RAZA DEL PERRO");
                    raza = teclado.next();
                    System.out.println("INGRESE LA EDAD DE PERRO");
                    edad = teclado.nextInt();
                    System.out.println("INGRESE TAMAÑO DEL PERRO");
                    tamaño = teclado.next();

                    perro.add(new Perro(placa,nombre,raza,edad,tamaño,true));

                }

                case 3 -> {
                    for (Persona a : personas) {
                        if (a instanceof Persona) {
                            System.out.println(a);
                        }
                    }

                }

                case 4 -> {
                    for (Perro b : perro) {
                        if (b.isEstado()) {
                            System.out.println(b);
                        }
                    }


                }

                case 5 -> {

                    String documento2;
                    String placa2;

                    System.out.println("INGRESE SU DOCUMENTO");
                    documento2 = teclado.next();

                    System.out.println("INGRESE LA PLACA DEL PERRO QUE QUIERE ADOPTAR");
                    placa2 = teclado.next();


                    for(Persona u : personas){
                        if(u.getDocumento().equalsIgnoreCase(documento2)){
                            for(Perro e : perro){
                                if(e.getPlaca().equalsIgnoreCase(placa2)){
                                    u.adoptarPerro(e);
                                }
                            }


                        }


 }


                }

                case 6 -> {
                    String documento3;
                    System.out.println("Ingrese su documento: ");
                    documento3 = teclado.next();
                    for(Persona u : personas) {
                        if(u.getDocumento().equals(documento3)){
                            System.out.println(u.perroMasGrande());
                        }
                    }

                }


            }

        } while (opc != 7);
    }
}