package SOLID_DIP;
/**
 *
 * @author María Lizarazo
 */
public class Bad {
    // Dependency Inversion Principle (DIP) - Principio de inversión de dependencias.
    // Inversión de dependencias.
    // Las clases deben depender de abstracciones en lugar de depender directamente de clases concretas.
    
    class MySQLDatabase{
        public void connect(){
            System.out.println("Conectando a MYSQL...");
        }
    }
    
    class DataManager{
        private MySQLDatabase database;
        
        public DataManager(){
            this.database = new MySQLDatabase(); // Acoplamiento fuerte.
        }
        
        public void connect(){
            database.connect();
        }
    }
    //¿Qué está mal? - DataManager depende directamente de MySQLDatabase, lo que hace
    // difícil cambiar la base de datos.
}
