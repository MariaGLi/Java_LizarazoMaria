package modelo;

public class Persona {
    int id;
    String nombre;
    String apellido;
    String cel;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, String cel) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cel = cel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }
    
}
