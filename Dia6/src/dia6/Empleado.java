package dia6;

public class Empleado {
    private int id;
    private String nombre;
    private double salario;

    public Empleado() {
    }

    public Empleado(int id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario > 0){
            this.salario = salario;
        } else{
            System.out.println("El salario no puede ser negativo.");
        }
    }
    public void mostrarInformacion(){
        System.out.println(id + ". " + "Nombre: " + nombre + " Salario: " + salario);
    }
    
}