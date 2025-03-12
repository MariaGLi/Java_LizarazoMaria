package Explicación;

public class PingPong extends Thread {
    private String word;
    
    public PingPong(String s) {
        word=s;
    }
    
    public void run(){
        for (int i = 0; i < 3000; i++) {
            System.out.println(word);
            //System.out.flush();
        }
    }
}
