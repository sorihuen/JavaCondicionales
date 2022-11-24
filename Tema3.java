import java.util.Scanner;

public class Tema3 {

    private Scanner sc = new Scanner(System.in);
    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    private String apellido;
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
   
    private int edad;
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mayorMenor(){
        System.out.println("*** Evaluar Ingreso a la Fiesta ***");
        System.out.println(" ");
        sc = new Scanner(System.in);
        solicitarNombre();
        nombre= capturarDatos();
        solicitarApellido();
        apellido = capturarDatos();
        solicitarEdad();
        edad= leerDato();
        evaluarEdad();
        System.out.println(" ");
        System.out.println("------------------------- ");
        System.out.println(" ");
    
    }
    private void solicitarEdad(){
       System.out.println( "Por favor Ingese su edad:");
    }
    
    private void solicitarNombre(){
        System.out.println( "Por favor Ingese su nombre:");
    }

    private void solicitarApellido(){
        System.out.println( "Por favor Ingese su apellido:");
    }
    
    private int leerDato(){
        return sc.nextInt();
    }
    
    private String capturarDatos(){
        return sc.nextLine();
    }
    
    private void evaluarEdad(){
        if(edad >= 18){
            System.out.println(nombre + " Usted es mayor de edad, por lo tanto puede entrar en la fiesta ");
            
        
        }else{
            System.out.println( nombre + " " + apellido + " Usted es menor de edad, por lo tanto, no puede entrar");
            System.out.println( " a la fiesta, por favor devuelvase a su casa.");
            System.out.println(" ");
            System.out.println("-----------------------------------------------------");

        }




    }
    

}

    
    
     

     
 


