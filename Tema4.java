import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tema4 {


    private static Scanner sc = new Scanner(System.in);

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String direccion;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    private String telefono;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void VideoTienda() {
        boolean respuesta;
        int opcion;

        System.out.println("2. **** Bienvenidos a la Video Tienda Porvenir ****");
        System.out.println(" ");

        registroUsuario();
        do {
            sc = new Scanner(System.in);

            menu();
            opcion = capturaopcion();
            respuesta = evaluaropcion(opcion);

        } while (respuesta == true);

    }

    private static void menu() {

        System.out.println(" **** Menu ****");
        System.out.println(" ");
        System.out.println(" Seleccione una opcion :");
        System.out.println("1. **** Peliculas disponibles ****");
        System.out.println("2. **** Alquiler de Peliculas ****");
        System.out.println("3. ** Comentario y Sugerencias de nuestas peliculas **");
        System.out.println("0. **** Salir del Menu ******** ");
        System.out.println("------------------------------------------------------");
        System.out.println(" ");

    }

    private static int capturaopcion() {

        return Integer.parseInt(sc.nextLine());

    }

    public void registroUsuario() {

        System.out.println("Ingrese su Nombre Completo");
        nombre = sc.nextLine();
        System.out.println("Ingrese su direccion");
        direccion = sc.nextLine();
        System.out.println("Ingrese su numero de telefono");
        telefono = sc.nextLine();
        System.out.println("Excelente " + nombre + " registro completo, continue con el menu :");
        System.out.println("  ");

    }


    private static boolean evaluaropcion(int opcion) {

        List<peliculas> lista = new ArrayList<peliculas>();

        switch (opcion) {
            case 1:
                System.out.println("Menu de Peliculas Disponibles");
                System.out.println(" ");

                lista.add(new peliculas(1, "Titanic", "Drama",
                        "(1998) Trasatlantico que se hundio durante su viaje inaugural"));
                lista.add(new peliculas(2, "La Vida es Bella", "Belico/Drama",
                        "(1999) Un hombre Construye una fantasia para proteger a su familia"));
                lista.add(new peliculas(3, "Pixeles", "Comedia",
                        "(2015) Jugadores de videojuegos reclutados para salvar al pais."));

                for (int i = 0; i < lista.size(); i++) {
                    System.out.println(lista.get(i).toString());
                    System.out.println(" ");
                }
                System.out.println("----------------------------------------------------");
                return true;

            case 2: 
                System.out.println("Seleccione la pelicula que desea ver :");
                
                 peliculas p1 = new peliculas();
                 p1.movie();
                 System.out.println("-----------------------------------------");
                 return true;
        
            case 3:
                
                System.out.println("Comentarios y Sugerencias");
                String comentarios = leerComentario();
                 System.out.println(" ");
                System.out.println("Gracias su opinion es muy importante.");
                System.out.println("-----------------------------------------");
                

                return true;
              

            case 0:
                System.out.println("*** Salir del sistema **** ");
                return false;

            default:

                System.out.println(" Opcion Invalida");
        }
        return true;
    }
     
    private static String leerComentario(){
        return sc.nextLine();
    }
    

}   
 








