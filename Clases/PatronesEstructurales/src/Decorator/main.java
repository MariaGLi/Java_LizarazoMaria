package Decorator;
/**
 *Decorator (Decorador)
 * Añade funcionalidades a un objeto sin modificar su estructura.
 * 
 * Ejemplo: Agg carácterísticas extra a un café.
 */
public class main {
    // Componente base
    interface Coffee{
        String getDescription();
        double cost();
    }
    
    // Implementación base
    static class SimpleCoffee implements Coffee{
        public String getDescription(){
            return "Café simple";
        }
        public double cost(){
            return 5.0;
        }
    }
    
    //Decorador abstracto
    static abstract class CofeeDecorator implements Coffee{
        protected Coffee coffee;
        
        public CofeeDecorator(Coffee coffee){
            this.coffee = coffee;
        }
        
        public String getDescription(){
            return coffee.getDescription();
        }
        
        public double cost(){
            return coffee.cost();
        }
    }
    
    //Decorador concreto
    static class MilkDecorator extends CofeeDecorator{
        public MilkDecorator(Coffee coffee){
            super(coffee);
        }
        
        public String getDescription(){
            return coffee.getDescription() + ", con leche";
        }
        
        public double cost(){
            return coffee.cost() + 1.5;
        }
    }
    
    //Uso del patrón Decorador
    public static void main(String[] args) {
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.cost());
        
        myCoffee = new MilkDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.cost());
    }
}
