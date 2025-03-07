package AbstractFactory;

/**
 * Abstract Factory
 * Proporciona una interfaz para crear familias de objetos sin especificar
 * sus clases concretas. Se usa cuando hay múltiples variantes de productos.
 */

// Interfaces de productos
interface Boton{
    void render();
}

interface Ventana{
    void abrir();
}

//Interfaz para la fábrica abstracta
interface GUIFactory{
    Boton crearBoton();
    Ventana crearVentana();
}

public class main{
    //Implementaciones concretas para Windows
    static class BotonWindows implements Boton{
        public void render(){
            System.out.println("Renderizando botón estilo Windows.");
        }
    }
    
    static class VentanaWindows implements Ventana{
        public void abrir(){
            System.out.println("Abriendo ventana estilo Windows.");
        }
    }   
    
    //Implementaciones concretas para Mac
    static class BotonMac implements Boton{
        public void render(){
            System.out.println("Renderizando botón estilo Mac.");
        }
    }
    
    static class VentanaMac implements Ventana{
        public void abrir(){
            System.out.println("Abriendo ventana estilo Mac.");
        }
    }
    
    // Fábricas concretas
    static class WindowsFactory implements GUIFactory{
        public Boton crearBoton(){
            return new BotonWindows();
        }
        
        public Ventana crearVentana(){
            return new VentanaWindows();
        }
    }
    
    static class MacFactory implements GUIFactory{
        public Boton crearBoton(){
            return new BotonMac();
        }
        
        public Ventana crearVentana(){
            return new VentanaMac();
        }
    }
    
    //Uso
    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory();
        Boton boton = factory.crearBoton();
        Ventana ventana = factory.crearVentana();
        
        GUIFactory factory2 = new MacFactory();
        Boton boton2 = factory2.crearBoton();
        Ventana ventana2 = factory2.crearVentana();
        
        boton.render();
        ventana.abrir();
        System.out.println(" ");
        boton2.render();
        ventana2.abrir();
        
    }
}

