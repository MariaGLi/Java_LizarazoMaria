package dia7;

public class Carro extends Vehiculo {
    private int numeroPuertas;

    public Carro() {
    }
    
    public Carro(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    public Carro(String marca){
        this.marca = marca;
    }

    public Carro(int numeroPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("El carro de marca " + marca + " tiene " + numeroPuertas + " puertas y es de modelo " + modelo);
    }
}
