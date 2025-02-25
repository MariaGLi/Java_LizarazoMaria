package herencia_polimorfismo;
/**
 *
 * @author María Lizarazo
 */
public class Herencia_Polimorfismo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //herencia
        Perro perro1 = new Perro("Sacha");
        System.out.println(perro1.nombreCientifico);
        perro1.hacerSonido();
        perro1.moverCola();
        
        // polimorfismo
        //Creamos una variable llamada 'miAnimal' de tipo animal, pero se les asigna
        //un objeto de la subclase 'Perro'
        Animal miAnimal = new Perro("Suzy");// Tiempo de ejecución
        // En Java una subclase es un tipo de la superclase. Dicho eso, 'Perro' es un 'Animal'.
        
        // Aunque la variable es de tipo "Animal" se invoca el metodo sobreescrito en Perro.
        // Al momento de llamar 'miAnimal.hacerSonido', el método que se ejecuta es el de la clase
        // 'Perro', no el de 'Animal'. Esto se debe a que a pesar de que las variables es de tipo 'Animal',
        // el método sobreescrito en 'Perro' se invoca en tiempo de ejecución. Esto se conoce como
        //"despacho dinámico" o "vinculación tardía"
        miAnimal.hacerSonido();
        miAnimal.dormir();
        
        //Para acceder a metodos especificos de Perro, es necesario realizar un casting.
        if (miAnimal instanceof Perro) {
            Perro miPerro = (Perro) miAnimal;
            miPerro.moverCola();
        }
    }
    
}
