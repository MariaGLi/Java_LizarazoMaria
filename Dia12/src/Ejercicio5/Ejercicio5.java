package Ejercicio5;
//Pasamos el código de C# a Java

public class Ejercicio5 {

    public interface IOadEscritura { 
//Se separa la interfaz y se declara una interfaz solo para escritura.
        void Insert(Object entity);
// Se define un metodo para insertar una entidad de tipo Object, lo que nos dice que puede ser cualquier tipo de objeto.
        void Update(Object id, Object entity);
// Se define un metodo para actualizar una entidad de tipo Object según su ID 
        void Delete(Object id);
// Se define un metodo para eliminar una entidad de tipo Object según su ID
    }
    public interface IOadLectura {
        // Y una interfaz solo para lectura
        Object[] GetAll(); 
// Define un metodo que nos permitira obtener todas las entidades y nos devolvera una lista de objetos.
        Object GetById(Object id);
// Define un metodo que nos permitira obtener la entidad por su ID y nos devolvera un objeto.
    }

    public abstract class FacturaOadDatosReadOnly implements IOadLectura {
// Declaramos una clase abstracta
        public Object[] getAll() {
            // Este metodo nos permitira obtener todas las facturas
            return null;// Nos retorna null porque no hay datos aún.
        }

        public Object getById(Object id) {
            // Este metodo nos permitira obtener la factura por su ID
            return null;// Nos retorna null porque no hay datos aún.
        }        
    }
}