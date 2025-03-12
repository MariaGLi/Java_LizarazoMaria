package hilos;

public class HiloUno extends Thread {
    //Cuando se hace con este  método (extends) queda bloqueada 
    //para otro tipo de extención.
    @Override
    public void  run(){
        System.out.println("Hola desde hilo uno.");
    }
}
