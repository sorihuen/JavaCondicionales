import java.util.Scanner;

public class Tema9 {

    private static Scanner sc = new Scanner(System.in);
    static int base;
    static int altura;
    static int rectangulo;
    static int baseMenor;
    static int baseMayor;
    static int triangulo;
    static int trapecio;

    
    public void Figuras() {
        int limite = 0;
       
        while(limite == 0){
            System.out.println(" Calculemos la Figura Geometrica:");
            System.out.println("  ");
            System.out.println(" Menu");
            System.out.println(" ");
            System.out.println(" Seleccione una opcion:");
            System.out.println("  ");
            System.out.println(" 1. Calcular Area del Triangulo");
            System.out.println(" 2. Calcular Area del Rectagunlo");
            System.out.println(" 3. Calcular Area del Trapecio");
            System.out.println(" 0. Salir");
            int opcion =leerOpcion();
            switch (opcion){
                case 1:
                 System.out.println(" 1. Calcular Area del Triangulo");
                 calculoTriangulo();
                break;

                case 2:
                 System.out.println(" 2. Calcular Area del Rectagunlo");
                 calculoRectangulo();
                break;

                case 3:
                 System.out.println(" 3. Calcular Area del Trapecio");
                 calculoTrapecio();
                break;

                case 0:
                System.out.println(" El Programa finalizo");
                System.out.println("--------------------------------");
                System.out.println(" ");
                limite = 1 ;
                break;

                default:
                 System.out.println(" Opcion no valida");
               



            }




        }

    }
    private static int leerOpcion(){

     return Integer.parseInt(sc.nextLine());
    
    

    }
    private static void calculoTriangulo(){

        System.out.println(" Ingrese la base");
        base =  leerOpcion();
        System.out.println("Ingrese la altura");
        altura = leerOpcion();
        triangulo = (base * altura) / 2;
        System.out.println(" El area del Triangulo es: " + triangulo);
        System.out.println("-------------------------------------");
        System.out.println(" ");


    }
    private static void calculoRectangulo(){
        
        System.out.println(" Ingrese la base");
        base =  leerOpcion();
        System.out.println("Ingrese la altura");
        altura = leerOpcion();
        rectangulo = (base * altura);
        System.out.println(" El area del Rectangulo es: " + rectangulo);
        System.out.println("-------------------------------------");
        System.out.println(" ");


    }
    private static void calculoTrapecio(){

        System.out.println(" Ingrese la base mayor");
        baseMayor =  leerOpcion();
        System.out.println(" Ingrese la base menor");
        baseMenor =  leerOpcion();
        System.out.println("Ingrese la altura");
        altura = leerOpcion();
        trapecio = (baseMayor + baseMenor) / 2 *  altura;
        System.out.println(" El area del Trapecio es: " + trapecio);
        System.out.println("-------------------------------------");
        System.out.println(" ");




    }











}
