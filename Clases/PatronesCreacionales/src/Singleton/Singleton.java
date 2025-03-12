package Singleton;

//Singleton
// Garantiza que solo haya una instancia de una clase en todo el programa
public class Singleton {
    private static Singleton instancia;

    private Singleton() {} // Constructor privado

    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    public void mostrarMensaje() {
        System.out.println("Instancia unica de singleton");
    }

    // uso
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstancia();
        Singleton s2 = Singleton.getInstancia();

        s1.mostrarMensaje();
        
        System.out.println(s1 == s2); // true, la misma instancia
    }
}
