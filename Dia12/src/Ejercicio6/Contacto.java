package Ejercicio6;

public class Contacto {
// Se crean las entidades 
    public String Nombre;
    public String CuentaBancaria;
    public String Email;

//  Se crea el constructor para estas entidades
    public Contacto(String Nombre, String CuentaBancaria, String Email) {
        this.Nombre = Nombre;
        this.CuentaBancaria = CuentaBancaria;
        this.Email = Email;
    }

// Se crean los Getter and Setter de las entidades
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCuentaBancaria() {
        return CuentaBancaria;
    }

    public void setCuentaBancaria(String CuentaBancaria) {
        this.CuentaBancaria = CuentaBancaria;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
}
