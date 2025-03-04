package practica;

public class Practica {

    static void verificarEdad(int edad){
        if (edad < 18){
            throw new ArithmeticException("Acceso denegado, su edad debe ser mayor a 18 años");
        }
        else{
            System.out.println("Acceso autorizado.");
        }
    }
       
    public static boolean usarEdad(int edad){
        try{
            verificarEdad(edad);
            return true;
        }
        catch(Exception e){
            System.out.println("Algo salió mal. " + e);
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(usarEdad(25));
        
        try{
            verificarEdad(19);            
        }
        catch(Exception e){
            System.out.println("Algo salió mal. " + e);
        }
        try{
            int[] nums={1,2,3};
            System.out.println(nums[2]);
        }
        catch(Exception e){
            System.out.println("Algo salió mal. " + e);
        }
        finally{
            System.out.println("El programa terminó");
        }
        
        
        
    }
    
}
