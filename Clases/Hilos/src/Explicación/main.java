package Explicación;
/**
 *@author María Lizarazo
 */


public class main{
    public static void main(String[] args) {
        Thread t1 = new PingPong("P");
        Thread t2 = new PingPong("S");
        t1.start();
        t2.start();
    }
}
