package dia7;

public class Moto extends Vehiculo {
    private String tipoManubrio;

    public Moto() {
    }

    public Moto(String tipoManubrio) {
        this.tipoManubrio = tipoManubrio;
    }

    public Moto(String tipoManubrio, String marca, String modelo) {
        super(marca, modelo);
        this.tipoManubrio = tipoManubrio;
    }
    
    @Override
    public void mostrarDetalles(){
        System.out.println("La moto de marca " + marca + " tiene un manubrio " + tipoManubrio + " y su modelo es " + modelo);
    }
}
