package FactoryMethod;

/**
 * Factory Method
 * Este patrón define una interfaz para crear objetos, pero permite a las subclases decidir 
 * qué clase concreta instanciar. Se usa para evitar la creación directa de objetos con new.
 */

//Interfaz producto
interface Producto{
    void usar();
}

//Implementaciones Concretas
class ProductoA implements Producto{
    public void usar(){
        System.out.println("Usando Producto A.");
    }
}

class ProductoB implements Producto{
    public void usar(){
        System.out.println("Usando Producto B.");
    }
}
public class Factory{
    //Fabrica con el método Factory
    class Factory2{
        public static Producto crearProducto(String tipo){
            if(tipo.equalsIgnoreCase("A")){
                return new ProductoA();
            }
            else if(tipo.equalsIgnoreCase("B")){
                return new ProductoB();
            }
            throw new IllegalArgumentException("Tipo desconocido");
        }
    }
    
    //Uso
    public static void main (String[] args){
        try {
            Producto p1 = Factory2.crearProducto("A");
            p1.usar();

            Producto p2 = Factory2.crearProducto("B");
            p2.usar();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}