package dia5;

public class Pabellon {
    int id;
    String nombre;
    String disponibilidad;

    public Pabellon(int id, String nombre, String disponibilidad) {
        this.id = id;
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return id + ". " + " Nombre: " + nombre + " - Disponibilidad: " + disponibilidad;
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

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
