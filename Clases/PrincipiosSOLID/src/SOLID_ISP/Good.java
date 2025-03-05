package SOLID_ISP;

public class Good {
    interface Workable{
        void work();
    }
    interface Eatable{
        void eat();
    }
    
    class Human implements Workable, Eatable{
        public void work(){
            System.out.println("Trabajando...");
        }
        
        public void eat(){
            System.out.println("¡Un robot no come!");
        }
    }
    
    class Robot implements Workable{
        public void work(){
            System.out.println("Trabajando...");
        }
    }
}
