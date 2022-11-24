
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Tema6 {
   static Date fechaHoy = new Date();
   private static Scanner sc = new Scanner(System.in);
   public static Calendar calendar = new GregorianCalendar();
   public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
   static  ArrayList <motos> moto = new ArrayList<motos>();

   public Tema6() {
}
private static String[] servicio = new String[5];

    public boolean motocicletas() {
        boolean respuesta= true;
        int opcion;

        do{
            menu();
            opcion = capturaopcion();
            switch (opcion){
                case 1:
                 System.out.println(" ***** Registro de Ingreso ****");
                 System.out.println(" ");
                 fechas();
                 registroMoto();
                 serviciosPrestados(servicio);

                return true;

                case 2:
                   mostrarMoto();
                 
                return true;

                case 3:
               
                 System.out.println("**** Registo de Salida ***");
                 System.out.println(" ");
                 registroSalida();
                 System.out.println("Fecha de Salida: " + sdf.format (fechaHoy));
                 
                return true;
                
               

                case 0:
                 System.out.println("**** Salir del sistema ***");
                 

                return false;


                default:
                 System.out.println(" Opcion Invalida");
        
                break;

            }

    
        } while (respuesta == true);
        return respuesta;



    }
    private static void menu() {

        System.out.println("Seleccione del menu de Usuario:");
        System.out.println(" ");
        System.out.println("1. ***** Registro de Ingreso ****");
        System.out.println("2 **** Motos en el Sistema ***** ");
        System.out.println("3. **** Registro de Salida ***");
        System.out.println("0. Salir del taller");
        System.out.println("------------------------------------------");

    }
    private static void registroMoto(){

        System.out.println("Ingrese el numero de la Placa");
         String placaMoto = sc.nextLine();
         System.out.println("Ingrese su nombre completo");
         String nombreDueño =sc. nextLine();
         System.out.println("Ingrese el modelo de la Moto");
         String modeloMoto = sc.nextLine();
         System.out.println("Ingrese el año de la Moto");
         int añoMoto = capturaopcion();

         motos m1 = new motos(placaMoto, nombreDueño, modeloMoto,añoMoto );
     
         System.out.println(" " );
         System.out.println(m1);

         System.out.println(" --- Moto ingresada ----");
         System.out.println(" ");
         moto.add(m1);
    

    }

    private static void serviciosPrestados(String [] nombreServicio){

            System.out.println("Seleccione que va a realizar:"); 
            servicio[0] = "1. Pre-revision tecnomecanica";
            servicio[1] = "2. Alineacion y balanceo de rines ";
            servicio[2] = "3. Mantenimiento y diagnóstico especializado ";
            servicio[3] = "4. Otros...";

            for (int i = 0; i < nombreServicio.length; i++) {
                System.out.println(nombreServicio[i]);
            }
            System.out.println("Selecione el servicio a realizar:");
            int respuesta =  capturaopcion();
               
                    if (respuesta == 1){
                        System.out.println( "Listo se va a realizar una " + servicio[0]);
                        System.out.println("-----------------------------------------");
                   
                    }
                    if (respuesta == 2){
                        System.out.println( "Listo se va a realizar una " + servicio[1]);
                        System.out.println("-----------------------------------------");
                    
                    }
                    if (respuesta == 3){
                        System.out.println( "Listo se va a realizar un " + servicio[2]);
                        System.out.println("-----------------------------------------");
                    
                    }
                    if (respuesta == 4){
                        System.out.println( "Agregue sus comentarios:");
                        String opinion = sc.nextLine();
                        System.out.println("-----------------------------------------");
                      
                    
                    }
            

    }
 
    private static void mostrarMoto(){

         System.out.println("Motos");

        for (int i =0; i < moto.size (); i++){
            System.out.println("Placa. "+ moto.get(i). getPlacaMoto()) ;

        }

       
    }
    private static void registroSalida(){

        System.out.println("Ingrese el numero de placa");
        String placa =sc.nextLine();
        for (int i = 0; i < moto.size(); i++){
            if (placa.equals(moto.get(i).getPlacaMoto())){
                System.out.println("Moto encontrada:");
                System.out.println(" ");
                System.out.println("Nombre : "+ moto.get(i).getNombreDueño());
                System.out.println("Modelo: "+ moto.get(i).getModeloMoto() );
                System.out.println("**** Moto lista ****");
            }
            
            
           


        }
    }

    private static int capturaopcion(){
        return Integer.parseInt(sc.nextLine());

    }

    public static void fechas(){

        System.out.println("Fecha de Ingreso: " + sdf.format (fechaHoy));
       
    }
    

    
}







