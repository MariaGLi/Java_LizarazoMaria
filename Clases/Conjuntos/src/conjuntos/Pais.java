package conjuntos;

public enum Pais {
    //Enumeradores
    // Un enumerador es una clase especial que restringe la creacion de objetos a los valores
    // especificamente definidos en su implementación.
    ESPANA("España", "Madrid"),
    FRANCIA("Francia", "París"),
    ITALIA("Italia", "Roma"),
    ALEMANIA("Alemania", "Berlín"),
    REINO_UNIDO("Reino Unido", "Lóndres");
    
    private String nombre;
    private String capital;

    private Pais(String nombre, String capital) {
        this.nombre = nombre;
        this.capital = capital;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCapital() {
        return capital;
    }
}
