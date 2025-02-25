package dia6;

/**
 *
 * @author María Lizarazo
 */
public class Dia6 {
    public static void main(String[] args) {
        //Ejercicio 1
        System.out.println("------- Ejercicio 1 -------");
        Empleado em = new Empleado(1, "María", 2500000);
        em.setSalario(0);
        em.mostrarInformacion();
        System.out.println(" ");
        
        //Ejercicio 2
        System.out.println("------- Ejercicio 2 -------");
        GestionInventario gesInv = new GestionInventario("P001", "Laptop", 10, 1500000);
        GestionInventario gesInv2 = new GestionInventario("P002", "Bafles", 20, 500000);
        GestionInventario gesInv3 = new GestionInventario("P001", "Cables", 30, 50000);
        
        gesInv.mostrarInfo();
        gesInv2.mostrarInfo();
        gesInv3.mostrarInfo();
        System.out.println(" ");
        gesInv.actualizarStock(7);
        gesInv2.actualizarStock(-30);
        gesInv3.actualizarStock(3);
        System.out.println(" ");
        
        // Ejercicio 3
        System.out.println("------- Ejercicio 3 -------");
        CuentaBancaria cb = new CuentaBancaria("124D57MGLL\n", 1700000);
        System.out.println(cb.getNumeroCuenta() + cb.getSaldo());
        CuentaAhorro ca = new CuentaAhorro(5, "124D57MGLL", 1500000);
        ca.aplicarInteres();
        ca.verSaldo();
    }
    
}
