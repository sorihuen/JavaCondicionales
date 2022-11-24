import java.util.Scanner;

public class peliculas {

    private Scanner sc = new Scanner(System.in);

    public peliculas(){
    }
    public peliculas(int num, String nombrePelicula, String tipoPelicula, String sinopsisPelicula){
        this.num = num;
        this.nombrePelicula = nombrePelicula;
        this.tipoPelicula = tipoPelicula;
        this.sinopsisPelicula = sinopsisPelicula;
    }
    private int num;
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    
    private String nombrePelicula;
    public String getNombrePelicula() {
        return nombrePelicula;
    }
    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }
    private String tipoPelicula;
    public String getTipoPelicula() {
        return tipoPelicula;
    }
    public void setTipoPelicula(String tipoPelicula) {
        this.tipoPelicula = tipoPelicula;
    }
    private String sinopsisPelicula;
    public String getSinopsisPelicula() {
        return sinopsisPelicula;
    }
    public void setSinopsisPelicula(String sinopsisPelicula) {
        this.sinopsisPelicula = sinopsisPelicula;
    }

    void movie(){
        int opcion;
        String [] nombrePeliculas = new String [3];
        nombrePeliculas [0]= "1. Titanic";
        nombrePeliculas [1]= "2. La vida es Bella";
        nombrePeliculas [2]= "3. Pixeles";
        for(int i = 0; i < nombrePeliculas.length;i++){
            System.out.println(nombrePeliculas[i]);
        }
    
        System.out.println("Seleccione una opcion");
        opcion = leerDato();

        
            for(int i = 0; i < 1; i++){
                if (opcion == 1){
                 System.out.println("Su seleccion es:");
                 System.out.println(nombrePeliculas[0] + " Disponible");
                 System.out.println(" Disfrute su pelicula, Gracias por preferirnos. !!");             
                 System.out.println(" ");
                }
            }
           
    
            for(int i = 0; i < 1;i++){
                if (opcion == 2){
                 System.out.println("Su seleccion es:");
                 System.out.println(nombrePeliculas[1] + " Disponible");
                 System.out.println(" Disfrute su pelicula, Gracias por preferirnos. !!");
                 System.out.println(" ");
                }
            }
        
            for(int i = 0; i < 1 ;i++){
                if (opcion == 3){
                 System.out.println("Su seleccion es:");
                 System.out.println(nombrePeliculas[2] + " Disponible");
                 System.out.println(" Disfrute su pelicula, Gracias por preferirnos. !!");
                 System.out.println(" ");

                }
            }
        }


    
    
    private int leerDato(){
        return Integer.parseInt(sc.nextLine());

    }
    @Override
    public String toString() {
      return "Peliculas " + num + " "  + nombrePelicula + " "  + tipoPelicula + " " + sinopsisPelicula;
    }



}
  
    

       

















