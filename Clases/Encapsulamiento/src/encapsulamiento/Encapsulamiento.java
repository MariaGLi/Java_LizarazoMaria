package encapsulamiento;

/**
 *
 * @author María Lizarazo
 */
public class Encapsulamiento {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre ("María\n");
        p1.setEdad(25);
        System.out.println(p1.getNombre()+ p1.getEdad());
        
        CuentaBancaria c1 = new CuentaBancaria("99082716234", 10000000.0);
        
        System.out.println(c1.getSaldo());
        
        c1.depositar(2500000);
        System.out.println(c1.getSaldo());
        
        c1.retirar(9000000);
        System.out.println(c1.getSaldo());
        
        c1.retirar(3500000);
        System.out.println(c1.getSaldo());
    }
    
}
