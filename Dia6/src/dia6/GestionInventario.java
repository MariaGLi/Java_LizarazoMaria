package dia6;

public class GestionInventario {
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;

    public GestionInventario() {
    }

    public GestionInventario(String codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if(cantidad >= 0){
            this.cantidad = cantidad;
        } else{
            System.out.println("La cantidad no puede ser negativa.");
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio > 0){
            this.precio = precio;
        } else{
            System.out.println("El precio no es válido, debe ser mayor a cero.");
        }
    }
    
    public void mostrarInfo(){
        System.out.println("Código: " + codigo + " Nombre: " + nombre + " Cantidad: " + cantidad + " Precio: " + precio);
    }
    
    public void actualizarStock(int cantidad){
        if(this.cantidad + cantidad > 0){
            this.cantidad += cantidad;
            System.out.println("Stock actualizado, ahora tienes " + this.cantidad  + " en el stock.");
        } else{
            System.out.println("Ojo, no hay suficiente stock para realizar esta operación.");
        }
    }
    
    public void mostrarInfoStock() {
        System.out.println("Nombre: " + nombre + ", Cantidad: " + cantidad);
    }
}
