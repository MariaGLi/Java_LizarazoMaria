package encapsulamiento;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public CuentaBancaria() {
    }

    //No voy a crear un setter para el numero de cuenta.
    //Razón: Para que no se modifique después de haberse creado.
    
    //Getter para el 'saldo'
    public double getSaldo() {
        return saldo;
    }
    
    //Setter personalizado para el 'saldo'
    public void depositar(double cantidad){
        if(cantidad>0){
            saldo = saldo + cantidad;
            System.out.println("El deposito fue realizado!");
        }else{
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }
    
    // Método para retirar plata con validación.
    public void retirar(double cantidad){
        if(cantidad > 0 && cantidad <= saldo){
            saldo = saldo - cantidad;
            System.out.println("Su retiro fue realizado!");
        } else if(cantidad > saldo){
            System.out.println("No tienes los fondos suficientes.");
        } else{
            System.out.println("Por favor debes ingresar una cantidad válida.");
        }
    }
}
