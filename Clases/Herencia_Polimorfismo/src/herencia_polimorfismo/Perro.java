package herencia_polimorfismo;

public class Perro extends Animal {
    //Atributos
    private String raza;
    private int edad;
    private String sexo;
    
    public Perro(String nombreCientifico) {
        super(nombreCientifico);
    }
    
    public Perro(String nombreCientifico, String especie, String habitat, boolean tienePelo, int cantPatas) {
        super(nombreCientifico, especie, habitat, tienePelo, cantPatas);
    }
    
    public Perro(String raza, int edad, String sexo) {
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Perro(String raza, int edad, String sexo, String nombreCientifico, String especie, String habitat, boolean tienePelo, int cantPatas) {
        super(nombreCientifico, especie, habitat, tienePelo, cantPatas);
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
    }

    @Override // Anotaciones que sirven solo para un método. (Inicio método)
    public void hacerSonido() {
        System.out.println("Mi perra " + nombreCientifico + " dice ¡GUAU!");
    }
    //(Fin método)
    
    public void moverCola(){
        System.out.println("Mi perrita " + nombreCientifico + " mueve su colita cada vez que me ve.");
    }
}
