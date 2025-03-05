package SOLID_ISP;
/**
 *
 * @author María Lizarazo
 */
public class Bad {
    // Interface Segregation Principle (ISP) - Principio de segregación de interfaz.
    // Las interfaces deben ser específicas y no forzar a una clase a implementar métodos que no necesita.
    interface Worker{
        void work();
        void eat();
    }
    
    class Robot implements Worker {
        public void work(){
            System.out.println("Trabajando...");
        }
        
        public void eat(){
            throw new UnsupportedOperationException("¡Un robot no come!");
        }
    }
    
    // El robot no necesita el método eat(),
    // pero la interfaz lo obliga a implementarlo.
}
