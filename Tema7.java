import java.util.Scanner;

public class Tema7 {

    float kg, altura, imc ;
    static float x;
    private static Scanner sc = new Scanner(System.in);

    public void Indice() {

     System.out.println(" Calculemos tu IMC:");
     System.out.println(" ");
     System.out.println(" Cual es tu peso? (kg)");
     kg = sc.nextFloat();
     System.out.println(" Cual es tu altura? (mts)(Ejemplo 1,60)");
     altura = sc.nextFloat();
     imc = altura * altura;
     x = kg/imc;
     System.out.println("Tu indice corporal es : "+ x);
     System.out.println("");
     evaluarImc();
     

    }
    private static void evaluarImc(){

        if (x<=18 ){
            System.out.println("Peso bajo, consulte a un epecialista");
            System.out.println("--------------------------------------");
            System.out.println("");
     

        }else if(x>=18 && x<=24.9){
            System.out.println("Felicidades!! Tu peso es normal");
            System.out.println("-----------------------------------");
            System.out.println("");
     

        }else if (x >= 25 && x<= 26.9) {
            System.out.println("Tienes sobrepeso, consulte a un especialista");
            System.out.println("----------------------------------------------");
            System.out.println("");
     

        }else if (x>=27 && x<=29.9){
            System.out.println("Tienes obesidad, consulte a un especialista");
            System.out.println("-----------------------------------------------");
            System.out.println("");
     

        }


    }

    

   




}