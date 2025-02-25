package encapsulamiento;

public class Persona {
    //Atributos
    private String nombre;
    private int edad;

    //Constructores
    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad > 0){
            this.edad = edad;
        } else{
            System.out.println("La edad no es válida. Pues debe ser mayor a cero.");
        }
    }
    
}
