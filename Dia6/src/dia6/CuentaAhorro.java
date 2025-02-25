package dia6;

public class CuentaAhorro extends CuentaBancaria{
    private double tasaInteres;

    public CuentaAhorro() {
    }

    public CuentaAhorro(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public CuentaAhorro(double tasaInteres, String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
    
    /*public void aplicarInteres(){
        saldo = saldo + (saldo * tasaInteres/100);
    }
    
    public double verSaldo(){
        return saldo;
    }*/
}
