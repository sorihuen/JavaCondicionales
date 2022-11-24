import java.util.Scanner;

public class Tema1 {
   private Scanner sc = new Scanner(System.in);

    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void Edades(){
        clearScreen();
        System.out.println("*** Evaluar Edad ***");
        System.out.println(" ");
        solicitarEdad();
         edad = leerDato();
         System.out.println("");
         evaluarEdad();
         System.out.println("");
         System.out.println("--------------------------");


    }
    private static void clearScreen(){
        System.out.print("\033[H\033[2J");
         System.out.flush();
     


    }

    private void solicitarEdad(){


        System.out.println( "Por favor Ingese su edad:");
    }

    private int leerDato(){
        return sc.nextInt();

    }
    private void evaluarEdad(){
        if(edad >= 18){
            System.out.println("Usted es mayor de edad");
            
        
        }else{
            System.out.println("No es mayor de edad");
        }

    

    }


}
