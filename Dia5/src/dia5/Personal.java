package dia5;

public class Personal {
    int id;
    String nombre;
    String cargo;
    String fecha_vinculacion;
    String salario;
    String telefono;
    String direccion;

    public Personal(int id, String nombre, String cargo, String fecha_vinculacion, String salario, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.fecha_vinculacion = fecha_vinculacion;
        this.salario = salario;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return id + ". " +  " Nombre: " + nombre + " - Cargo: " + cargo + " - Fecha de vinculación: " + fecha_vinculacion + " - Salario: " + salario + " - Telefono: " + telefono + " - Direccion: " + direccion;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFecha_vinculacion() {
        return fecha_vinculacion;
    }

    public void setFecha_vinculacion(String fecha_vinculacion) {
        this.fecha_vinculacion = fecha_vinculacion;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
