
public class productos {

    public productos(){
    }
    public productos (int num, String nombreProducto, String dominioProducto, String precio){
        this.num = num;
        this.nombreProducto = nombreProducto;
        this.dominioProducto = dominioProducto;
        this.precio = precio;
    }
    int num;
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    String nombreProducto;
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    String dominioProducto;
    public String getDominioProducto() {
        return dominioProducto;
    }
    public void setDominioProducto(String dominioProducto) {
        this.dominioProducto = dominioProducto;
    }
    String precio;
    public String getPrecio() {
        return precio;
    }
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
      return "productos " + num + " "  + nombreProducto + " "  + dominioProducto + " " + precio;
    }



}
