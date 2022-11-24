public class motos {

     public motos(){
    }
    public motos(String placaMoto , String nombreDueño, String modeloMoto, int añoMoto){

        this.placaMoto = placaMoto;
        this.nombreDueño = nombreDueño;
        this.modeloMoto = modeloMoto;
        this.añoMoto = añoMoto;
    }
    private int añoMoto;
    public int getAñoMoto() {
        return añoMoto;
    }
    public void setAñoMoto(int añoMoto) {
        this.añoMoto = añoMoto;
    }
    private String  modeloMoto;
    public String getModeloMoto() {
        return modeloMoto;
    }
    public void setModeloMoto(String modeloMoto) {
        this.modeloMoto = modeloMoto;
    }

    private String placaMoto;
    public String getPlacaMoto() {
        return placaMoto;
    }
   
    public void setPlacaMoto(String placaMoto) {
        this.placaMoto = placaMoto;
    }
    private String nombreDueño;
    public String getNombreDueño() {
        return nombreDueño;
    }
    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

 @Override
    public String toString() {
      return "motos " + placaMoto + " "  + nombreDueño + " "  + modeloMoto + " " + añoMoto;
 
    }
       public static void add(motos m1) {

    }






    
}













