package dia7;

public class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo() {
    }
        
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarDetalles (){
        System.out.println("La marca del vehículo es: " + marca + ".\n" + "El modelo del vehículo es: " + modelo);
    }
}
