public class Cliente {
     
   

    public Cliente(String nombre, String apellido, String numIdentificacion, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numIdentificacion = numIdentificacion;
        this.cuentas = cuentas;
    }
    Cuenta cuentas[];

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

    private String numIdentificacion;
    public String getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(String numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }
    public double consultarSaldo(int indice){
        return cuentas[indice]. getSaldo();



    }
    public void ingresarDinero(int indice, double cantidad){
        cuentas[indice].depositarDinero(cantidad);


    }
    public void retirarDinero(int indice, double cantidad){
        cuentas[indice].retirarDinero(cantidad);



    }

    
    
   
}
