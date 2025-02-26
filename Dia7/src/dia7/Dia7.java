package dia7;
/**
 *
 * @author María Lizarazo
 */
public class Dia7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("========== Ejercicio 1 ==========");
        
        System.out.println(" ");
        System.out.println("------- Carro -------");
        Carro car = new Carro(4, "Volkswagen", "Beetle");
        Vehiculo vh = new Carro(2, "Jeep", "Wrangler Rubicon 392");
        car.mostrarDetalles();
        if (vh instanceof Carro){
            Carro miCarro = (Carro) vh;
            miCarro.mostrarDetalles();
        }
        System.out.println(" ");
        
        System.out.println("------- Moto -------");
        Moto motico = new Moto("Ape Hanger", "Harley-Davidson", "Street Glide");
        Vehiculo vh2 = new Moto("Straight Bar", "Kawasaki", "Ninja ZX-10R");
        motico.mostrarDetalles();
        if (vh2 instanceof Moto){
            Moto miMoto = (Moto) vh2;
            miMoto.mostrarDetalles();
        }
        System.out.println(" ");
        
        System.out.println("========== Ejercicio 2 ==========");
        
        System.out.println(" ");
        
    }
    
}