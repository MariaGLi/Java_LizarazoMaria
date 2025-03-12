package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 *Composite (Compuesto Tarrito Rojo)
 * Permite tratar objetos individuales y composiciones de objetos de manera uniforme.
 * 
 * Ejemplo: Jerarquía de empleados.
 */
public class main {
   //Componente
    static abstract class Employee{
        protected String name;
        protected String position;
        
        public Employee(String name, String position){
            this.name = name;
            this.position = position;
        }
        
        abstract void showDetails();
    }
    
    //Hoja
    static class Developer extends Employee{
        public Developer (String name){
            super(name, "Desarrollador");
        }
        
        @Override
        void showDetails(){
            System.out.println(position + ": " + name);
        }
    }
    
    //Compuesto
    static class Manager extends Employee{
        private List<Employee> subordinates = new ArrayList<>();
        
        public Manager (String name){
            super(name, "Gerente");
        }
        
        public void addEmployee(Employee emp){
            subordinates.add(emp);
        }
        
        @Override
        void showDetails(){
            System.out.println(position + ": " + name);
            for (Employee e : subordinates) {
                e.showDetails();
            }
        }
    }
    
    //Uso del patrón Composite
    public static void main(String[] args) {
        Manager manager = new Manager("María");
        manager.addEmployee(new Developer("Jerxon"));
        manager.addEmployee(new Developer("Valentina"));
        
        manager.showDetails();
    }
}
