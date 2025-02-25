package herencia_polimorfismo;

public class Animal {
    //Atributos
    protected String nombreCientifico;
    protected String especie;
    protected String habitat;
    protected boolean tienePelo;
    protected int cantPatas;

    //Constructor vacío y compuesto.
    public Animal() {
    }

    public Animal(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public Animal(String nombreCientifico, String especie, String habitat, boolean tienePelo, int cantPatas) {
        this.nombreCientifico = nombreCientifico;
        this.especie = especie;
        this.habitat = habitat;
        this.tienePelo = tienePelo;
        this.cantPatas = cantPatas;
    }
    
    //Método para todos los animales.
    public void hacerSonido(){
        System.out.println("El animalito hace un sonido");
    }
    
    public void dormir(){
        System.out.println("Estoy durmiendo");
    }
}
