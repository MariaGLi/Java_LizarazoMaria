package dia5;

public class Hospital {
    int id;
    String nombreH;
    String disponibilidadH;

    public Hospital(int id, String nombreH, String disponibilidadH) {
        this.id = id;
        this.nombreH = nombreH;
        this.disponibilidadH = disponibilidadH;
    }

    @Override
    public String toString() {
        return id + ". " + " Nombre: " + nombreH + " - Disponibilidad: " + disponibilidadH;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreH() {
        return nombreH;
    }

    public void setNombreH(String nombreH) {
        this.nombreH = nombreH;
    }

    public String getDisponibilidadH() {
        return disponibilidadH;
    }

    public void setDisponibilidadH(String disponibilidadH) {
        this.disponibilidadH = disponibilidadH;
    }
}
