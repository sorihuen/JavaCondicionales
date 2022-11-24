import java.util.Scanner;

public class Main {
    
    public static void main (String[] args){
       
        boolean respuesta= true;
        int opcion;
        clearScreen();

        do{
            menu();
            opcion = capturaopcion();
            clearScreen();
             respuesta = evaluaropcion(opcion);
          

        

        } while(respuesta == true);

    }
    private static void menu(){

        System.out.println("Seleccione un tema del Taller");
        System.out.println("1. Tema [1]: ***** Edades *****");
        System.out.println("2. Tema [2]: ***** Menor de 18 ****");
        System.out.println("3. Tema [3]: *** Mayor o menor de Edad ***");
        System.out.println("4. Tema [4]: **** Video Tienda Porvenir ***");
        System.out.println("5. Tema [5]: **** Drogueria Mi Salud ***");
        System.out.println("6. Tema [6]: **** Taller de motos El Maquinista ***");
        System.out.println("7. Tema [7]: **** Calcular IMC ***");
        System.out.println("8. Tema [8]: **** Pasteleria Don Carlos ***");
        System.out.println("9. Tema [9] : **** Figuras Geometricas ****");
        System.out.println("10.Tema [10] : **** Su Banco Fiel ****");
        System.out.println("0. Salir del taller");
       

    }
    
    private static int capturaopcion(){
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());

    }
    private static void clearScreen(){
        System.out.print("\033[H\033[2J");
         System.out.flush();
     


    }

    private static boolean evaluaropcion(int opcion){

        switch(opcion){
            case 1:
                Tema1 t1 = new Tema1();
                t1.Edades();
                return true;
            case 2:
                Tema2 t2 = new Tema2();
                t2.Niño();
                return true;
            case 3:
                Tema3 t3= new Tema3();
                t3.mayorMenor();
                 return true;

            case 4:
                Tema4 t4 = new Tema4();
                t4.VideoTienda();
                return true;

            case 5:
                Tema5 t5 = new Tema5();
                t5. Drogueria();
                return true;
            case 6:
                Tema6 t6 = new Tema6();
                t6. motocicletas();
                return true;
            case 7:
                Tema7 t7 = new Tema7();
                t7.Indice();
                return true;
            case 8 :

                 Tema8 t8 = new Tema8();
                 t8.Pasteleria();
                 return true;

            case 9:
                Tema9 t9 = new Tema9();
                t9.Figuras() ;
                return true;
            case 10:
                Tema10 t10 = new Tema10();
                t10.Banco();
                return true;


            case 0:
                  return false;
            default:
            System.out.println("---------- Opcion Invalida --------");
            
        }
        return true;
    }








}