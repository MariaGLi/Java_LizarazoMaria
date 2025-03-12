package Explicacion3;

public class PingPongSincronizado extends Thread{
    private String word;
    
    public PingPongSincronizado(String s) {
        word=s;
    }
    
    public void run(){
        synchronized (getClass()) { //Para entrar por aquí tenemos que conseguir
        // el bloqueo intrínseco de la clase PingPongSincronizado.
            
            for (int i = 0; i < 3000; i++) {
                System.out.println(word);
                System.out.flush();
                getClass().notifyAll(); // Avisar a todos que ha terminado.
                try{
                    getClass().wait(); // Se espera el aviso.
                }
                catch(InterruptedException e){}
                getClass().notifyAll();
            }
            
        }
    }
}
