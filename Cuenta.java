public class Cuenta {

    public Cuenta(int numeroCuenta , double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    private int numeroCuenta;
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    
    private double saldo;
   
    public double getSaldo() {
        return saldo;
    }
   
    
    public void depositarDinero(double cantidad){
        saldo  += cantidad;

    }
    public void retirarDinero(double cantidad){

        saldo -= cantidad;


    }






}
