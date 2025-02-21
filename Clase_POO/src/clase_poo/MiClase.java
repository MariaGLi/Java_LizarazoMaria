package clase_poo;

/**
 * Declaración de la clase.
 * Se utiliza la palabra clase 'class', seguida del nombre de la clase (en este caso 'MiClase')
 * donde por convesiencia el nombre de la clase empieza con una mayúscula.
 *
 */
public class MiClase {
    /**
     * Atributos de la clase.
     * Son variables que representan caracteristicas o propiedades de las clases,
     * las cuales pueden tener datos almacenados en cada objeto de la clase.
     */
    String atributo1;
    int atributo2;
    float atributo3;
    
    /**
     * Constructores.
     * Son métodos especiales para crear e inicializar la clase sin ninguna acción.
     */
    
    // 1. Constructor vacío: Una manera de instanciar la clase sin ninguna acción.
    public MiClase(){}
    
    // 2. Costructor compuesto: una manera de instanciar la clase con uno o varios
    // de sus atributos.
    public MiClase(String atributo1, int atributo2, float atributo3){
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }
    // Métodos de la clase
    // Funciones que definen el comportamiento de la clase.
    public void metodo1(){
        // Sin parámetros y sin retorno    
    }
    
    public int metodo2(){
        // Sin parámetros y con retorno 
        return 1;
    }
    
    public void metodo3(String a){
        System.out.println(a);
        // Con parámetros y sin retorno    
    }
    
    public int metodo4(int a){
        // Con parámetros y con retorno
        return a;
    }

    //Método ToString.
    //Es un método que sobreescribe el método por default 'toString',
    //con el fin de imprimir en consola una salida personalizada.
    @Override
    public String toString() {
        return "MiClase{" + "atributo1=" + atributo1 + ", atributo2=" + atributo2 + ", atributo3=" + atributo3 + '}';
    }
    
}
