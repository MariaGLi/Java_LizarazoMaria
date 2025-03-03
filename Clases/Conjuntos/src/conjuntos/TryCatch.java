package conjuntos;

public class TryCatch {
    //Manejo de excepciones (try-catch)
    // En Java el bloque try-catchse usa para manejar excepciones, con el fin de evitar
    // que un error detenga abruptamente la ejecución del programa.
    
    public static void main(String[] args){
        try{
            int num1 = 10;
            int num2 = 0;
            int resultado = num1 / num2;
            System.out.println("El resultado es: " + resultado);
        }
        catch (Exception e){
            System.out.println("Error: no olvide que por cero no se divide. " + e.getMessage());
        }
        finally{
            System.out.println("Fin del programa.");
        }
    }
}
