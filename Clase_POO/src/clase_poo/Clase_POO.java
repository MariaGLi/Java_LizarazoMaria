package clase_poo;

/**
 *
 * @author Uniminuto Tibu
 */
public class Clase_POO {

    //Declaración de la clase.
    //Se utiliza la palabra clase 'class', seguida del nombre de la clase (en este caso 'MiClase')
    
    public static void main(String[] args) {
        // Instancia de una clase == Objeto.
        MiClase m1 = new MiClase();
        
        //Asignacion de atributos.
        m1.atributo1 = "T2";
        m1.atributo2 = 20;
        m1.atributo3 = (float) 13.5;
        
        System.out.println(m1);
    }
    
}
