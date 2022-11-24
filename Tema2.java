import java.util.Scanner;

public class Tema2 {
    private Scanner sc = new Scanner(System.in);

    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void Niño(){
        clearScreen();

         System.out.println("***** Menor de 18 *****");
         System.out.println(" ");
        solicitarEdad();
        edad = leerDato();
        evaluarEdad();
        System.out.println(" ");
        System.out.println("------------------------- ");
     

    }
    private static void clearScreen(){
        System.out.print("\033[H\033[2J");
         System.out.flush();
     


    }
    private void solicitarEdad(){

        System.out.println( "Por favor Ingese su edad:");
    }
    private int leerDato(){
        return Integer.parseInt(sc.nextLine());

    }
    private void evaluarEdad(){
         
        if(edad < 18){

            System.out.println("Usted es aun un niño");
        
    
        }else{
            System.out.println("La edad no corresponde solo menor de 18");
        }

    }




}
