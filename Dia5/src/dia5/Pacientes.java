package dia5;

public class Pacientes {
    int id;
    String nombre;
    String fecha_nacimiento;
    String hospital_asociado;
    String fecha_ingreso;

    public Pacientes(int id, String nombre, String fecha_nacimiento, String hospital_asociado, String fecha_ingreso) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.hospital_asociado = hospital_asociado;
        this.fecha_ingreso = fecha_ingreso;
    }

    @Override
    public String toString() {
        return id + ". " + " Nombre: " + nombre + " - Fecha de nacimiento: " + fecha_nacimiento + " - Hospital asociado: " + hospital_asociado + " - Fecha de ingreso: " + fecha_ingreso;
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

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getHospital_asociado() {
        return hospital_asociado;
    }

    public void setHospital_asociado(String hospital_asociado) {
        this.hospital_asociado = hospital_asociado;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
}
