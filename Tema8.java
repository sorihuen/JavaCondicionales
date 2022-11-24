import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tema8 {

    private static Scanner sc = new Scanner(System.in);
    static List<tortas> listaTortas = new ArrayList<tortas>();
    static  ArrayList <tortas> menuTorta = new ArrayList<tortas>();
    static int [] arreglo = new int [3];
  


    public void Pasteleria() {

        boolean respuesta= true;
        int opcion;
        System.out.println("2. **** Bienvenidos a la Pasteleria Don Carlos ****");
        System.out.println(" ");

        do{
            menu();
            opcion = capturaopcion();
            
             respuesta = evaluaropcion(opcion);
          

        } while(respuesta == true);


    }
    public void menu(){
        System.out.println("Seleccione una opcion");
        System.out.println("1. Ver Menu de Tortas");
        System.out.println("2. Eleccion del Menu");
        System.out.println("3. Pedidos en Sistemas");
        System.out.println("4. Ventas del dia");
        System.out.println("0. Salir del Sistema");
        System.out.println("---------------------------------------");


    }
    private static int capturaopcion(){

        return Integer.parseInt(sc.nextLine());

    }
    private static boolean evaluaropcion(int opcion){
        switch(opcion){

            case 1:
             menuTortas();

            return true;

            case 2:
             registroPedido();
            
            return true;

            case 3:
             mostrarPedido();

            return true;
            case 4:
           
             sumaVentas();

            return true;
            case 0:
             return false;

             
            default:
            System.out.println(" Opcion Invalida");

        }
        return true;


    }

     
    private static void menuTortas(){
        System.out.println("Tortas Disponibles");
        System.out.println(" ");
        listaTortas.add(new tortas( 12 , " Porciones , Chocolate", "Ganache, Caramelo,Mont Blanc",  "Frutas Mixta, Dulce de Leche, Precio ......",  6000));
        listaTortas.add(new tortas( 12 , " Porciones , Vainilla",  "Caramelo, Mont Blanc, Ganache", "Dulce de Leche, Frutas Mixtas, Precio.....",  5000));
        listaTortas.add(new tortas( 12,  " Porciones , Red Velvet","Mont Blanc, ", "Chantilly, Precio.........", 8000));
        for (int i = 0; i < listaTortas.size(); i++) {
            System.out.println(listaTortas.get(i).toString());
            System.out.println(" ");
        }
        System.out.println("----------------------------------------------------------");

    
    }
    private static void registroPedido(){

        
        System.out.println("Ingrese la cantidad de porciones ");
        int porciones = capturaopcion();
        System.out.println("Cual es sabor de la torta (Chocolate, Vainilla, Red Velvet");
        String sabor = sc.nextLine();
        System.out.println("Cobertura de la torta (Caramelo,Glaseado,frutas)");
        String cobertura = sc.nextLine();
        System.out.println("Elija el relleno (Ganache, Chantilly,Dulce de Leche)");
        String relleno = sc.nextLine();
        System.out.println("");
        System. out.println("Ingrese el precio de la porcion (Chocolate 6000, Vainilla 5000, Red Velvet 8000)");
        int precio = capturaopcion();

        
        tortas p1 = new tortas(porciones , sabor, cobertura, relleno, precio);
        System.out.println(" " );
        System.out.println(" El pedido es " + p1 + " la porcion" );
        System.out.println(" --- Pedido Recibido ----");
        System.out.println(" ");
        menuTorta.add(p1);
        calcularTotal();
        
       
    }
    private static void mostrarPedido(){

        System.out.println("Pedidos");

       for (int i =0; i < menuTorta.size (); i++){
           System.out.println("Pedido "+ menuTorta.get(i)) ;

       }
    }
    private static void sumaVentas(){
        int totalVentas = 0;

        for (int i =0; i < menuTorta.size (); i++){
            System.out.println("Tortas numero de porciones "+ menuTorta.get(i).getPorciones() + " "+ menuTorta.get(i).getSabor() + " "+ menuTorta.get(i). getPrecio() +" " + " precio por porcion") ;   
            System.out.println ("Monto total:" + arreglo[i]); 
        }
          System.out.println("Ingrese los totales:");
        for (int i =0; i<arreglo.length;i ++){
           
            System.out.println("Ventas " + (i + 1));
            arreglo[i] = capturaopcion();
            totalVentas = arreglo[0] + arreglo[1]+ arreglo[2];
        
        }
        System.out.println("Las ventas del dia es " + totalVentas);
        System.out.println(" ");
        System.out.println("-----------------------------------------");


      

    }
    private static void calcularTotal(){

        System.out.println("Ingrese el precio ");
        int precio =  capturaopcion();
        System.out.println("Ingrese la cantidad de porciones");
        int porciones =  capturaopcion();
        int subtotal =  precio * porciones;
        System.out.println("El total a cancelar es "+ subtotal);
          for (int i = 0; i< arreglo.length;i++){
            arreglo[i] = precio * porciones ++;
        
        }
        System.out.println(" ");
        System.out.println("------------------------------------");

         



    }






    
}








    

