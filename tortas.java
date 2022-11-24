public class tortas {

    public tortas(  int porciones, String sabor, String cobertura, String relleno, int precio){

    
        this.porciones = porciones;
        this.sabor = sabor;
        this.cobertura = cobertura;
        this.relleno = relleno;
        this.precio = precio;
       
    }
  
    

    private String sabor;

    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    private String cobertura;
    public String getCobertura() {
        return cobertura;
    }
    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }
    private String relleno;
    public String getRelleno() {
        return relleno;
    }
    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }
    private int porciones;
    public int getPorciones() {
        return porciones;
    }
    public void setPorciones(int porciones) {
        this.porciones = porciones;
    }
    private int precio;
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
      return "Tortas " +  porciones + " " + sabor + " "  + cobertura + " "  + relleno + " " + precio;
    }


}
