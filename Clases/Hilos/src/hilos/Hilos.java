package hilos;
/**
 *@author María Lizarazo
 */
public class Hilos {

    public static void main(String[] args) {
        System.out.println("Ejemplo 1");
        
        HiloUno uno = new HiloUno();// Para llamar el hilo
        
        System.out.println(uno.getState().name());//Para saber su estado
        uno.start();  // Para ejecutarlo
        // No se ejecuta con el metodo run porque sino, no estariamos ejecutando el hilo,
        // sino que estariamos ejecutando el método.
        
        System.out.println(uno.getState().name());
    
        System.out.println(" ");
        System.out.println("Ejemplo 2");
                
        Thread dos = new Thread(new HiloDos());
        dos.start();
    }
}
