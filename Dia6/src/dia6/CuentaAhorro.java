package dia6;

public class CuentaAhorro extends CuentaBancaria{
    private double tasaInteres;

    public CuentaAhorro() {
    }

    public CuentaAhorro(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public CuentaAhorro(double tasaInteres, String numeroCuenta, int saldo) {
        super(numeroCuenta, saldo);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(int tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
    
    public void aplicarInteres(){
        saldo = saldo + (saldo * tasaInteres/100);
        System.out.println("El interes aplicado es: " + saldo);
    }
    
    public void verSaldo(){
        System.out.println("El estado final de la cuenta es: N° de cuenta - " + numeroCuenta + " y saldo final de la cuenta - " + saldo);
    }
}
