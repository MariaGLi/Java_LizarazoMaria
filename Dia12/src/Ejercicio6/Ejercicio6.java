package Ejercicio6;

//Se separa la interfaz de la clase contacto con el fin de que cada clase tenga
//una única responsabilidad.

// Se crea la interfaz que nos permitirá enviar el correo.
    public interface Ejercicio6 {
        void Enviar(Contacto contacto, String cuerpoMensaje);
    }
