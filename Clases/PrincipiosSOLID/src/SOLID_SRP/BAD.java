package SOLID_SRP;
/**
 *
 * @author María Lizarazo
 */
public class BAD {
    // 1. El Single Responsibility Principle (BAD) - Principio de responsabilidad única.
    // una clase debe tener una única razón para cambiar, es decir, 
    // debe encargarse de una sola responsabilidad. 
    class Report{
        public void generateReport(){
            //Genera un informe
        }
        
        public void saveToFile(String filename){
            // Guarda el informe en un archivo (Violación de SRP)
        }
        
        //¿Qué está mal? La clase Report tiene dos responsabilidades:
        // Generar el informe y guardarlo en un archivo.
    }
}
